
package com.app.Portfolio.controller;

import com.app.Portfolio.model.Educacion;
import com.app.Portfolio.model.Experiencia;
import com.app.Portfolio.model.Habilidad;
import com.app.Portfolio.model.Persona;
import com.app.Portfolio.model.Proyecto;
import com.app.Portfolio.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class PersonaController {
    
 @Autowired
 private IPersonaService persoServ;
 
 
 @PostMapping("new/persona")
  public void agregarPersona(@RequestBody Persona pers){
        persoServ.crearPersona(pers);
  }  
  
 @GetMapping("ver/personas/{id}")
 @ResponseBody
  public Persona buscarPersona(@PathVariable Long id){
      return persoServ.buscarPersona(id);
  }

 @GetMapping("ver/personas")
 @ResponseBody
 public List<Persona> verPersonas(){
      return persoServ.verPersonas();
  }
/*
 @DeleteMapping("delete/{id}")
 public void borrarPersona(@PathVariable Long id){
     persoServ.borrarPersona(id);
 }
 */
 /*Edit Persona*/
 
 @PatchMapping("edit/persona/{id}")
    public void editarPersona(@PathVariable Long id, @RequestBody Persona per){
        persoServ.editarPersona(id, per);   
 }   
     
 /*Proyecto*/

@PostMapping("new/persona/{id}/proyecto")
public void agregarProyectoAPersona(@PathVariable Long id, @RequestBody Proyecto proyecto){
    persoServ.crearProyectoDePersona(id, proyecto);
}

@PatchMapping("edit/persona/{id}/proyecto/{id_proy}")
public void editarProyecto(@PathVariable Long id, @RequestBody Proyecto proyecto, @PathVariable Long id_proy){
    persoServ.editarProyecto(id, proyecto, id_proy);
}

@DeleteMapping("delete/persona/{id_pers}/proyecto/{id_proy}")
public void borrarProyectoPersona(@PathVariable Long id_pers,@PathVariable Long id_proy){
    persoServ.eliminarProyectoDePersona(id_pers, id_proy);
}

/*Habilidad*/

@PostMapping("new/persona/{id}/habilidad")
public void agregarHabilidadAPersona(@PathVariable Long id, @RequestBody Habilidad habilidad){
    persoServ.crearHabilidadDePersona(id, habilidad);
    
}

@PatchMapping("edit/persona/{id}/habilidad/{id_hab}")
public void editarHablilidad(@PathVariable Long id, @RequestBody Habilidad hab, @PathVariable Long id_hab){
    persoServ.editarHabilidad(id, hab, id_hab);
}

@DeleteMapping("delete/persona/{id_pers}/habilidad/{id_hab}")
public void borrarHabilidadPersona(@PathVariable Long id_pers, @PathVariable Long id_hab){
    persoServ.eliminarHablidadDePersona(id_pers, id_hab);
}
    
/*Educacion*/

@PostMapping("new/persona/{id}/educacion")
public void agregarEducacionAPersona(@PathVariable Long id, @RequestBody Educacion educacion){
    persoServ.crearEducacionDePersona(id, educacion);    
 }

@PatchMapping("edit/persona/{id}/educacion/{id_edu}")
    public void editarEducacion (@PathVariable Long id, @RequestBody Educacion edu, @PathVariable Long id_edu){
        persoServ.editarEducacion(id, edu, id_edu);
    }

@DeleteMapping("delete/persona/{id_pers}/educacion/{id_edu}")
public void borrarEducacionDePersona(@PathVariable Long id_pers, @PathVariable Long id_edu){
    persoServ.eliminarEducacionDePersona(id_pers, id_edu);
}

/*Experiencia*/

@PostMapping("new/persona/{id}/experiencia")
public void agregarExperienciaAPersona(@PathVariable Long id, @RequestBody Experiencia experiencia){
    persoServ.crearExperienciaDePersona(id, experiencia);
}

@PatchMapping("edit/persona/{id}/experiencia/{id_exp}")
   public void editarExperiencia(@PathVariable Long id, @RequestBody Experiencia exp, @PathVariable Long id_exp){
   persoServ.editarExperiencia(id, exp, id_exp);
   }

@DeleteMapping("delete/persona/{id_pers}/experiencia/{id_exp}")
public void borrarExperienciaDePersona(@PathVariable Long id_pers, @PathVariable Long id_exp){
    persoServ.eliminarExperienciaDePersona(id_pers, id_exp);
}

}

