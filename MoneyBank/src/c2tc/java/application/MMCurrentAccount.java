package c2tc.java.application;

import c2tc.java.framework.CurrentAccount;

public class MMCurrentAccount extends CurrentAccount{

	public MMCurrentAccount(int account_no, String account_name, float account_bal) {
		super(account_no, account_name, account_bal);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(float account_bal) {
		if(account_bal < creditLimit)
			System.out.println("You do not have the sufficient amount of Credit balance to perform this operation.");
		else
			System.out.println("You have withdrawn successfully. Account balance is : "+account_bal+
					"Minimum required balance is : "+creditLimit);
	}


}
