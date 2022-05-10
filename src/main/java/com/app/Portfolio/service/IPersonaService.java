
package com.app.Portfolio.service;

import com.app.Portfolio.model.Educacion;
import com.app.Portfolio.model.Experiencia;
import com.app.Portfolio.model.Habilidad;
import com.app.Portfolio.model.Persona;
import com.app.Portfolio.model.Proyecto;
import java.util.List;


public interface IPersonaService {
    
    
    public List<Persona> verPersonas();
    
    public void crearPersona (Persona per);
    
    public void borrarPersona (Long id);
    
    public Persona buscarPersona (Long id);
    
    public void editarPersona(Long id, Persona per);
    
    public void editarProyecto(Long id, Proyecto proy, Long id_proy);
           
    public void crearProyectoDePersona(Long id, Proyecto proyecto);
    
    public void editarHabilidad(Long id, Habilidad hab, Long id_hab);
    
    public void crearHabilidadDePersona(Long id, Habilidad habilidad);
    
    public void crearEducacionDePersona(Long id, Educacion educacion);
    
    public void crearExperienciaDePersona(Long id, Experiencia experiencia);
    
    public void eliminarProyectoDePersona(Long id_pers, Long id_proy);
    
    public void eliminarHablidadDePersona(Long id_pers, Long id_hab);
    
    public void eliminarEducacionDePersona(Long id_pers, Long id_edu);
  
    public void eliminarExperienciaDePersona(Long id_pers, Long id_exp);
    
   
   
    
}
