package ClassesAbistratas;

public class ContaPoupanša extends ContaDeBancos{
	
	private double saldo;
	
	
	@Override
	public void GeradorDeEstrato() {
		System.out.println(getSaldo());
	}


	
	
	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
	
	
	
}
