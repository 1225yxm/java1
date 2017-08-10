package array1;

public class ArrayHomework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  arr1[]= {"neusofteducation"};
		
		String arr2[]= {"0"};
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		
		for(int i=0;i<arr2.length;i++) {
			
			System.out.println(arr2[i]);
		}
		
			
		}

	}


