package Orientacao_Objetos;

public class Funcionario {

	private String Nome_funcionario;
	private double salario = 1000;
	private double ValeRefei��o;
	private double Bonificacao = 10;
	
	public void AumentoSalario(double valor) {
		salario += valor;
	}
	
	public void ConsultaDados() {
		System.out.printf("\nNome: %s \nSalario: %f\nBonifi��o: %f\n",this.Nome_funcionario,this.salario,this.Bonificacao);
	}

	

	public void setBonificacao(double bonificacao) {
		Bonificacao = bonificacao;
	}

	public void AjustaTaxaValeRefeicao(double taxa) {
		ValeRefei��o += ((ValeRefei��o/100)*taxa);
	}
	
	
	public void BonificacaoSalario() {
		this.salario += ((salario/100)*Bonificacao);
	}
	
	
	public double getBonificacao() {
		return Bonificacao;
	}
	
	
	public String getNome_funcionario() {
		return Nome_funcionario;
	}

	public void setNome_funcionario(String nome_funcionario) {
		Nome_funcionario = nome_funcionario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getValeRefei��o() {
		return ValeRefei��o;
	}

	public void setValeRefei��o(double valeRefei��o) {
		ValeRefei��o = valeRefei��o;
	}

	
}
