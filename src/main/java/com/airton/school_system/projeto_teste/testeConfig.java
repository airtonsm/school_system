package com.airton.school_system.projeto_teste;

import com.airton.school_system.entities.Professor;
import com.airton.school_system.repositorios.ProfessorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class testeConfig implements CommandLineRunner {

    @Autowired
    private ProfessorRepositorio professorRepositorio;

    @Override
    public void run(String... args) throws Exception {

        Professor p1 = new Professor(null, "Henrique Rodrigo", "henrique@gmail.com", "12345");
        Professor p2 = new Professor(null, "Joana Maria", "joana@gmail.com", "12345");

        professorRepositorio.saveAll((Arrays.asList(p1,p2)));

    }
}
