package sub1_1;

public class Account2 {
	
	//인스턴스의 속성은 변수로
	String bank;
	String id;
	String name;
	int balance;
	
	//기능은 메서드로
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) {
		balance-=money;
	}
	
	public void show () {
		System.out.println("은행명 : " + this.bank);
		System.out.println("계좌번호 : " + this.id);
		System.out.println("입금주 : " + this.name);
		System.out.println("현재잔액 : " + this.balance);
	}

}
