package Testes;

import Orientacao_Objetos.Conta;

public class Teste_Conta {
	public static void main(String[] args) {

		Conta Conta_1 = new Conta();
		Conta Conta_2 = new Conta();
		
		Conta_1.Num_conta = 4;
		Conta_2.Num_conta = 6;
		Conta_1.Depositar(4444);
		Conta_1.Saque(1111);
		System.out.print("Saldo: "+Conta_1.ConsuldaSaldo());
		System.out.printf("\nNumero das Contas \nConta 1: %d\nConta 2: %d",Conta_1.Num_conta,Conta_2.Num_conta);
		
		
		
		
	}

}
