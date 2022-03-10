package c2tc.java.framework;

public interface BankFactory {
	public SavingAccount getNewSavingAccount(int account_no, String account_name, float account_bal);
	public CurrentAccount getNewCurrentAccount(int account_no, String account_name, float account_bal);

}
