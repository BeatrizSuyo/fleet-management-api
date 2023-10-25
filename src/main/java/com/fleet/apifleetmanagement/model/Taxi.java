package com.fleet.apifleetmanagement.model;
//import jakarta.persistence.*;
import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "taxis")
public class Taxi {
    @Id
    private int id;
    private String license;

    protected Taxi(){}

    public Taxi(int id, String license){
        this.id=id;
        this.license = license;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getLicense(){
        return license;
    }
    public void setLicense(String license){
        this.license = license;
    }

}
