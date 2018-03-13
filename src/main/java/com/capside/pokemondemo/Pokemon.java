package com.capside.pokemondemo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 *
 * @author ciber
 */
@Data @NoArgsConstructor @AllArgsConstructor 
@JsonIgnoreProperties
@EqualsAndHashCode(of = {"name"})
@Entity
public class Pokemon implements Serializable {

    public static final long serialVersionUID = 1L;
    
    @Id
    private int id;
    @Column(name="identifier")
    private String name;
    

    public String getUrl() {
        return "images/" + id + ".png";
    }
}
