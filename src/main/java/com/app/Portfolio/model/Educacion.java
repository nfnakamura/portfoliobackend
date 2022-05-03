
package com.app.Portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity

@Getter @Setter
public class Educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
       
    private Long id;
    private String school;
    private String title;
    private String img;
    private String career;
    private String score;
    private String started;
    private String ended;
    
    private Long id_persona;

    public Educacion() {
    }

    public Educacion(String school, String title, String img, String career, String score, String started, String ended) {
        
        this.school = school;
        this.title = title;
        this.img = img;
        this.career = career;
        this.score = score;
        this.started = started;
        this.ended = ended;
    }
    

    
}
