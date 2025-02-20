package com.bancolombia.test.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class BancolombiaController {
    @GetMapping("/detalles_info")
    public String info(Model model){
        // Aquí se agregan variables al modelo
        model.addAttribute("nombre", "Juan Pérez");  // Agregar un atributo 'nombre' con valor
        model.addAttribute("edad", 30);              // Agregar un atributo 'edad' con valor

        // Puedes agregar tantos atributos como necesites
        model.addAttribute("empresa", "Bancolombia");
        return "detalles_info";
    }
    

}
