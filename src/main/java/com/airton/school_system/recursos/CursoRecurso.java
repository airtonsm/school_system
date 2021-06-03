package com.airton.school_system.recursos;

import com.airton.school_system.entities.Curso;
import com.airton.school_system.servicos.CursoServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class CursoRecurso {

    @Autowired
    private CursoServico servico;

    public ResponseEntity<List<Curso>>
}
