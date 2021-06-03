package com.airton.school_system.servicos;

import com.airton.school_system.entities.Professor;
import com.airton.school_system.repositorios.ProfessorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorServico {

    @Autowired
    private ProfessorRepositorio repositorio;

    public List<Professor> listarTodos(){
        return repositorio.findAll(); // retornar todos os professores.
    }

}
