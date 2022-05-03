
package com.app.Portfolio.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String format;
    private String name;
    private String link;
    private String description;
    
   
    private Long id_persona;    
    
    public Proyecto() {
    }

    public Proyecto(String format, String name, String link, String description, Long id_persona) {
        this.format = format;
        this.name = name;
        this.link = link;
        this.description = description;
        this.id_persona = id_persona;
    }


    
    
    
    
}
