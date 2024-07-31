package br.com.projeto.lavajato.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "Veiculos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Veiculo {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String tipo;//carro ou moto

        private String placa;

        private String marca;

        private String modelo;

        private String ano;

        private String cor;

        @ManyToOne
        @JoinColumn(name = "cliente_id")
        private Cliente cliente;

}
