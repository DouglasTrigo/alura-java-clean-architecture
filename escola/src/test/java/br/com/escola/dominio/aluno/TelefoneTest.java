package br.com.escola.dominio.aluno;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TelefoneTest {

    @Test
    void deveLancarErroQuandoTelefoneInvalido(){
        assertThrows(IllegalArgumentException.class, () -> new Telefone(null, null));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("", ""));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("", null));
        assertThrows(IllegalArgumentException.class, () -> new Telefone(null, ""));

        assertThrows(IllegalArgumentException.class, () -> new Telefone("1", "12345678"));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("11", "1234567"));
    }

    @Test
    void deveCriarOTelefoneQuandoParametrosForemValidos(){
        assertNotNull(new Telefone("11", "12345678"));
        assertNotNull(new Telefone("11", "123456789"));
    }

}
