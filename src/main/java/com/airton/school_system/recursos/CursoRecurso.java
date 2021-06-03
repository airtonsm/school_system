package com.airton.school_system.recursos;

import com.airton.school_system.entities.Curso;
import com.airton.school_system.servicos.CursoServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/cursos")
public class CursoRecurso {

    @Autowired
    private CursoServico servico;

    @GetMapping
    public ResponseEntity<List<Curso>> list(){
        List<Curso> list = servico.listarTodos();
        return ResponseEntity.ok().body(list);
    }
}
