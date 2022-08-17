package com.portfolio.OIA.Security.Entity;

import com.portfolio.OIA.Security.Enums.RolNombre;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    @Enumerated(EnumType.STRING)
    private RolNombre ronnombre;
    
    //Constructor

    public Rol() {
    }

    public Rol(RolNombre ronnombre) {
        this.ronnombre = ronnombre;
    }
    
    //Getter & Setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public RolNombre getRonnombre() {
        return ronnombre;
    }

    public void setRonnombre(RolNombre ronnombre) {
        this.ronnombre = ronnombre;
    }
    
}
