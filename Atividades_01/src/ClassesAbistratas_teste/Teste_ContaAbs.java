package ClassesAbistratas_teste;


import ClassesAbistratas.ContaPoupanša;

public class Teste_ContaAbs {

	public static void main(String[] args) {

		ContaPoupanša con01 = new ContaPoupanša();
		
		
		con01.setSaldo(1000);
		con01.GeradorDeEstrato();
	}

}
