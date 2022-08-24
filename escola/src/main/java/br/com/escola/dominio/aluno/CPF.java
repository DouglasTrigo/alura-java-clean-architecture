package br.com.escola.dominio.aluno;

import lombok.Getter;

public class CPF {

    //value object

    @Getter
    private String numero;
    private static final String REGEX_CPF =
            "/^\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}$/";

    public CPF(String numero){
        if(numero == null ||
                !numero.matches(REGEX_CPF)){
            throw new IllegalArgumentException("CPF inválido!");
        }
        this.numero = numero;
    }

}
