package Testes;

import Orientacao_Objetos.Aluno;

public class Teste_Aluno {

	public static void main(String[] args) {

		Aluno aluno_a = new Aluno();
		aluno_a.Data_de_nascimento = "11/02/2003";
		aluno_a.Nome = "Irineu";
		aluno_a.RG = 21332134;
		
		Aluno aluno_b = new Aluno();
		aluno_b.Data_de_nascimento = "05/09/1990";
		aluno_b.Nome = "Jubileu";
		aluno_b.RG = 498474;
			
		System.out.printf("Nome: %s, \nData de Nascimento: %s \nRG: %d\n",aluno_a.Nome,aluno_a.Data_de_nascimento,aluno_a.RG);
		System.out.printf("Nome: %s, \nData de Nascimento: %s \nRG: %d",aluno_b.Nome,aluno_b.Data_de_nascimento,aluno_b.RG);
	}
}
