package com.maven.test.repo;

import com.maven.test.entity.Empleado;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ADMIN
 */
@Repository
public interface EmpleadoRepo extends JpaRepository<Empleado, Integer> {
    
}