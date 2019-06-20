package Orientacao_Objetos;

public class Cartao_Credito {

	int Num_Cartao;
	public String date_de_validade;
	public Cliente cliente;
	
	void comprar() {
		System.out.println("compra feita");
	}
	
	


public static void main(String[] args) {
	
	Cartao_Credito a = new Cartao_Credito();
	a.Num_Cartao = 1;
	Cartao_Credito b = new Cartao_Credito();
	b.Num_Cartao = 5;
	System.out.print(a.Num_Cartao +" "+ b.Num_Cartao);
	
	
	
	
	
	
}

}

