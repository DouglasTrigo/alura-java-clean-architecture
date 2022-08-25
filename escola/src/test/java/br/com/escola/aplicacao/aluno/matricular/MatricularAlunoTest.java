package br.com.escola.aplicacao.aluno.matricular;

import br.com.escola.dominio.aluno.Aluno;
import br.com.escola.dominio.aluno.CPF;
import br.com.escola.dominio.aluno.RepositorioDeAlunos;
import br.com.escola.infra.aluno.RepositorioDeAlunosEmMemoria;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MatricularAlunoTest {

    @Test
    void alunoDeveriaSerPersistido(){

        String nome = "Lorivaldo";
        String cpf = "010.223.600-35";
        String email = "lorivaldo@email.com";

        RepositorioDeAlunos repositorioDeAlunos = new RepositorioDeAlunosEmMemoria();
        MatricularAluno useCase = new MatricularAluno(repositorioDeAlunos);

        useCase.executa(new MatricularAlunoDto(nome, cpf, email));
        Aluno alunoEncontrado = repositorioDeAlunos.buscarPorCPF(new CPF(cpf));

        assertEquals(nome, alunoEncontrado.getNome());
        assertEquals(cpf, alunoEncontrado.getCpf());
        assertEquals(email, alunoEncontrado.getEmail());
    }

}
