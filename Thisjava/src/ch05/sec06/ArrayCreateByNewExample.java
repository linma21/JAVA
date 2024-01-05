package ch05.sec06;
//173
public class ArrayCreateByNewExample {
	public static void main(String[] args) {
		//배열변수 선언과 배열 생성
		int [] arr1 = new int[3]; //길이 3의 배열을 생성 정수 배열은 0, 실수 배열은 0.0 참조 배열은 null로 초기화
		
		for(int i =0 ; i<3 ; i++) {
			System.out.print("arr1["+i+"] :" + arr1[i]);
		}
		System.out.println();
		
		arr1[0]= 10;
		arr1[1]= 20;
		arr1[2]= 30;
		
		for(int i =0 ; i<3 ; i++) {
			System.out.print("arr1["+i+"] :" + arr1[i]);
		}
		System.out.print("\n");
		
		
		//배열 변수 선언과 배열 생성
		double[] arr2 = new double[3]; // 0.0으로 초기화
		
		for(int i =0 ; i<3 ; i++) {
			System.out.print("arr2["+i+"] :" + arr2[i]);
		}
		System.out.println();
		
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		
		for(int i =0 ; i<3 ; i++) {
			System.out.print("arr2["+i+"] :" + arr2[i]);
		}
		System.out.println();
		
         String [] arr3 = new String[3]; //참조 배열은 null로 초기화
		
		for(int i =0 ; i<3 ; i++) {
			System.out.print("arr3["+i+"] :" + arr3[i]);
		}
		System.out.println();
		
		arr3[0]= "1월";
		arr3[1]= "2월";
		arr3[2]= "3월";
		
		for(int i =0 ; i<3 ; i++) {
			System.out.print("arr3["+i+"] :" + arr3[i]);
		}
		System.out.print("\n");
	}

}
