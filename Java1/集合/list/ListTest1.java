package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import homework1.LinkedList;

public class ListTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list=new ArrayList(5);
		list.add("2");
		list.add(3);
		list.add("1");
		list.add(1);
		
		for (Object object : list) {
			System.out.println(object);
		}
		
//		list.remove("1");
		System.out.println("-------------------------------");
		ListIterator it=list.listIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		System.out.println("-------------------------------");
		ListIterator listIterator=list.listIterator();
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		
		System.out.println("-------------------------------");
		while(it.hasPrevious()) {
			System.out.println(it.previousIndex()+":"+it.previous());
		}
		

	}

}
