package diy;
/*
 * 23/12/28
 * 혼자해보기
 * 별 피라미드
 */
public class B {
	public static void main(String[] args) {
		
	for(int s =0 ; s <= 5 ; s++) {
		for( int i=5 ; i>=s ; i--) {
			System.out.print(" ");
		}	
		  for( int j=1 ; j<= 2*s-1 ; j++) {
			System.out.print("★");
		}
		System.out.println();
	 }
	}		
}
