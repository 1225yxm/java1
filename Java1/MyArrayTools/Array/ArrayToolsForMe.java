package Array;

import javax.lang.model.element.VariableElement;
import javax.naming.spi.DirStateFactory.Result;

import org.apache.commons.lang3.ArrayUtils;

public class ArrayToolsForMe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[ ]  array= {1,2,23,12,12,34,6,67,68,89};
		int[ ]  array2= {1,2,23,6,67,68,89};
		int[ ] result= {};
		//数组输出
		printarray(array);
		//追加元素
//		result=addElement(array, 100);
//		printarray(result);
		
		//删除下标为num的元素
//		result=removEelement(array, 8);
//		printarray(result);
		
		//在指定位置添加元素
//		result=addElementIHere(array, 3, 111);
//		printarray(result);
		
		//在指定位置截取n个元素
//		result=subElement(array, 3, 2);
//		printarray(result);
		
		//合并两个数组
//		result=combineArray(array, array2);
//		printarray(result);
		
		
		//数组排序从小到大
//		result=arraysortasc(array2);
//		printarray(result);
		
		//数组排序从大到小
//		result=arraysortamc(array2);
//		printarray(result);
		
		//数组去重
		result=removeTheSame(array);
		printarray(result);

	}
	
	
	//数组的输出
	public static void printarray(int[ ] array) {
		for (int i : array) {
			System.out.print(i+"\t");
		}
		
		System.out.println();
	}
	//追加元素
	public static int[ ] addElement(int [ ]array,int element) {
		int[ ] result=new int [array.length+1];
		for(int i=0;i<array.length;i++) {
			result[i]=array[i];
		}
		result[array.length]=element;
		return result;
	}
	
	//删除下标为num的元素
	public static int [ ] removEelement(int[ ]array,int num) {
		int[ ] result=new int [array.length-1];
		System.arraycopy(array, 0, result, 0, num);
		System.arraycopy(array, num+1, result, num, array.length-num-1);
		return result;
	}
	
	//在指定位置添加元素
	public static int [ ] addElementIHere(int [ ]array,int num,int element){
		int[ ] result=new int [array.length+1];
		System.arraycopy(array, 0, result, 0, num);
		result[num]=element ;
		System.arraycopy(array, num, result, num+1, array.length-num);
		return result;
	}
	
	//从指定位置截取几个元素
	public static int [ ] subElement(int [ ]array,int num,int several) {
		int[ ] result=new int [several];
		System.arraycopy(array, num, result, 0, several);
		return result;
	}
	
	//合并两个数组
	public static int[ ] combineArray(int[ ] array1,int[ ]array2) {
		int[ ] result=new int [array1.length+array2.length];
		System.arraycopy(array1, 0, result, 0, array1.length);
		System.arraycopy(array2, 0, result, array1.length, array2.length);
		return result;
	}
	
	//数组排序(从小到大)
	public static int  [ ] arraysortasc(int [ ]array) {
		//int[ ] result=new int [array.length];
		int temp=0;
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length-1;j++) {
				if(array[j]>array[j+1]) {
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		return array;
	}
	
	//数组排序(从大到小）
	public static int  [ ] arraysortamc(int [ ]array) {
		//int[ ] result=new int [array.length];
		int temp=0;
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length-1;j++) {
				if(array[j]<array[j+1]) {
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		return array;
	}
	
	//数组元素去重
	public static int [ ] removeTheSame(int[ ]array) {
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]==array[j]) {
					array=removEelement (array,j);
				}
			}
		}
		return array;
	}
	
}
