package com.formulario.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formulario.model.Questao;
import com.formulario.repository.QuestaoRepository;

@Service
public class QuestaoService {

    @Autowired
    private QuestaoRepository repository;

    public Questao save(Questao questao) {
        return repository.save(questao);
    }

    public List<Questao> findAll() {
        return repository.findAll();
    }

    public Optional<Questao> findById(Long id) {
        return repository.findById(id);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public List<Questao> filter(String topic, String nivel) {
        if (topic != null && nivel != null) {
            return repository.findByTopicAndNivel(topic, nivel);
        } else if (topic != null) {
            return repository.findByTopic(topic);
        } else if (nivel != null) {
            return repository.findByNivel(nivel);
        } else {
            return repository.findAll();
        }
    }
}