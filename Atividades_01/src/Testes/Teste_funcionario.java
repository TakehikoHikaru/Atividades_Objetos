package Testes;

import Orientacao_Objetos.Funcionario;

public class Teste_funcionario {

	public static void main(String[] args) {

		Funcionario funcionario_a = new Funcionario();
		Funcionario funcionario_b = new Funcionario();
		
		
		funcionario_a.setNome_funcionario("alano");
		funcionario_a.setSalario (3333);
		
		funcionario_b.setNome_funcionario( "aline");
		funcionario_b.setSalario(1000);
		
		funcionario_a.AumentoSalario(1111);
		

		funcionario_a.ConsultaDados();
		funcionario_b.ConsultaDados();
		
		funcionario_a.BonificacaoSalario();
		funcionario_b.BonificacaoSalario();
		
		
		funcionario_a.ConsultaDados();
		funcionario_b.ConsultaDados();
		
	

	}

}
