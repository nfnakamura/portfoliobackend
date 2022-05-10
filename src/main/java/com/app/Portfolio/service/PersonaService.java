
package com.app.Portfolio.service;

import com.app.Portfolio.model.Educacion;
import com.app.Portfolio.model.Experiencia;
import com.app.Portfolio.model.Habilidad;
import com.app.Portfolio.model.Persona;
import com.app.Portfolio.model.Proyecto;
import com.app.Portfolio.repository.EducacionRepository;
import com.app.Portfolio.repository.ExperienciaRepository;
import com.app.Portfolio.repository.HabilidadRepository;
import com.app.Portfolio.repository.PersonaRepository;
import com.app.Portfolio.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService{
    
    @Autowired
    public PersonaRepository persoRepo;
    @Autowired
    public ProyectoRepository proyRepo;
    @Autowired
    public HabilidadRepository habRepo;
    @Autowired
    public EducacionRepository eduRepo;
    @Autowired
    public ExperienciaRepository expRepo;
    
    @Override
    public List<Persona> verPersonas() {
       return persoRepo.findAll();
    }

    @Override
    public void crearPersona(Persona per) {
        persoRepo.save(per);
    }

    @Override
    public void borrarPersona(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Persona buscarPersona(Long id) {
        return persoRepo.findById(id).orElse(null);
    } 

    
   @Override
    public void editarPersona(Long id, Persona per) {
       Persona persona = persoRepo.findById(id).orElse(null);
       
        if (per.getNombre()!="")
        persona.setNombre(per.getNombre());
        if(per.getApellido()!="")
         persona.setApellido(per.getApellido());
        if(per.getImage()!="")
        persona.setImage(per.getImage());
        if(per.getBackImage()!="")
         persona.setBackImage(per.getBackImage());    
        if(per.getPosition()!="");
        persona.setPosition(per.getPosition());
        if(per.getUbication()!="")
         persona.setUbication(per.getUbication());
        if(per.getAbout()!="")
         persona.setAbout(per.getAbout());
       
       persoRepo.save(persona);
    }
 
    
    @Override
    public void crearProyectoDePersona(Long id, Proyecto proyecto) {
        Persona persona = persoRepo.findById(id).orElse(null);
        List<Proyecto> proyectosDePersona = persona.getProyectos();
        proyecto.setId_persona(id);
        proyectosDePersona.add(proyecto);
       
        persoRepo.save(persona);        
    }
    


    @Override
    public void crearHabilidadDePersona(Long id, Habilidad habilidad) {
       Persona persona = persoRepo.findById(id).orElse(null);
       List<Habilidad> habilidadesDePersona=persona.getHabilidades();
       habilidad.setId_persona(id);
       habilidadesDePersona.add(habilidad);
       
       persoRepo.save(persona);       
    }

    @Override
    public void crearEducacionDePersona(Long id, Educacion educacion) {
        Persona persona = persoRepo.findById(id).orElse(null);
        List<Educacion> educacionesDePersona=persona.getEducaciones();
        educacion.setId_persona(id);
        educacionesDePersona.add(educacion);

        persoRepo.save(persona);
    }

    @Override
    public void crearExperienciaDePersona(Long id, Experiencia experiencia) {
        Persona persona = persoRepo.findById(id).orElse(null);
        List<Experiencia> experienciasDePersona=persona.getExperiencias();
        experiencia.setId_persona(id);
        experienciasDePersona.add(experiencia);
        
        persoRepo.save(persona);
    }
     
            
    @Override
    public void eliminarProyectoDePersona(Long id_pers, Long id_proy){
        
        Persona persona = persoRepo.findById(id_pers).orElse(null);
        Proyecto proyecto = proyRepo.findById(id_proy).orElse(null);
        
        List <Proyecto> proyectosDePersona = persona.getProyectos();
                
        if(proyectosDePersona.contains(proyecto)){
            proyectosDePersona.remove(proyecto);
        }  
        
        persoRepo.save(persona);
        proyRepo.deleteById(id_proy);
        
        
    }

    @Override
    public void eliminarHablidadDePersona(Long id_pers, Long id_hab) {
        
        Persona persona = persoRepo.findById(id_pers).orElse(null);
        Habilidad habilidad = habRepo.findById(id_hab).orElse(null);
        
        List <Habilidad> habilidadesDePersona = persona.getHabilidades();
        
        if(habilidadesDePersona.contains(habilidad)){
            habilidadesDePersona.remove(habilidad);
        }
        
        persoRepo.save(persona);
        habRepo.deleteById(id_hab);
        
    }

    @Override
    public void eliminarEducacionDePersona(Long id_pers, Long id_edu) {
        
        Persona persona = persoRepo.findById(id_pers).orElse(null);
        Educacion educacion = eduRepo.findById(id_edu).orElse(null);
        
        List <Educacion> educacionesDePersona = persona.getEducaciones();
        
        if(educacionesDePersona.contains(educacion)){
            educacionesDePersona.remove(educacion);
        }
        
        persoRepo.save(persona);
        eduRepo.deleteById(id_edu);
        
    }

    @Override
    public void eliminarExperienciaDePersona(Long id_pers, Long id_exp) {
        
        Persona persona = persoRepo.findById(id_pers).orElse(null);
        Experiencia experiencia = expRepo.findById(id_exp).orElse(null);
        
        List <Experiencia> experienciasDePersona = persona.getExperiencias();
        
        if(experienciasDePersona.contains(experiencia)){
            experienciasDePersona.remove(experiencia);
        }
        
        persoRepo.save(persona);
        expRepo.deleteById(id_exp);
    }

    @Override
    public void editarProyecto(Long id, Proyecto proy, Long id_proy) {
       
       Persona persona = persoRepo.findById(id).orElse(null);
       Proyecto proyecto = proyRepo.findById(id_proy).orElse(null);
       
       if(proy.getName()!="")
       proyecto.setName(proy.getName());
       if(proy.getFormat()!="")
       proyecto.setFormat(proy.getFormat());
       if(proy.getDescription()!="")
       proyecto.setDescription(proy.getDescription());
       if(proy.getLink()!="")
       proyecto.setLink(proy.getLink());
             
       
       persoRepo.save(persona);
    }

    @Override
    public void editarHabilidad(Long id, Habilidad hab, Long id_hab) {
       
        Persona persona = persoRepo.findById(id).orElse(null);
        Habilidad habilidad= habRepo.findById(id_hab).orElse(null);
        
        if(hab.getName()!="")
          habilidad.setName(hab.getName());
        if(hab.getProgress()>0 && hab.getProgress()<100)
          habilidad.setProgress(hab.getProgress());
        if(hab.getValue()!="")
            habilidad.setValue(hab.getValue());
        
        
        
        persoRepo.save(persona);
        
    }

    @Override
    public void editarExperiencia(Long id, Experiencia exp, Long id_exp) {
        Persona persona = persoRepo.findById(id).orElse(null);
        Experiencia experiencia = expRepo.findById(id_exp).orElse(null);
        
        if(exp.getPosition()!="")
            experiencia.setPosition(exp.getPosition());
        if(exp.getCompany()!="")
            experiencia.setCompany(exp.getCompany());
        if(exp.getMode()!="")
            experiencia.setMode(exp.getMode());
        if(exp.getStarted()!="")
            experiencia.setStarted(exp.getStarted());
        if(exp.getEnded()!="")
            experiencia.setEnded(exp.getEnded());
        if(exp.getTimeElapsed()!="")
            experiencia.setTimeElapsed(exp.getTimeElapsed());
        if(exp.getImg()!="")
            experiencia.setImg(exp.getImg());
        
        persoRepo.save(persona);
        
    }

    @Override
    public void editarEducacion(Long id, Educacion edu, Long id_edu) {
      
    }

    
    



    
    
    
}
