package Testes;

import Orientacao_Objetos.Cartao_Credito;
import Orientacao_Objetos.Cliente;

public class Teste_Cartao_Cliente {
	
	public static void main(String[] args) {

		Cliente a = new Cliente();
		a.Cliente_Cod = 1;
		a.Cliente_Nome = "alicio";
		Cartao_Credito card =  new Cartao_Credito(33);
		card.date_de_validade = "11/11/2011";
		card.cliente = a;
		
		System.out.println(card.cliente.Cliente_Nome);
	}
}
