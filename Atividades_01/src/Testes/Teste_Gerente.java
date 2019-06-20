package Testes;

import Orientacao_Objetos.Gerente;

public class Teste_Gerente {

	public static void main(String[] args) {
		Gerente gerente_1 = new Gerente();
		Gerente gerente_2 = new Gerente();
		
		gerente_1.salario = 1000;
		gerente_2.salario = 1000;
		
		gerente_1.AumentoSalario();
		gerente_2.AumentoSalario(15);
		
		System.out.println(gerente_1.salario);
		System.out.println(gerente_2.salario);
		
	}

}
