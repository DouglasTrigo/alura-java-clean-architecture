package br.com.escola.aplicacao.aluno.matricular;

import br.com.escola.dominio.aluno.Aluno;
import br.com.escola.dominio.aluno.FabricaDeAlunos;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MatricularAlunoDto {

    private String nomeAluno;
    private String cpfAluno;
    private String emailAluno;

    public Aluno criarAluno(){
        return new FabricaDeAlunos()
                .comCPFNomeEEmail(cpfAluno, nomeAluno, emailAluno)
                .criar();
    }
}
