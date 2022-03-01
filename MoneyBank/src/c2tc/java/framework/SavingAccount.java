package c2tc.java.framework;

public class SavingAccount extends BankAccount{
	private boolean isSalary = true;
	

	public SavingAccount(int account_no, String account_name, float account_bal) {
		super(account_no, account_name, account_bal);
	}
	
	public boolean isSalary() {
		return isSalary;
	}
	public void setSalary(boolean isSalary) {
		this.isSalary = isSalary;
	}


	@Override
	public String toString() {
		return "SavingAccount [isSalary=" + isSalary + ", getAccount_no()=" + getAccount_no() + ", getAccount_name()="
				+ getAccount_name() + ", getAccount_bal()=" + getAccount_bal() + "]";
	}
	

}
