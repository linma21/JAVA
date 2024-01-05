package ch05.sec09;
//187
public class ArrayCopyByForExample {
	public static void main(String[] args) {
		//길이 3인배열 
		int[] oldInArray = {1,2,3};
		//길이 5인 배열을 새로 생성
		int[] newInArray = new int[5];
		//배열 항목을 복사
		for(int i = 0; i< oldInArray.length; i++) {
			newInArray[i] = oldInArray[i];
			
		}
		for(int i = 0; i < newInArray.length;i++) {
			System.out.print(newInArray[i] + ", ");
		}
	}

}
