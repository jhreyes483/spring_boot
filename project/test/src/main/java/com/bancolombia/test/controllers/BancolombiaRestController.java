package com.bancolombia.test.controllers;


import java.util.HashMap;
import java.util.Map;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;




@RestController
@RequestMapping("/api")


public class BancolombiaRestController {

    @RequestMapping(path="/detalles_info2", method=RequestMethod.GET) 
       
    public Map<String, Object>detalles_info2(){
        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("nombre", "Juan Pérez"); 
        respuesta.put("edad", 30);             
        respuesta.put("empresa", "Bancolombia");
        return respuesta;
    }
    

}
