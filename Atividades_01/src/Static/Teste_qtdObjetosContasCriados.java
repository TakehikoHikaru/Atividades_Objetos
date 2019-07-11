package Static;

import Orientacao_Objetos.Conta;

public class Teste_qtdObjetosContasCriados {

	public static void main(String[] args) {
		System.out.println(Conta.qtdObjetosCriados);
		Conta c1 = new Conta();
		Conta c2 = new Conta();
		Conta c3 = new Conta();
		Conta c4 = new Conta();

		System.out.println(Conta.qtdObjetosCriados);
		System.out.println(c1.codUni);
		System.out.println(c2.codUni);
		
		Conta.ZerarContador();
		Conta c5 = new Conta();
		Conta c6 = new Conta();
		Conta.ZerarContador();
	}

}
