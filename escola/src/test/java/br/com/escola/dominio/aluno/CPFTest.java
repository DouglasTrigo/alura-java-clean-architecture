package br.com.escola.dominio.aluno;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CPFTest {

    @Test
    void naoDeveriaCriarCPFComNumeroInvalido(){
        assertThrows(IllegalArgumentException.class, () -> new CPF(null));
        assertThrows(IllegalArgumentException.class, () -> new CPF(""));
        assertThrows(IllegalArgumentException.class, () -> new CPF("12345"));
        assertThrows(IllegalArgumentException.class, () -> new CPF("12345678912"));
    }

    @Test
    void deveCriarCPFQuandoNumeroForValido(){
        assertNotNull(new CPF("987.760.010-24"));
    }
}
