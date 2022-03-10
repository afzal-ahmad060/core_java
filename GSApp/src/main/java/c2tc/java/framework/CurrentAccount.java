package c2tc.java.framework;

public class CurrentAccount extends BankAccount{

	protected final float creditLimit = 1000;
	
	public CurrentAccount(int account_no, String account_name, float account_bal) {
		super(account_no, account_name, account_bal);
	}

}
