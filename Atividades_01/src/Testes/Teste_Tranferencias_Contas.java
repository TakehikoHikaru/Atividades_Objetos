package Testes;

import Orientacao_Objetos.Agencia_de_bancos;
import Orientacao_Objetos.Conta;

public class Teste_Tranferencias_Contas {

	public static void main(String[] args) {
		Agencia_de_bancos agencia_a = new Agencia_de_bancos(111);
		Conta conta_a = new Conta(agencia_a);
		Conta conta_b = new Conta(agencia_a);
		conta_a.Depositar(1000.0);
		conta_b.Depositar(1000.0);
		
		
		Conta.Transferir_Valor_Contas(111.0, conta_a, conta_b);
		
		System.out.printf("Saldo conta 1: %2f\nSaldo conta 2: %2f",conta_a.ConsuldaSaldo(),conta_b.ConsuldaSaldo());
		
	}

}
