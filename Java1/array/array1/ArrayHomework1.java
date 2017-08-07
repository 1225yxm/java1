package array1;

public class ArrayHomework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,40,50};
		
		for(int i=0;i<5;i++) {
			System.out.println(arr[i]);
		}
		
		int arr2[]=new int[5];
		for (int j=0;j<5;j++) {
			arr2[j]=arr[j];
		}
		
		for(int i=0;i<5;i++) {
			System.out.println(arr2[i]);
		}

	}

}
