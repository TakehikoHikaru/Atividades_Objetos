package Static;

import Orientacao_Objetos.Funcionario;
import Orientacao_Objetos.Gerente;
import Orientacao_Objetos.Secretaria;
import Orientacao_Objetos.Telefonistas;

public class Teste_TiposFuncionarios {

	public static void main(String[] args) {

		Funcionario ge = new Gerente();
		Funcionario se = new Secretaria();
		Funcionario te = new Telefonistas();
		
		ge.ConsultaDados();
		te.ConsultaDados();
		se.ConsultaDados();
	
		
		
		
	}

}
