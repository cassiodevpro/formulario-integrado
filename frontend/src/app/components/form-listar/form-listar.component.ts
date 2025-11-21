import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Questoes } from 'src/app/types/Questoes';

@Component({
  selector: 'app-form-listar',
  templateUrl: './form-listar.component.html',
  styleUrls: ['./form-listar.component.scss']
})
export class FormListarComponent {



  Questoes: Questoes[] = [
    {
      id: 1,
      topico: 'Matemática',
      textoQuestao: 'Qual é a fórmula para calcular a área de um círculo?',
      instrucao: 'Escolha a alternativa correta.',
      alternativaA: 'A = πr²',
      alternativaB: 'A = 2πr',
      alternativaC: 'A = πd',
      alternativaD: 'A = r²',
      respostaCorreta: 'A',
      nivel: 'Fácil',
      comentario: 'A fórmula correta para a área de um círculo é A = πr², onde r é o raio do círculo.'
    },
    {
      id: 2,
      topico: 'História',
      textoQuestao: 'Quem foi o primeiro presidente dos Estados Unidos?',
      instrucao: 'Escolha a alternativa correta.',
      alternativaA: 'Thomas Jefferson',
      alternativaB: 'Abraham Lincoln',
      alternativaC: 'George Washington',
      alternativaD: 'John Adams',
      respostaCorreta: 'C',
      nivel: 'Médio',
      comentario: 'George Washington foi o primeiro presidente dos Estados Unidos, servindo de 1789 a 1797.'
    }
  ];

}
