package tech.ada.desafio.desafio1;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Animal {
    private String nome;
    private String classe;
    private String alimentacao;
    private String locomocao;
    private Double peso;

}
