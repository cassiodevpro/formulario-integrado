import { Component } from '@angular/core';
import { FormGroup } from '@angular/forms';
import { FormBuilder, Validators } from '@angular/forms';
import { Router } from '@angular/router';
@Component({
  selector: 'app-form-add-questoes',
  templateUrl: './form-add-questoes.component.html',
  styleUrls: ['./form-add-questoes.component.scss']
})
export class FormAddQuestoesComponent {


  questoeForm: FormGroup;

  niveis = ['Fácil', 'Médio', 'Difícil'];
  alternativas = ['A', 'B', 'C', 'D', 'E'];

  constructor

  (private fb: FormBuilder,
    private router: Router
  ) {
    this.questoeForm = this.fb.group({
  id: [{ value: '', disabled: true }],
      topico: ['', Validators.required],
      textoQuestao: ['', Validators.required],
      instrucao: ['', Validators.required],
      alternativaA: ['', Validators.required],
      alternativaB: ['', Validators.required],
      alternativaC: ['', Validators.required],
      alternativaD: ['', Validators.required],
      alternativaE: [''],
      explicacaoCorreta: ['', Validators.required],
      respostaCorreta: ['', Validators.required],
      explicacaoIncorreta: [''],
      respostaIncorreta: [''],
      nivel: ['', Validators.required],
      comentario: ['']
    });
  }


  salvar() {
    if (this.questoeForm.valid) {
      // Lógica para salvar a questão
      console.log('Questão salva:', this.questoeForm.value);
      // Resetar formulário ou exibir mensagem de sucesso if needed
    }
  }

  limpar() {
    this.questoeForm.reset();
  }

 listar() {
  this.router.navigate(['/questoes']);
}

  consultarPorId() {
    // Lógica para consultar questão por ID
    console.log('Consultar por ID');
  }

  editar() {
    // Lógica para editar questão existente
    console.log('Editar questão');
  }

  excluir() {
    // Lógica para excluir questão
    console.log('Excluir questão');
  }

}
