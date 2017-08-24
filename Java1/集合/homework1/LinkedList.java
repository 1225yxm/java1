package homework1;

import org.w3c.dom.css.ElementCSSInlineStyle;

public class LinkedList {
	
	private static java.util.LinkedList linkedList=new java.util.LinkedList<>();
	
	
	public static void put(Object b) {
		linkedList.addLast(b);	
	}
	
	public static Object get() {
		return linkedList.removeFirst();
		
	}
	
	public static boolean isEmpty() {
		if(linkedList.size()==0) {
			return false;
		}else return true;	
	}

	public java.util.LinkedList getLinkedList() {
		return linkedList;
	}

	public void setLinkedList(java.util.LinkedList linkedList) {
		this.linkedList = linkedList;
	}
	
	
	

}
