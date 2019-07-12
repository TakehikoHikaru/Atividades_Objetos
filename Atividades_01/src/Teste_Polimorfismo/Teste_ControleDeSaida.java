package Teste_Polimorfismo;

import Polimorfismo.FuncionariosBanco;
import Polimorfismo.GerentesBanco;
import Polimorfismo.TelefonistasBanco;

public class Teste_ControleDeSaida {

	public static void main(String[] args) {
		
		FuncionariosBanco fun01 = new GerentesBanco();
		FuncionariosBanco fun02 = new TelefonistasBanco();
		
		fun01.EntradaFuncionario("11/02/2011");
		fun01.SaidaFuncionario("11/02/2012");
		
		fun02.EntradaFuncionario("12/02/2011");
		fun02.SaidaFuncionario("15/12/2011");
		
	}

}
