package br.com.projeto;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
//Controlador Rest que responde por Categorias (endpoint(URL, endereço))
@RequestMapping (value = "/Categorias")
public class CategoriaResources {

    //Requisição básica
    // Rest é uma API (ponte de comunicação)
    @RequestMapping(method = RequestMethod.GET)
    public String listar(){

return "REST está funcionando!";

    }
    
}
