package br.com.org.getlinea.school.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "materia")
public @Data class Materias {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_materia")
    private String nomeMateria;

    @Column(name = "materia_nota")
    private  Double materiaNota;

    @Column(name = "cpf_aluno")
    private int cpfAluno;

    @Column(name = "cpf_professor")
    private int cpfProfessor;

}
