package com.airton.school_system.servicos;

import com.airton.school_system.entities.Curso;
import com.airton.school_system.repositorios.AlunoRepositorio;
import com.airton.school_system.repositorios.CursoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoServico {

    @Autowired
    private CursoRepositorio repositorio;

    public List<Curso> listarTodos(){
        return repositorio.findAll(); // retornar todos os Cursos.
    }

}
