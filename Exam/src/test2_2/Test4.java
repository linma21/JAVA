package test2_2;

public class Test4 {
	public static void main(String[] args) {
		
		int arr[]= {4,2,1,5,3};
		
		for(int i =0; i<arr.length-1 ; i++) {
			for(int j =i+1 ; j< arr.length ; j++) {
				
				if(arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		for(int n : arr) {
			System.out.print(n + " ");
		}
	}
}
