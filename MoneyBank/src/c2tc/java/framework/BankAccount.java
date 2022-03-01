package c2tc.java.framework;

public class BankAccount {
	
	private int account_no;
	private String account_name;
	private float account_bal;
	
	
	
	
	public BankAccount(int account_no, String account_name, float account_bal) {
		super();
		this.account_no = account_no;
		this.account_name = account_name;
		this.account_bal = account_bal;
	}
	
	public int getAccount_no() {
		return account_no;
	}
	public void setAccount_no(int account_no) {
		this.account_no = account_no;
	}
	public String getAccount_name() {
		return account_name;
	}
	public void setAccount_name(String account_name) {
		this.account_name = account_name;
	}
	public float getAccount_bal() {
		return account_bal;
	}
	public void setAccount_bal(float account_bal) {
		this.account_bal = account_bal;
	}
	
	
	
	
	public void withdraw(float account_bal)
	{
		
	}
	public void deposit(float account_bal)
	{
		
	}
	@Override
	public String toString() {
		return "BankAccount [account_no=" + account_no + ", account_name=" + account_name + ", account_bal="
				+ account_bal + "]";
	}
	

}
