package array1;

public class ArrayHomework6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=0,num=0;
		int arr1[]= {18,25,7,36,13,2,89,63};
		
		for (int i : arr1) {
			
		}
		
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]>max) {
				max=arr1[i];
				num=i;
			}
		}
		
		System.out.println("数组中最大的数为："+max+"下标为："+num);

	}

}
