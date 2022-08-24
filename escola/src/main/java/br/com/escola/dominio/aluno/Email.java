package br.com.escola.dominio.aluno;

import lombok.Getter;

public class Email {

    //Value object

    @Getter
    private String endereco;
    private static final String REGEX_EMAIL = "^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

    public Email(String endereco) {
        if(endereco == null ||
                !endereco.matches(REGEX_EMAIL)){
            throw new IllegalArgumentException("E-mail inválido!");
        }
        this.endereco = endereco;
    }
}
