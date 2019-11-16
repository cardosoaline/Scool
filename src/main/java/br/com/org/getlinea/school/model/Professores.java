package br.com.org.getlinea.school.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "professor")
public @Data class Professores {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

    @Column(name = "nome_professor")
    private String nomeProfessor;

    @Column(name = "materia")
    private String materia;

    @Column(name = "endereco")
    private String endereco;

    @Column(name = "telefone")
    private String telefone;

    @Column(name = "cpf")
    private int cpf;


}
