package com.bancolombia.test.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
// http://localhost:8080/api/parametros/detalle?informacion=%22Saludos%20a%20todos%22

    @RestController
    @RequestMapping("/api/parametros")
    public class RequestParamController {
        @GetMapping("/detalle")
        public ParametroDTO detalle(@RequestParam(required = false, defaultValue = "Hola a todos") String informacion){
            ParametroDTO parametro1 = new ParametroDTO();
            parametro1.setInformacion(informacion);
            return parametro1;
        }
    }

