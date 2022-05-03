
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
    
    public void editarNombre(Long id, Persona per);
    
    public void editarApellido(Long id, Persona per);
    
    public void editarTrabajo(Long id, Persona per);
    
    public void editarUbicacion(Long id, Persona per);
    
    public void editarAbout(Long id, Persona per);
    
    public void editarImagen(Long id, Persona per);    
           
    public void crearProyectoDePersona(Long id, Proyecto proyecto);
    
    public void crearHabilidadDePersona(Long id, Habilidad habilidad);
    
    public void crearEducacionDePersona(Long id, Educacion educacion);
    
    public void crearExperienciaDePersona(Long id, Experiencia experiencia);
    
    public void eliminarProyectoDePersona(Long id_pers, Long id_proy);
    
    public void eliminarHablidadDePersona(Long id_pers, Long id_hab);
    
    public void eliminarEducacionDePersona(Long id_pers, Long id_edu);
  
    public void eliminarExperienciaDePersona(Long id_pers, Long id_exp);
   
    
}
