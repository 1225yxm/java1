package array1;

public class ArrayHomework9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {-10,2,3,246,-100,0,5};
		int add=0,avg=0;
		int max=0;
		int min=0,temp=0;
		for(int i=0;i<arr.length;i++) {
			add=add+arr[i];
		}
		avg=add/arr.length;
		System.out.println("平均值："+avg);
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
		}
		max=arr[arr.length-1];
		min=arr[0];
		System.out.println("最大值："+max);
		System.out.println("最小值："+min);

	}

}
