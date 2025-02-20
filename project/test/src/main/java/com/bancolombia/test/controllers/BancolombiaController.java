package com.bancolombia.test.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class BancolombiaController {
    @GetMapping("/detalles_info")
    public String info(){
        return "detalles_info";
    }
    

}
