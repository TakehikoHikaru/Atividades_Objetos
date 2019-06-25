package Orientacao_Objetos;

public class Funcionario {

	public String Nome_funcionario;
	public double salario = 1000;
	
	public void AumentoSalario(double valor) {
		salario += valor;
	}
	
	public void ConsultaDados() {
		System.out.printf("\nNome: %s \nSalario: %f\n",this.Nome_funcionario,this.salario);
	}
}
