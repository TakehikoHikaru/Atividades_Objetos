package Testes;

import Orientacao_Objetos.Aluno;
import Orientacao_Objetos.Turma;

public class Teste_Turma_Alunos {

	public static void main(String[] args) {
		
		Turma turma_1 = new Turma();
		Aluno aluno_1 = new Aluno();
		
		turma_1.periodo = "Matutino";
		turma_1.serie = "3º";
		turma_1.sigla = "Blu";
		turma_1.Tipo_ensino = "medio";
		
		aluno_1.Data_de_nascimento = "24/06/2001";
		aluno_1.Nome = "Juberta";
		aluno_1.RG = 11111111;
		aluno_1.turma = turma_1;
		
		
		System.out.printf("Aluno: %s \nRG: %d \nSerie: %s \nPeriodo: %s \nTipo de ensino: %s ",aluno_1.Nome,aluno_1.RG,aluno_1.turma.serie,aluno_1.turma.periodo,aluno_1.turma.Tipo_ensino);

	}

}
