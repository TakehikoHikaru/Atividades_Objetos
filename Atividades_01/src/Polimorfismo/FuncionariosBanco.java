package Polimorfismo;

public abstract class FuncionariosBanco {

	String dataEntrada;
	String dataSaida;
	
	
	public void EntradaFuncionario(String data) {
		this.dataEntrada = data;
	}
	
	public void SaidaFuncionario(String data) {
		this.dataSaida = data;
	}
	
	
	
}
