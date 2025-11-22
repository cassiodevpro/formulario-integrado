package com.formulario.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
@Data
public class Questao {

     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String topic;

    @Column(columnDefinition = "TEXT")
    private String text;

    @Column(columnDefinition = "TEXT")
    private String instruction;

    private String alternative_A;
    private String alternative_B;
    private String alternative_C;
    private String alternative_D;
    private String alternative_E;

    @Column(length = 1)
    private String correctAnswer;

    @Column(columnDefinition = "TEXT")
    private String explanation_correct;

    @Column(columnDefinition = "TEXT")
    private String explanation_incorrect;

    private String nivel;

    @Column(columnDefinition = "TEXT")
    private String comment;

    public Questao() {
    } 

    public Questao(Long id, String topic, String text, String instruction, String alternative_A, String alternative_B,
            String alternative_C, String alternative_D, String alternative_E, String correctAnswer,
            String explanation_correct, String explanation_incorrect, String nivel, String comment) {
        this.id = id;
        this.topic = topic;
        this.text = text;
        this.instruction = instruction;
        this.alternative_A = alternative_A;
        this.alternative_B = alternative_B;
        this.alternative_C = alternative_C;
        this.alternative_D = alternative_D;
        this.alternative_E = alternative_E;
        this.correctAnswer = correctAnswer;
        this.explanation_correct = explanation_correct;
        this.explanation_incorrect = explanation_incorrect;
        this.nivel = nivel;
        this.comment = comment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public String getAlternative_A() {
        return alternative_A;
    }

    public void setAlternative_A(String alternative_A) {
        this.alternative_A = alternative_A;
    }

    public String getAlternative_B() {
        return alternative_B;
    }

    public void setAlternative_B(String alternative_B) {
        this.alternative_B = alternative_B;
    }

    public String getAlternative_C() {
        return alternative_C;
    }

    public void setAlternative_C(String alternative_C) {
        this.alternative_C = alternative_C;
    }

    public String getAlternative_D() {
        return alternative_D;
    }

    public void setAlternative_D(String alternative_D) {
        this.alternative_D = alternative_D;
    }

    public String getAlternative_E() {
        return alternative_E;
    }

    public void setAlternative_E(String alternative_E) {
        this.alternative_E = alternative_E;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public String getExplanation_correct() {
        return explanation_correct;
    }

    public void setExplanation_correct(String explanation_correct) {
        this.explanation_correct = explanation_correct;
    }

    public String getExplanation_incorrect() {
        return explanation_incorrect;
    }

    public void setExplanation_incorrect(String explanation_incorrect) {
        this.explanation_incorrect = explanation_incorrect;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    

}
