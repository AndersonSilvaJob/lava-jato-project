package br.com.projeto.lavajato.repositorio;

import br.com.projeto.lavajato.modelo.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioVeiculo extends JpaRepository<Veiculo,Long> {
}
