package ClassesAbistratas_teste;


import ClassesAbistratas.ContaPoupan�a;

public class Teste_ContaAbs {

	public static void main(String[] args) {

		ContaPoupan�a con01 = new ContaPoupan�a();
		
		
		con01.setSaldo(1000);
		con01.GeradorDeEstrato();
	}

}
