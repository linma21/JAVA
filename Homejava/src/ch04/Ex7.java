package ch04;
//109

public class Ex7 {
	public static void main(String[] args) {
	
		 for(	int i = 1; i <= 20 ; i++){
			 
			 System.out.println(Math.random()); //0.0<=x<1.0
			 System.out.println(Math.random()*10); //0.0<=x<10.0
			 System.out.println((int)(Math.random()*10)); //0<=x<10
			 System.out.println((int)(Math.random()*10+1)); //1<=x<1
			 System.out.println((int)(Math.random()*11-5)); //-5<=x<6
			 System.out.println((int)(Math.random()*10+1)); //1<=x<1
		 }						
	}

}
