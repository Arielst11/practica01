/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practica01.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;


// @ para definir clase como tabla
@Data
@Entity
@Table(name = "estado") // nombre de la tabla en sql
public class Estado implements Serializable{
  
 // Para definir clase como tabla   
 private static final long serialVersionUID = 1L;   
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 
 // campos de la tabla tienen que tener el mismo nombre que la tabla en SQL
 Long id;
 String nombre;
 String capital;
 String poblacion;
 String costa;
 
    public Estado() {
    }

    public Estado(String nombre, String capital, String poblacion, String costa) {
        this.nombre = nombre;
        this.capital = capital;
        this.poblacion = poblacion;
        this.costa = costa;
    }
    
 
 
}
