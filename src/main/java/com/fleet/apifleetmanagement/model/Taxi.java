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
    private String placa;

    protected Taxi(){}

    public Taxi(int id, String placa){
        this.id=id;
        this.placa=placa;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getPlaca(){
        return placa;
    }
    public void setPlaca(String placa){
        this.placa = placa;
    }

}
