
package com.app.Portfolio.controller;

import com.app.Portfolio.model.Experiencia;
import com.app.Portfolio.service.IExperienciaService;
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
public class ExperinciaController {
    
    @Autowired
    private IExperienciaService expServ;
    
    @PostMapping("/new/experiencia")
    public void agregarExperiencia(@RequestBody Experiencia exp){
          expServ.crearExperiencia(exp);
    }
    
    @GetMapping("ver/experiencias")
    @ResponseBody
    public List<Experiencia> verExperiencia(){
         return expServ.verExperiencias();
     }

    @DeleteMapping("/delete/experiencia/{id}")
    public void borrarExperiencia(@PathVariable Long id){
        expServ.borrarExperiencia(id);
    }
    
    
}
