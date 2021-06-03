package com.airton.school_system.repositorios;

import com.airton.school_system.entities.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepositorio extends JpaRepository<Aluno,Long> {

}
