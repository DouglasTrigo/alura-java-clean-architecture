package br.com.escola.dominio.aluno;

import lombok.Getter;

@Getter
public class Telefone {

    //Value object - a igualdade entre dois objetos de uma classe é verificada através da comparação de todos os seus valores

    private String ddd;
    private String numero;

    private static final String MENSAGEM_TELEFONE_INVALIDO = "Telefone inválido!";

    public Telefone(String ddd, String numero) {
        if (ddd == null || numero == null) {
            throw new IllegalArgumentException("DDD e Numero sao obrigatorios!");
        }

        if (!ddd.matches("\\d{2}")) {
            throw new IllegalArgumentException("DDD invalido!");
        }

        if (!numero.matches("\\d{8}|\\d{9}")) {
            throw new IllegalArgumentException("Numero invalido!");
        }
        this.ddd = ddd;
        this.numero = numero;
    }
}
