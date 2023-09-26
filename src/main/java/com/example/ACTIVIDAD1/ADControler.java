package com.example.ACTIVIDAD1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

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

    /** Ejercicio Numero 4 y 5 */
    @GetMapping("/perfil")
    String perfil(Model model){
        String [] Hobies  ={"Dormir", "Comer", "No trabajar" };
        Usuario usuario = new Usuario("Pepe",2,Hobies);
        System.out.println(usuario);
        model.addAttribute("user",usuario);
        return "perfil";
    }
    /** Ejercicio Numero 6 */
    @GetMapping("/array/{number}")
    String array(Model model,@PathVariable Integer number){
        ArrayList <Integer> lista = new ArrayList<>(5);
        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(40);
        lista.add(50);
        int conprovacion=0;
        for(int i=0;i<5;i++){
            if (lista.get(i)==number){
                conprovacion=1;
            }
        }

        model.addAttribute("lista",lista);
        model.addAttribute("numero",number);
        model.addAttribute("comprovacion",conprovacion);
        return "array";
    }

}
