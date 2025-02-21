package com.bancolombia.test.controllers;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bancolombia.test.models.Funcionarios;
import com.bancolombia.test.models.dto.ClaseDTO;



import org.springframework.web.bind.annotation.RequestMethod;





@RestController
@RequestMapping("/api")


public class BancolombiaRestController {
/* 
    Funcionarios funcionario1 = new Funcionarios(
         "Javier", "Reyes", "Calle test123", "ingeniero de desarrollo",33,234234,001
        );
*/
    @RequestMapping(path="/detalles_info2", method=RequestMethod.GET) 

    public ClaseDTO detalles_info(){
        ClaseDTO usuario1 = new ClaseDTO();
        usuario1.setTitulo("Administrador"); 
        usuario1.setUsuario("Javier");
        /* 
        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("Funcionario", funcionario1); 

        return respuesta;
        */
        return usuario1;
    }


}
