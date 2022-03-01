package c2tc.java;

import c2tc.java.application.MMBankFactory;
import c2tc.java.application.MMCurrentAccount;
import c2tc.java.application.MMSavingAccount;
import c2tc.java.framework.BankFactory;
import c2tc.java.framework.CurrentAccount;
import c2tc.java.framework.SavingAccount;

public class Client {

	public static void main(String[] args) {
		BankFactory bf = new MMBankFactory();
		SavingAccount sa = new MMSavingAccount(100,"Afzal Ahmad",5000);
		sa.withdraw(1000);
		
		CurrentAccount ca = new MMCurrentAccount(101,"ABC",999);
		ca.withdraw(200);
		
		

	}

}
