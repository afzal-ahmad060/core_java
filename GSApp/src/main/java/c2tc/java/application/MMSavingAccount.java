package c2tc.java.application;

import c2tc.java.framework.SavingAccount;

public class MMSavingAccount extends SavingAccount{

	public MMSavingAccount(int account_no, String account_name, float account_bal) {
		super(account_no, account_name, account_bal);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(float account_bal) {
		System.out.println("You have withdrawn from balance : "+account_bal);
	}

	@Override
	public String toString() {
		return "MMSavingAccount [isSalary()=" + isSalary() + ", toString()=" + super.toString() + ", getAccount_no()="
				+ getAccount_no() + ", getAccount_name()=" + getAccount_name() + ", getAccount_bal()="
				+ getAccount_bal() + "]";
	}

}
