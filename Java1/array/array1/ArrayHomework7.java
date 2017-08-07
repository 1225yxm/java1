package array1;

public class ArrayHomework7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {18,25,7,36,13,2,89,63};
		int arr2[]=new int [8];
		for(int i=arr1.length-1;i>=0;i--) {
			arr2[arr1.length-1-i]=arr1[i];
			
		}
		
		for(int j=0;j<arr2.length;j++) {
			System.out.println(arr2[j]);
		}

	}

}
