package Testes;

import Orientacao_Objetos.Agencia_de_bancos;
import Orientacao_Objetos.Conta;

public class Teste_Conta {
	public static void main(String[] args) {

		Agencia_de_bancos agencia_x = new Agencia_de_bancos(111);
		
		
		Conta Conta_1 = new Conta(agencia_x);
		Conta Conta_2 = new Conta(agencia_x);
		
		Conta_1.Num_conta = 4;
		Conta_2.Num_conta = 6;
		Conta_1.Depositar(4444);
		Conta_1.Saque(1111);
		System.out.print("Saldo: "+Conta_1.ConsuldaSaldo());
		System.out.printf("\nNumero das Contas \nConta 1: %d\nConta 2: %d",Conta_1.Num_conta,Conta_2.Num_conta);
		
		
		
		
	}

}
