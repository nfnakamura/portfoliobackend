
package com.app.Portfolio.controller;


import com.app.Portfolio.model.Proyecto;
import com.app.Portfolio.service.IProyectoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ProyectoController {
    
    @Autowired
    IProyectoService proyServ;
    
       @PostMapping("new/proyecto")
    public void agregarProyecto(@RequestBody Proyecto proy){
          proyServ.crearProyecto(proy);
    }
    
    @GetMapping("ver/proyectos")
    @ResponseBody
    public List<Proyecto> verProyecto(){
         return proyServ.verProyectos();
     }
    
    @GetMapping("ver/proyecto/{id}")
    public Proyecto buscarProyectoPorId(@PathVariable Long id){
        return proyServ.buscarProyecto(id);
    }

    @DeleteMapping("delete/proyecto/{id}")
    public void borrarProyecto (@PathVariable Long id){
        proyServ.borrarProyecto(id);        
    }
    
}
