package br.com.org.getlinea.school.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "aluno")
public @Data class Alunos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nome_aluno")
    private String nomeAluno;

   @DateTimeFormat(pattern = "dd/MM/yyyy")
   private Date dataNascimento;

   @Column(name = "nome_pai")
   private String nomePai;

   @Column(name = "nome_mae")
   private String nomeMae;

   @Column(name = "serie_cursada")
   private String serie_cursada;

   @Column(name = "endereco")
   private String endereco;

   @Column(name = "cpf")
   private int cpf;

   @Column(name = "telefone_emergencia")
   private String telefoneEmergencia;


}
