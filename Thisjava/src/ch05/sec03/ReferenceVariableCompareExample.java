package ch05.sec03;

public class ReferenceVariableCompareExample {
	public static void main(String[] args) {
		int[] arr1;  //배열변수 선언
		int[] arr2;
		int[] arr3; 
		
		arr1 = new int[] {1,2,3};
		arr2 = new int[] {1,2,3};
		arr3 = arr2;
		
		System.out.println(arr1==arr2); //arr1과 arr2가 같은 배열을 참조 했는지 검사
		System.out.println(arr2==arr3); 
	}
	/*
	 * arr1과 arr2는 저장항목은 같지만 서로 다른 배열 객체로 생성되어 arr1과 arr2에 대입되는 번지는 다르다.
	 */
}
