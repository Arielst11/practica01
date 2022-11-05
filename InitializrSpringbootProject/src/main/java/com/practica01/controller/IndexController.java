/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practica01.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.practica01.service.EstadoService;

/**
 *
 * @author asanc
 */

@Controller
@Slf4j
public class IndexController {

   // conecta el index controller con Estado dao 
   @Autowired
    private EstadoService estadoService; // se usa la intefaz e igual funciona. 
   
   
@GetMapping("/")    // este metodo se inicia automaticamente cuando la pagina spring carga el html / conocido como index
 public String inicio(Model model){
     
  String mensajeBienvenida = "Bienvenidos!";   
  model.addAttribute("mensajeInicial", mensajeBienvenida);
  
  // este metodo busca todos los estados de la tabla estado, y los agrega a un array list y lo guarda en la variable Estados. 
  var Estados = estadoService.getEstados();
  
  // se agrega el arraylist de estados en el model
  model.addAttribute("arrayListDeEstados", Estados);
     return "index";
 }   
    
}
