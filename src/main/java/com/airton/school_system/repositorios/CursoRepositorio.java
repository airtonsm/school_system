package com.airton.school_system.repositorios;

import com.airton.school_system.entities.Aluno;
import com.airton.school_system.entities.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepositorio extends JpaRepository<Curso,Long> {

}
