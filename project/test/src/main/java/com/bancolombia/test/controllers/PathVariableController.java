package com.bancolombia.test.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bancolombia.test.models.Funcionarios;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


// http://localhost:8080/api/variable/pagina1/tuMensaje


@RestController
@RequestMapping("/api/variable")
public class PathVariableController {

    @GetMapping("/pagina1/{mensaje}")
    public ParametroDTO pagina1(@PathVariable String mensaje){
        ParametroDTO parametro1 = new ParametroDTO();
        parametro1.setInformacion(mensaje);
        return parametro1;
    }

    // http://localhost:8080/api/variable/solicitud
    @PostMapping("/solicitud")
    public Funcionarios creaEmple(@RequestBody Funcionarios funcionario1){
        return funcionario1;
    }

    
    

}
