package entities;

public class Account {
	
	public static double DEPOSIT_FEE_PERCENTAGE = 0.02;

	private Long idLong;
	private Double balance;
	
	public Account() {
	}
	
	public Account(Long idLong, Double balance) {
		super();
		this.idLong = idLong;
		this.balance = balance;
	}

	public Long getIdLong() {
		return idLong;
	}

	public void setIdLong(Long idLong) {
		this.idLong = idLong;
	}

	public Double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		if (amount > 0) {
			amount -= amount * DEPOSIT_FEE_PERCENTAGE;
			balance += amount;
		}
	}
	
	public void withdraw(double amount) {
		if (amount > balance) {
			throw new IllegalArgumentException();
		}
		balance -= amount;
	}
	
	public double fullWithdraw() {
		double aux = balance;
		balance = 0.0;
		return aux;
	}
		
}
