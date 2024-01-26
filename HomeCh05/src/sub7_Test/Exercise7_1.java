package sub7_Test;
class SutdaDeck{
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck() {
		boolean b;
		SutdaCard card;
		
		for(int i=0; i <10 ; i++) {
			if(i==0 || i==2 || i==7) {
				b = true;
				card = new SutdaCard(i+1,b);
				cards[i] = card;
			}else {
				b = false;
				card = new SutdaCard(i+1,b);
				cards[i] = card;
			}
			
		}
		for(int i=0; i <10 ; i++) {
			b= false;
			card = new SutdaCard(i+1,b);
			cards[i+10] = card;
		}
	}
}
class SutdaCard {
	int num;
	boolean isKwang;
	
	SutdaCard(){
		this(1, true);
	}

	public SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	@Override
	public String toString() {
		return num + (isKwang ? "K" : "");
	}	
}
public class Exercise7_1 {
	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		
		for(int i=0 ;i<deck.cards.length; i++) {
			System.out.print(deck.cards[i]+ ", ");
		}
	}
}
