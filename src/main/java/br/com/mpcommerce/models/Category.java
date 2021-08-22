package br.com.mpcommerce.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "categories")
@Getter @Setter
public class Category implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;


    public String toString() {
        return "ID:" + this.id + "\n" + "Name: " + this.name;
    }
}
