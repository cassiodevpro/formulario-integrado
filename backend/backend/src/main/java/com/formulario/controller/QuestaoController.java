package com.formulario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.formulario.model.Questao;
import com.formulario.services.QuestaoService;

@RestController
@RequestMapping("/api/questoes")
@CrossOrigin // habilita CORS para integração Angular
public class QuestaoController {

    @Autowired
    private QuestaoService service;

    @PostMapping
    public ResponseEntity<?> create(@Valid @RequestBody Questao questao) {
        // Validação customizada
        if (!"A".equals(questao.getCorrectAnswer()) && !"B".equals(questao.getCorrectAnswer())
         && !"C".equals(questao.getCorrectAnswer()) && !"D".equals(questao.getCorrectAnswer())
         && !"E".equals(questao.getCorrectAnswer())) {
            return ResponseEntity.badRequest().body("Resposta correta deve ser A, B, C, D ou E");
        }
        return ResponseEntity.ok(service.save(questao));
    }

    @GetMapping
    public List<Questao> list(
        @RequestParam(required = false) String topic,
        @RequestParam(required = false) String nivel,
        @RequestParam(required = false) Long id
    ) {
        if (id != null) {
            return service.findById(id).map(List::of).orElse(List.of());
        }
        return service.filter(topic, nivel);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Questao> getById(@PathVariable Long id) {
        return service.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Questao> update(@PathVariable Long id, @Valid @RequestBody Questao questao) {
        return service.findById(id)
            .map(existing -> {
                questao.setId(id);
                return ResponseEntity.ok(service.save(questao));
            })
            .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if(service.findById(id).isPresent()) {
            service.deleteById(id);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }

    @PatchMapping("/{id}/comentario")
    public ResponseEntity<Questao> updateComment(@PathVariable Long id, @RequestBody String comment) {
        return service.findById(id)
            .map(questao -> {
                questao.setComment(comment);
                return ResponseEntity.ok(service.save(questao));
            })
            .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/{id}/responder")
    public ResponseEntity<?> responder(
        @PathVariable Long id, @RequestBody String answer
    ) {
        return service.findById(id)
            .map(questao -> {
                boolean correct = questao.getCorrectAnswer().equals(answer);
                String exp = correct ? questao.getExplanation_correct() : questao.getExplanation_incorrect();
                return ResponseEntity.ok(new Object() {
                    public boolean isCorrect() { return correct; }
                    public String getExplanation() { return exp; }
                });
            })
            .orElse(ResponseEntity.notFound().build());
    }
}
