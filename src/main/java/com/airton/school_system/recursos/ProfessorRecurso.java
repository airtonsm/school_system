package com.airton.school_system.recursos;

import com.airton.school_system.servicos.ProfessorServico;
import com.airton.school_system.entities.Professor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/professores")
public class ProfessorRecurso {

    @Autowired
    private ProfessorServico servico;

    @GetMapping
    public ResponseEntity<List<Professor>> listarTodos(){
        List<Professor> list = servico.listarTodos();
        return ResponseEntity.ok().body(list);
    }



}
