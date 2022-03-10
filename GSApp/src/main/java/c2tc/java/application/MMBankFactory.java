package c2tc.java.application;

import c2tc.java.framework.BankFactory;
import c2tc.java.framework.CurrentAccount;
import c2tc.java.framework.SavingAccount;

public class MMBankFactory implements BankFactory{

	SavingAccount sa;
	CurrentAccount ca;
	
	public SavingAccount getNewSavingAccount(int account_no, String account_name, float account_bal) {
		try
		{
		SavingAccount sa = new SavingAccount(account_no,account_name,account_bal);
		}
		catch(Exception e)
		{
			System.out.println("An Error Occurred");
		}
		return sa;
	}

	public CurrentAccount getNewCurrentAccount(int account_no, String account_name, float account_bal) {
		try
		{
		CurrentAccount ca = new CurrentAccount(account_no,account_name,account_bal);
		}
		catch(Exception e)
		{
			System.out.println("An Error Occurred");
		}
		return ca;
	}
	
	
	

}