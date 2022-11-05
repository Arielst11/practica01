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
import com.practica01.domain.Estado;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author asanc
 */

@Controller
@Slf4j
public class EstadoController {

   // conecta el index controller con Estado dao 
   @Autowired
    private EstadoService estadoService; // se usa la intefaz e igual funciona.
      
   
@GetMapping("/estado/nuevo")    
 public String nuevoEstado(Estado estado){
  return "modificarEstado";
 }   
 
    
 @PostMapping("/estado/guardar")
 public String guardarEstado(Estado estado){
 estadoService.save(estado);
 return "redirect:/";
 }
 
 @GetMapping("/modificarEstado/{id}")    
 public String modificarEstado(Estado estado, Model model){
 estado = estadoService.getEstado(estado);
 model.addAttribute("estado", estado);
 return "modificarEstado";
 }   
 
 @GetMapping("/eliminarEstado/{id}")    
 public String eliminarEstado(Estado estado){
 estadoService.delete(estado);
 return "redirect:/";
 }   
         
         
         
}
