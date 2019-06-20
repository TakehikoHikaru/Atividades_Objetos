package Testes;

import Orientacao_Objetos.Funcionario;

public class Teste_funcionario {

	public static void main(String[] args) {

		Funcionario funcionario_a = new Funcionario();
		Funcionario funcionario_b = new Funcionario();
		
		
		funcionario_a.Nome_funcionario = "alano";
		funcionario_a.salario = 3333;
		
		funcionario_b.Nome_funcionario = "aline";
		funcionario_b.salario = 1234;
		
		funcionario_a.AumentoSalario(1111);
		
		funcionario_a.ConsultaDados();
		funcionario_b.ConsultaDados();
		
	

	}

}
