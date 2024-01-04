package test3;
/*
 * 날짜 : 24/01/04
 * 이름 : 최이진
 * 내용 : 인터페이스 연습 문제
 */
interface Buyer {
	public void buy();
}
interface Seller{
	public void sell();
}

class Customers implements Buyer, Seller{

	@Override
	public void sell() {
		System.out.println("판매하기");
		
	}

	@Override
	public void buy() {
		System.out.println("구매하기");		
	}	
}
public class Test3_10 {
	public static void main(String[] args) {
		Buyer buyer = new Customers(); 
	    Seller seller = new Customers();
	    
		buyer.buy();
		seller.sell();
			
	}

}
