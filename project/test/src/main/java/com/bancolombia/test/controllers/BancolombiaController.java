package com.bancolombia.test.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bancolombia.test.models.Funcionarios;

@Controller
public class BancolombiaController {
    @GetMapping("/detalles_info")
    public String info(Model model) {
        Funcionarios funcionario1 = new Funcionarios(
                "Javier",
                "Reyes",
                "Calle test123", 
                "ingeniero de desarrollo",
                33, 
                234234, 
                001
            );
            model.addAttribute("Funcionario", funcionario1);

        return "detalles_info";
    }

}
