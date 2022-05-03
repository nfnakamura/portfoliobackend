
package com.app.Portfolio.service;

import com.app.Portfolio.model.Habilidad;
import com.app.Portfolio.repository.HabilidadRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadService implements IHabilidadService{

    @Autowired
    HabilidadRepository habRepo;
    
    
    @Override
    public List<Habilidad> verHabilidades() {
        return habRepo.findAll();
    }

    @Override
    public void crearHabilidad(Habilidad hab) {
        habRepo.save(hab);
    }

    @Override
    public void borrarHabilidad(Long id) {
        habRepo.deleteById(id);
    }

    @Override
    public Habilidad buscarHabilidad(Long id) {
        return habRepo.findById(id).orElse(null);
    }
    
    
    
}
