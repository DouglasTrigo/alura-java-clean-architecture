package br.com.escola.aplicacao.indicacao;

import br.com.escola.dominio.aluno.Aluno;

public interface EnviarEmailNotificacao {

    void enviarPara(Aluno alunoIndicado);
}
