
package com.app.Portfolio.controller;

import com.app.Portfolio.model.Habilidad;
import com.app.Portfolio.service.IHabilidadService;
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
public class HabilidadController {
    
    @Autowired
    IHabilidadService habServ;
    
         @PostMapping("/new/habilidad")
    public void agregarProyecto(@RequestBody Habilidad hab){
          habServ.crearHabilidad(hab);
    }
    
    @GetMapping("ver/habilidades")
    @ResponseBody
    public List<Habilidad> verHabilidad(){
         return habServ.verHabilidades();
     }

    @DeleteMapping("/delete/habilidad/{id}")
    public void borrarHabilidad (@PathVariable Long id){
        habServ.borrarHabilidad(id);
    }
    
}
