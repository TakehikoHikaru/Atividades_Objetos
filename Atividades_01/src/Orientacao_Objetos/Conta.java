package Orientacao_Objetos;

public class Conta {

	public int Num_conta;
	double saldo;
	double limite = 100;
	public Agencia_de_bancos agencia;
	public static int qtdObjetosCriados;
	public static int codUni;
	
	public Conta() {
		qtdObjetosCriados++;
		codUni = qtdObjetosCriados;
	}
	
	public Conta(Agencia_de_bancos agencia) {
		this.agencia = agencia;
		qtdObjetosCriados++;
		codUni = qtdObjetosCriados;
	}

	
	public static void Transferir_Valor_Contas(double Valor,Conta conta_1,Conta conta_2) {
		conta_1.saldo -= Valor;
		conta_2.saldo += Valor;
		
	}
	
	public static void ZerarContador() {
		System.out.println("Total de contas criadas = " + qtdObjetosCriados);
		qtdObjetosCriados = 0;
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
