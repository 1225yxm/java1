package array1;

import java.lang.reflect.Array;

import org.apache.commons.lang3.ArrayUtils;

public class ArrayHomework8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {18,25,7,63,13,25,89,63};
		for(int i=0;i<arr1.length;i++) {
			for(int j=i+1;j<arr1.length;j++) {
				if(arr1[i]==arr1[j]) {
					arr1=ArrayUtils.remove (arr1,j);
				}
			}
		}
		
		for (int i : arr1) { 
			System.out.println(i);
		}
		

	}

}
