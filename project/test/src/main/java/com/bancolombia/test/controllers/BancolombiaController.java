package com.bancolombia.test.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.bancolombia.test.models.Funcionarios;
import com.bancolombia.test.models.dto.ClaseDTO;

@Controller
public class BancolombiaController {
    @GetMapping("/detalles_info")
    public String info(Model model) {



 
        Funcionarios funcionario1 = new Funcionarios(
                "Javier",
                "Reyes",
                null, 
                "ingeniero de desarrollo",
                33, 
                234234, 
                001
            );
            model.addAttribute("Funcionario", funcionario1);
 

        return "detalles_info";
    }

    @ModelAttribute("Funcionarios")
    public List<Funcionarios> ListaFuncionarios(){
        return Arrays.asList(
            new Funcionarios("Sandra", "Reyes", "Neira", "Ingeniero de desarrollo", 33, 305861111, 2),
            new Funcionarios("Daniel", "Reyes", "Neira", "Ingeniero de desarrollo", 33, 305861111, 3),
            new Funcionarios("Javier", "Reyes", "Neira", "Ingeniero de desarrollo", 33, 305861111, 4),
            new Funcionarios("Javier", "Reyes", "Neira", "Ingeniero de desarrollo", 33, 305861111, 5)
        );
    }

}
