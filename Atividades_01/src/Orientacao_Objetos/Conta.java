package Orientacao_Objetos;

public class Conta {

	public int Num_conta;
	double saldo;
	double limite = 100;
	public Agencia_de_bancos agencia;
	
	
	public Conta(Agencia_de_bancos agencia) {
		this.agencia = agencia;
	}

	
	public static void Transferir_Valor_Contas(double Valor,Conta conta_1,Conta conta_2) {
		conta_1.saldo -= Valor;
		conta_2.saldo += Valor;
		
	}
	
	
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
