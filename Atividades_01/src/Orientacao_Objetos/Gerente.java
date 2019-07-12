package Orientacao_Objetos;

public class Gerente extends Funcionario{

	String gerenteNomeDeUsuario;
	String gerenteSenha; 
	protected double Bonificacao = 15;
	
	public void AumentoSalario() {
	setSalario(getSalario()+(getSalario()/100)*10);
	}

	
	public void AumentoSalario(int taxa) {
		setSalario(getSalario() + (getSalario()/100)*taxa);
	}
	public void BonificacaoSalario() {
		setSalario(((getSalario()/100)*Bonificacao)+ getSalario());
	}
	@Override
	public void ConsultaDados() {
		System.out.printf("\nNome: %s \nSalario: %f\nBonifição: %f\nNome de Usuario: %s\nSenha: %s\n",getNome_funcionario(),getSalario(),this.Bonificacao,this.gerenteNomeDeUsuario,this.gerenteSenha);
	}
}