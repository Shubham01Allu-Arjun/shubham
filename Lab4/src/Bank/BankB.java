package Anudip;

public class BankB extends Bank{

	@Override
	void getBalance(int balance) {
		
		System.out.println("the Rs "+balance+" deposited by you in a BankB.");
	}

}