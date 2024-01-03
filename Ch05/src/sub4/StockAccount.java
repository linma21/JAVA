package sub4;

public class StockAccount extends Account {
	
	private String stock;
	private int amount;
	private int price;
	
	public StockAccount(String bank,String id,String name,int balance,String stock,int amount,int price) { //생성자
		super(bank,id,name,balance);
		this.stock = stock;
		this.amount = amount;
		this.price =  price;
	}
	
	public void sell(int amount, int price) {
		this.amount -= amount;
		this.balance += amount * price; //ctrl + 클릭-> 해당 변수가 선언된 클래스로 이동
	}
	public void buy(int amount, int price) {
		this.amount += amount;
		this.balance -= amount * price;
	}
	public void show() {
		super.show();
		System.out.println("주식종목 : "+ this.stock);
		System.out.println("주식수량 : "+ this.amount);
		System.out.println("주식가격 : "+ this.price);
	}

}
