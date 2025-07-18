package br.com.projeto.api.controller;

import br.com.projeto.api.entity.Cliente;
import br.com.projeto.api.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class Controller {

    @Autowired
    private Repository acao;

    @PostMapping("/")
    public Cliente cadastrar(@RequestBody Cliente c){
        return acao.save(c);
    }

    @GetMapping("/")
    public Iterable<Cliente> selecionar(){
        return acao.findAll();
    }

    @PutMapping("/")
    public Cliente editar(@RequestBody Cliente c){
        return acao.save(c);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){

        acao.deleteById(id);

    }
}
