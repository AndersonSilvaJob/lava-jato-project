package br.com.projeto.lavajato.repositorio;

import br.com.projeto.lavajato.modelo.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioCliente extends JpaRepository<Cliente,Long> {
}
