package ClassesAbistratas_teste;


import ClassesAbistratas.ContaPoupança;

public class Teste_ContaAbs {

	public static void main(String[] args) {

		ContaPoupança con01 = new ContaPoupança();
		
		
		con01.setSaldo(1000);
		con01.GeradorDeEstrato();
	}

}
