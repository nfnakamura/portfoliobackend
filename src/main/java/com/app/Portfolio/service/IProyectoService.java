
package com.app.Portfolio.service;


;
import com.app.Portfolio.model.Persona;
import com.app.Portfolio.model.Proyecto;
import java.util.List;
import com.app.Portfolio.model.Proyecto;
import java.util.List;


public interface IProyectoService {
    
    
    public List<Proyecto> verProyectos();
    
    public void crearProyecto(Proyecto proy);
    
    public void borrarProyecto (Long id);
    
    public Proyecto buscarProyecto (Long id);
    
    
}
