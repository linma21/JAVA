package test2_2;

public class Test3 {
	public static void main(String[] args) {
		
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		for(int i=0; i < arr.length; i++) {
			System.out.print(arr[i]+", ");
		}
		System.out.println();
		
		for(int j= 0; j <arr.length /2 ; j++) {
			int temp = arr[j];
			arr[j] = arr[9-j];
			arr[9-j] = temp;
		}
		
		for(int n : arr) {
			System.out.print(n+", ");
		}
	}

}
