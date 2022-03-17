package entities;

public class Conta {
	
	//variaveis
	private int number;
	private String holder;
	private double saldo;
	
	//construtores
	public Conta(int number, String holder, double depositoInicial) {
		this.number = number;
		this.holder = holder;
		deposit(depositoInicial);
	}

	public Conta(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	
	//getters e setters
	public int getNumber() {
		return number;
	}


	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getSaldo() {
		return saldo;
	}
	
	//operações de deposito e saque
	public void deposit (double valor) {
		saldo += valor;
	}
	
	public void withdraw (double valor) {
		saldo -= valor + 5.0;
	}
	
	public String toString() {
		return "Account "
				+ number 
				+ ", Holder: "
				+ holder
				+ ", Balance: $ "
				+ String.format("%.2f", saldo);
	}
	


}
