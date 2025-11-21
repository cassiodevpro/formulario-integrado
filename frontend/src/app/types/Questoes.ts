export interface Questoes {
  id: number;
  topico: string;
  textoQuestao: string;
  instrucao: string;
  alternativaA: string;
  alternativaB: string;
  alternativaC: string;
  alternativaD: string;
  alternativaE?: string;
  respostaCorreta: string;
  nivel: string;
  comentario?: string;
}
