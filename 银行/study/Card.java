package study;

public class Card {
	private String id;
    private double balance;
    
	public Card() {

	}
	
	public Card(String id, double balance) {
		this.id = id;
		this.balance = balance;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "ø®∫≈ :" + id + "\n" + "”‡∂Ó:" + balance ;
	}
    
}
