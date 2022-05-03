
package com.app.Portfolio.controller;


import com.app.Portfolio.model.Educacion;
import com.app.Portfolio.service.IEducacionService;
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
public class EducacionController {
    
    @Autowired
    IEducacionService eduServ;
    
     @PostMapping("/new/educacion")
    public void agregarEducacion(@RequestBody Educacion edu){
          eduServ.crearEducacion(edu);
    }
    
    @GetMapping("ver/educaciones")
    @ResponseBody
    public List<Educacion> verEducacion(){
         return eduServ.verEducaciones();
     }

    @DeleteMapping("/delete/educacion/{id}")
    public void borrarEducacion (@PathVariable Long id){
        eduServ.borrarEducacion(id);
    }
    
}
