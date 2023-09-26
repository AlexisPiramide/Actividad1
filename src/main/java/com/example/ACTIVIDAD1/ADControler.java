package com.example.ACTIVIDAD1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ADControler {

    /** Esta es la rama default, no tiene uso*/
    @GetMapping("/")
    String index(){
        return "index";
    }

    /** Ejercicio Numero 1 */
    @GetMapping("/variable")
    String variable(Model model){
        String variableapasar = "Endocrinoplastia";
        model.addAttribute("variable",variableapasar);
        return "variable";
    }

    /** Ejercicio Numero 2 */
    @GetMapping("/bloques/{number}")
    String bloques(Model model, @PathVariable Integer number){
        /** Parte que se encarga del numero*/
        model.addAttribute("Numero",number);
        /** Parte que se encarga de escribirlo en bucle*/
        Integer [] numeros = new Integer[number+1];
        for (int i = 0; i < number; i++) {
            numeros[i] = i;
        }
        numeros[number] = number;
        model.addAttribute("numeros", numeros);

        return "bloques";
    }

    /** Ejercicio Numero 3 */
    @GetMapping("/formulario")
    String formulario(){
        return "formulario";
    }

    @PostMapping("/datos")
    String datos(@RequestParam("data") Integer data, Model model){
        model.addAttribute("a", 10);
        model.addAttribute("data", data);
        return "datos";
    }

    /** Ejercicio Numero 4 */
    @GetMapping("/perfil")
    String perfil(Model model){
        Usuario usuario = new Usuario("Pepe",51,"Dormir");
        System.out.println(usuario);
        model.addAttribute("user",usuario);
        return "perfil";
    }
}
