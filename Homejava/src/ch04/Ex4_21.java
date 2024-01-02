package ch04;
//120 continue 다음 반복으로 넘어감 break 반복 중지 
public class Ex4_21 {
	public static void main(String[] args) {
		for(int i= 0; i <= 10;i++) {
			if(i%2==0)
				continue;   //i가 2의 배수일 때 반복문(for)의 끝부분으로 이동한다. 즉 continue와 반복문의 } 사이의 문장을 건너뛴다.
			System.out.println(i);
				
			}				
	}
}
