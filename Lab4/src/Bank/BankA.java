package Anudip;

public class BankA extends Bank {

	@Override
	void getBalance(int balance) {
		
		System.out.println("the Rs "+balance+" deposited by you in a BankA.");
	}

}