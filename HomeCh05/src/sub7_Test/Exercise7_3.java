package sub7_Test;

class Product{
	int price;
	int bonusPoint;
	
	public Product(int price, int bonusPoint) {
		this.price = price;
		this.bonusPoint = (int) (price / 10.0);
	}
}
class Tv extends Product {
	

	public Tv(int price, int bonusPoint) {
		super(price, bonusPoint);
	}

	@Override
	public String toString() {
		return "Tv";
	}
	
}
public class Exercise7_3 {
	public static void main(String[] args) {
		Tv t = new Tv(0, 0);
	}
}
