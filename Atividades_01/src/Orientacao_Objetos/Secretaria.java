package Orientacao_Objetos;

public class Secretaria extends Funcionario{

	int numRamal;
	
	public void ConsultaDados() {
		System.out.printf("\nNome: %s \nSalario: %f\nBonifi��o: %f\nNumero ramal: %d\n",getNome_funcionario(),getSalario(),getBonificacao(),this.numRamal);
	}

	
}
