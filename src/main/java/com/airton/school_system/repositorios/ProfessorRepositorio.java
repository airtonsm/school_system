package com.airton.school_system.repositorios;

import com.airton.school_system.entities.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepositorio extends JpaRepository<Professor,Long> {

}
