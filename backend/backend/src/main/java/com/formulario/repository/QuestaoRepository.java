package com.formulario.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.formulario.model.Questao;

@Repository
public interface QuestaoRepository extends JpaRepository<Questao, Long> {
    List<Questao> findByTopic(String topic);
    List<Questao> findByNivel(String nivel);
    List<Questao> findByTopicAndNivel(String topic, String nivel);
}