package Orientacao_Objetos;

public class Telefonistas extends Funcionario{

	int codEstacao;
	
	public void ConsultaDados() {
		System.out.printf("\nNome: %s \nSalario: %f\nBonifição: %f\nCodigo Estação: %d\n",this.getNome_funcionario(),this.getSalario(),this.getBonificacao(),this.codEstacao);
	}
}
