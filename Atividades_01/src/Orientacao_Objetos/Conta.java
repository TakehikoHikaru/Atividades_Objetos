package Orientacao_Objetos;

public class Conta {

	public int Num_conta;
	double saldo;
	double limite = 100;
	public Agencia_de_bancos agencia;
	
	public void Depositar(double valor) {
		this.saldo += valor;
	}
	
	public void Saque(double valor) {
		this.saldo -= valor;
	}
	
	void TirarExtrato(int dias) {
		//Corpo
	}
	
	public double ConsuldaSaldo() {
		return this.saldo;
	}
	
}
