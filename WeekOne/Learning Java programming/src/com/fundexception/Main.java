package com.fundexception;

public class Main {
	int balance;
	
	public Main(int balance) {
		this.balance = balance;
	}
	
	public void deposit(int amount) throws FundException{
		if (amount > 0) {
			this.balance += amount;
		}else {
			throw new FundException("Invalid Amount Exception");
		}
		System.out.println("Balance: "+this.balance);
	}
	
	public void withdraw(int amount) throws FundException{
		if(amount <= balance) {
			balance = balance-amount;
		}else {
			throw new FundException("Insufficient Balance");
		}
		System.out.println("Balance: "+this.balance);
	}
	
	public static void main(String[] args) {
		Main x = new Main(20);
		try {
			x.deposit(50);
			x.withdraw(100);
		}catch (Exception e) {
			System.out.println(e);
		}
	}
}
