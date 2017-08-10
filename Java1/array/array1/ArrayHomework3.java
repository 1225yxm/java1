package array1;

public class ArrayHomework3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[ ][ ]= {{2,3,4},{4,6,8}};
		int arr2[ ][ ]= {{1,5,2,8},{5,9,10,-3},{2,7,-5,-18}};
		int arr3[ ][ ]= {{0,0,0,0},{0,0,0,0}};
		for(int i=0;i<2;i++){
			for(int j=0;j<4;j++) {
				arr3[i][j]=arr1[i][0]*arr2[0][j]+arr1[i][1]*arr2[1][j]+arr1[i][2]*arr2[2][j];
			}
		}
		for(int i=0;i<arr3.length;i++) {
			for (int j=0;j<arr3[i].length;j++) {
				System.out.print(arr3[i][j]);
				System.out.print('\t');
			}
			System.out.println();
		}
		

	}

}
