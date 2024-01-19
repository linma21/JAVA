package weektest5;

public class Account {
	private String accNo;
	private String userName;
	private int balance;
		
	public Account(String accNo, String userName, int balance) {
		this.accNo = accNo;
		this.userName = userName;
		this.balance = balance;
	}
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}
