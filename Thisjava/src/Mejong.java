import java.util.Scanner;

public class Mejong {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int length = sc.nextInt();
		
		if(length >= 170) {
			System.out.println("도유니 입니다.");
		}else if (length >= 165) {
			System.out.println("허구리 입니다.");
		}else if(length >= 160){
			System.out.println("최이진 입니다.");
		}else {
			System.out.println("매종 입니다.");
		}
	}
}
