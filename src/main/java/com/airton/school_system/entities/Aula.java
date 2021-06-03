//package com.airton.school_system.entities;
//
//import javax.persistence.*;
//import java.io.Serializable;
//import java.util.Objects;
//
//@Entity
//@Table(name = "/tb_aula")
//public class Aula implements Serializable {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private String nome;
//    private String duracao;
//
//    @OneToMany
//    @JoinColumn(name = "curso_id")
//    private Curso curso;
//
//    private String topicos;
//
//    public Aula(){}
//
//    public Aula(Long id, String nome, String duracao, Curso curso, String topicos) {
//        this.id = id;
//        this.nome = nome;
//        this.duracao = duracao;
//        //this.curso = curso;
//        this.topicos = topicos;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getNome() {
//        return nome;
//    }
//
//    public void setNome(String nome) {
//        this.nome = nome;
//    }
//
//    public String getDuracao() {
//        return duracao;
//    }
//
//    public void setDuracao(String duracao) {
//        this.duracao = duracao;
//    }
//
//
//    public String getTopicos() {
//        return topicos;
//    }
//
//    public void setTopicos(String topicos) {
//        this.topicos = topicos;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Aula)) return false;
//        Aula aula = (Aula) o;
//        return getId().equals(aula.getId());
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(getId());
//    }
//}
