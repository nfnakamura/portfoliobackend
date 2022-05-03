
package com.app.Portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter @Setter

public class Habilidad {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        
    private Long id;
    private String name;
    private int progress;
    private String value;
    
    private Long id_persona;

    public Habilidad() {
    }

    public Habilidad( String name, int progress, String value) {
        this.name = name;
        this.progress = progress;
        this.value = value;
    }
    
    
    
    
}
