package com.airton.school_system.projeto_teste;

import com.airton.school_system.entities.Aluno;
import com.airton.school_system.entities.Curso;
import com.airton.school_system.entities.Professor;
import com.airton.school_system.repositorios.AlunoRepositorio;
import com.airton.school_system.repositorios.CursoRepositorio;
import com.airton.school_system.repositorios.ProfessorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class testeConfig implements CommandLineRunner {

    @Autowired //resolver associações entre a classe principal e o repository
    private ProfessorRepositorio professorRepositorio;

    @Autowired
    private AlunoRepositorio alunoRepositorio;

    @Autowired
    private CursoRepositorio cursoRepositorio;

    @Override
    public void run(String... args) throws Exception {

        Professor p1 = new Professor(null, "Henrique Rodrigo", "henrique@gmail.com", "12345");
        Professor p2 = new Professor(null, "Joana Maria", "joana@gmail.com", "12345");

        professorRepositorio.saveAll((Arrays.asList(p1,p2)));

        Aluno a1 = new Aluno(null, "Ana Júlia", "julia@gmail.com", "12345", "Geografia", "28");
        Aluno a2 = new Aluno(null, "Paulo Jorge", "paulo@gmail.com", "12345", "Física", "24");

        alunoRepositorio.saveAll((Arrays.asList(a1,a2)));

        Curso c1 = new Curso(null, "Geografia", p1, "aula01", "Geografia do Brasil");
        Curso c2 = new Curso(null, "Física", p2, "aula02", "Física quãntica");

        cursoRepositorio.saveAll((Arrays.asList(c1,c2)));

    }
}
