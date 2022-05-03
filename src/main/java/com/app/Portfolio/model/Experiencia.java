
package com.app.Portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter

public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
       
    private Long id;
    private String position;
    private String company;
    private String img;
    private String mode;
    private String started;
    private String ended;
    private String timeElapsed;
    
    private Long id_persona;

    public Experiencia(String position, String company, String img, String mode, String started, String ended, String timeElapsed) {
        
        this.position = position;
        this.company = company;
        this.img = img;
        this.mode = mode;
        this.started = started;
        this.ended = ended;
        this.timeElapsed = timeElapsed;
    }
             
    public Experiencia() {
    }
}
