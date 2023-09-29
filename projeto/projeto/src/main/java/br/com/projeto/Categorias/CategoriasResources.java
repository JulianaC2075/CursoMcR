package br.com.projeto.Categorias;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/Categorias")
public class CategoriasResources {
    
// testando a Rest
    @RequestMapping(method = RequestMethod.GET)
    public String listar(){

        return "REST está funcionando!";
    }
    
}
