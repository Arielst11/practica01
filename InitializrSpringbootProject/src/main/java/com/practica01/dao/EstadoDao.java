/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practica01.dao;
import com.practica01.domain.Estado;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author asanc
 */

//dao= data access object

public interface EstadoDao extends JpaRepository<Estado, Long>{
    
}
