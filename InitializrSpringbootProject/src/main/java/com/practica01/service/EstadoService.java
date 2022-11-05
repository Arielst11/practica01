/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practica01.service;
import com.practica01.domain.Estado;
import java.util.List;
/**
 *
 * @author asanc
 */
public interface EstadoService {
// retorna la lista de estados
public List<Estado> getEstados();

// dado un estado id se busca en la tabla y se retorna todo el objeto 
public Estado getEstado(Estado estado);


// si el estado id tiene valor se busca y se actualiza
// si el estado id no tiene valor se inserta en la tabla
public void save(Estado estado);

// elimina el registro que tiene el id igual al estado id
public void delete(Estado estado);

}
