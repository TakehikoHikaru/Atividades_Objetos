package Testes;

import Orientacao_Objetos.Agencia_de_bancos;
import Orientacao_Objetos.Conta;

public class Teste_Contas_Agencias {

	public static void main(String[] args) {
		
		Agencia_de_bancos agencia_1 = new Agencia_de_bancos();
		Conta conta_1 = new Conta();
		
		
		
		agencia_1.Num_banco =11132;
		conta_1.agencia = agencia_1;
		System.out.println("Numero do banco: "+conta_1.agencia.Num_banco);
		
		
		
		
	}

}
