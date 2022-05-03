
package com.app.Portfolio.model;



import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter @Setter
public class Persona {   
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private String about;
    private String ubication;
    private String image;
    private String backImage;
    private String position;
    
   public Persona(){
   }


    public Persona(String nombre, String apellido, String about, String ubication, String image, String backImage, String position) {        
        this.nombre = nombre;
        this.apellido = apellido;
        this.about = about;
        this.ubication = ubication;
        this.image = image;
        this.backImage = backImage;
        this.position = position;
    }

    
    @OneToMany(cascade=CascadeType.ALL)
    private List<Proyecto> proyectos;
    
    @OneToMany(cascade=CascadeType.ALL)
    private List<Habilidad> habilidades;
    
    @OneToMany(cascade=CascadeType.ALL)
    private List<Educacion> educaciones;
    
    @OneToMany(cascade=CascadeType.ALL)
    private List<Experiencia> experiencias;



    
        

}
       


