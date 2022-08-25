package br.com.escola.aplicacao.aluno.matricular;

import br.com.escola.dominio.aluno.RepositorioDeAlunos;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MatricularAluno {

    private final RepositorioDeAlunos repositorioDeAlunos;

    //COMMAND
    public void executa(MatricularAlunoDto dados){
        repositorioDeAlunos.matricular(dados.criarAluno());
    }
}
