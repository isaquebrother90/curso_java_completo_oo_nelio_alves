package entities;

public class Account {

	private String number;
	private String holder;
	private double balance;
	
	public Account() {
		
	}
	
	public Account(String number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}
	
	public Account(String number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public String getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double depositValue) {
		balance += depositValue;
	}
	
	public void withdraw(double withdrawValue) {
		double tax = 5.0;
		balance -= (withdrawValue + tax);
	}
	
	public String toString() {
		return "Account "
				+ number
				+ ", Holder: "
				+ holder
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}
	
}
