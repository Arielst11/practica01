/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practica01.service;
import com.practica01.domain.Estado;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.practica01.dao.EstadoDao;
import org.springframework.transaction.annotation.Transactional;



@Service //indica que la clase es un servicio.
public class EstadoServiceImpl implements EstadoService {


@Autowired
private EstadoDao estadoDao;

// retorna la lista de estados
@Override
@Transactional(readOnly = true)
public List<Estado> getEstados(){
return (List<Estado>)estadoDao.findAll();
}

// dado un estado id se busca en la tabla y se retorna todo el objeto 
@Override
@Transactional(readOnly = true)
public Estado getEstado(Estado estado){  
return estadoDao.findById(estado.getId()).orElse(null);
}


// si el estado id tiene valor se busca y se actualiza
// si el estado id no tiene valor se inserta en la tabla
@Override
@Transactional
public void save(Estado estado){
    estadoDao.save(estado);
}

// elimina el registro que tiene el id igual al estado id
@Override
@Transactional
public void delete(Estado estado){
 estadoDao.delete(estado);
}

}
