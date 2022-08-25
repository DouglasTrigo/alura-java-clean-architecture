package br.com.escola;

import br.com.escola.aplicacao.aluno.matricular.MatricularAluno;
import br.com.escola.aplicacao.aluno.matricular.MatricularAlunoDto;
import br.com.escola.dominio.aluno.RepositorioDeAlunos;
import br.com.escola.infra.aluno.RepositorioDeAlunosEmMemoria;

public class MatricularAlunoViaLinhaDeComando {

    public static void main(String[] args) {
        String nome = "Lorivaldo";
        String cpf = "010.223.600-35";
        String email = "lorivaldo@email.com";

        RepositorioDeAlunos repositorioDeAlunos = new RepositorioDeAlunosEmMemoria();
        MatricularAluno matricularAluno = new MatricularAluno(repositorioDeAlunos);
        matricularAluno.executa(new MatricularAlunoDto(nome, cpf, email));
    }

}
