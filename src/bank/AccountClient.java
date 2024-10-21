package bank;

public class AccountClient {

	private double balance = 500000;
	private long accountNumber = 98798585;
	private String accountType = "Vadesiz" ;
	
	public String info() {
		return "Hesap Numarası: " + accountNumber + 
	     "\nHesap Türü: " + accountType + 
	     "\nBakiye: " + balance + " TL";
		
	}
	
	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	public void Account(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public double getAccountNumber() {
		return accountNumber;
	}
	
	
	public void ParaCek(double balance) {
		this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
