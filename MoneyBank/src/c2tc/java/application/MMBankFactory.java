package c2tc.java.application;

import c2tc.java.framework.BankFactory;
import c2tc.java.framework.CurrentAccount;
import c2tc.java.framework.SavingAccount;

public class MMBankFactory implements BankFactory{

	@Override
	public SavingAccount getNewSavingAccount(int account_no, String account_name, float account_bal) {
		SavingAccount sa = new SavingAccount(account_no,account_name,account_bal);
		return null;
	}

	@Override
	public CurrentAccount getNewCurrentAccount(int account_no, String account_name, float account_bal) {
		CurrentAccount sa = new CurrentAccount(account_no,account_name,account_bal);
		return null;
	}
	
	

}
