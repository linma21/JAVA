package sub7_Test;


class SutdaDeck2 {
	final int CARD_NUM = 20;
	SutdaCard2[] cards = new SutdaCard2[CARD_NUM];
	
	SutdaDeck2() {
		boolean b;
		SutdaCard2 card;
		
		for(int i=0; i <10 ; i++) {
			if(i==0 || i==2 || i==7) {
				b = true;
				card = new SutdaCard2(i+1,b);
				cards[i] = card;
			}else {
				b = false;
				card = new SutdaCard2(i+1,b);
				cards[i] = card;
			}
			
		}
		for(int i=0; i <10 ; i++) {
			b= false;
			card = new SutdaCard2(i+1,b);
			cards[i+10] = card;
		}
	}
	
	void Shuffle () {
		for(int i = cards.length -1; i>0; i--) {
			int j = (int)(Math.random()*(i+1));
			
			SutdaCard2 temp = cards[i];
			cards[i] = cards[j];
			cards[j] = temp;
				
			}
		}
	SutdaCard2 Pick (int index) {
		return cards[index];		
	}
	SutdaCard2 Pick () {
		return cards[(int)(Math.random()*20)];		
	}
}
class SutdaCard2 {
	int num;
	boolean isKwang;
	
	SutdaCard2(){
		this(1, true);
	}

	public SutdaCard2(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	@Override
	public String toString() {
		return num + (isKwang ? "K" : "");
	}	
}
public class Exercise7_2 {
	public static void main(String[] args) {
		SutdaDeck2 deck = new SutdaDeck2();
		
		System.out.println(deck.Pick(0));
		System.out.println(deck.Pick());
		deck.Shuffle();
		
		for(int i=0 ;i<deck.cards.length; i++) {
			System.out.print(deck.cards[i]+ ", ");
		}
		System.out.println();
		System.out.println(deck.Pick(0));
	}
}
