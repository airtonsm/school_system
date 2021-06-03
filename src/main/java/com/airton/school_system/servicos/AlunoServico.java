package com.airton.school_system.servicos;

import com.airton.school_system.entities.Aluno;
import com.airton.school_system.repositorios.AlunoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoServico {

    @Autowired
    private AlunoRepositorio repositorio;

    public List<Aluno> listarTodos(){
        return repositorio.findAll(); // retornar todos os professores.
    }

}
