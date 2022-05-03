
package com.app.Portfolio.repository;

import com.app.Portfolio.model.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ExperienciaRepository extends JpaRepository <Experiencia, Long>{
    
}
