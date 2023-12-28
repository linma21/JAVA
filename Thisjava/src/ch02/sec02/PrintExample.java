package ch02.sec02;
//69
public class PrintExample {
	public static void main(String[] args) {
		int value =123;
		System.out.printf("상품의 가격 : %d원\n", value);  //정수
		System.out.printf("상품의 가격 : %6d원\n", value); //6자리 정수 왼쪽 공백
		System.out.printf("상품의 가격 : %-6d원\n", value);//6자리 정수 오른쪽 공백
		System.out.printf("상품의 가격 : %06d원\n", value);//6자리 정수 공백 0 채움
		}

}
