package br.com.projeto.lavajato.controle;

import br.com.projeto.lavajato.modelo.Cliente;
import br.com.projeto.lavajato.modelo.Veiculo;
import br.com.projeto.lavajato.repositorio.RepositorioCliente;
import br.com.projeto.lavajato.repositorio.RepositorioVeiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controle {

    @Autowired
    private RepositorioCliente RepoCliente;

    @Autowired
    private RepositorioVeiculo RepoVeiculo;

    @PostMapping("/cliente")
    public Cliente cadastrarCliente(@RequestBody Cliente c){
        return RepoCliente.save(c);
    }

    @PostMapping("/veiculo")
    public Veiculo cadastrarVeiculo(@RequestBody Veiculo c){
        return RepoVeiculo.save(c);
    }

    @GetMapping("/")
    public String teste(){
        return "Hello!";
    }
}
