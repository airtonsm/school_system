package com.airton.school_system.recursos;

import com.airton.school_system.entities.Aluno;
import com.airton.school_system.servicos.AlunoServico;
import com.airton.school_system.servicos.ProfessorServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/alunos")
public class AlunoRecurso {

    @Autowired
    private AlunoServico servico;

    @GetMapping
    public ResponseEntity<List<Aluno>> listarTodos(){
        List<Aluno> list = servico.listarTodos();
        return ResponseEntity.ok().body(list);
    }



}
