package Static;

import Orientacao_Objetos.Funcionario;

public class Teste_FuncionarioValeRefeicao {

	public static void main(String[] args) {
		Funcionario fun = new Funcionario();

		fun.setValeRefei��o(100);
		System.out.println(fun.getValeRefei��o());
		fun.AjustaTaxaValeRefeicao(20);
		System.out.println(fun.getValeRefei��o());
		
		
	}

}
