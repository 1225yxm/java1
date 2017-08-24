package buycart;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import org.apache.commons.lang3.ArrayUtils;

public class BuyCat {

	private List<Item> items=new ArrayList<>(); 




	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}
	
	public void addItem(Item item) {
		if(items.contains(item)) {
			for (Item i : items) {
				if(i.equals(item)) {
					i.setAmount(i.getAmount()+item.getAmount());
				}
			}
		}
		else {
			items.add(item);
		}
	}
	
	public void removeItem(Item item) {
		if(items.contains(item)) {
			for (Item it : items) {
				if(it.equals(item)) {
					if(it.getAmount()>item.getAmount()) {
						it.setAmount(it.getAmount()-item.getAmount());
					}else if(it.getAmount()==item.getAmount())
					items.remove(it);
				
				}
			}
		}else {
			System.out.println("购物车中没有该商品！");
		}
	}

	//处理购物车中的同一种产品
//	public void handler() {
//		int k=0;
//		for (int i = 0; i < items.length; i++) {
//			for(int j=i;j<items.length-1;j++) {
//				if(items[i].equals(items[j+1])) {
//				items[i].setAmount(items[i].getAmount()+items[j+1].getAmount()); // 6+1
//				items[j+1] = null;		//将重复的置空	
//			}
//				
//			}
//			//删除为空的元素
//			k=items.length;
//			for(int f=0;f<k;f++) {
//				for(int h=0;h<items.length;h++) {
//					if(items[h]==null) {
//						 items=ArrayUtils.remove(items,h);
//					}
//				}
//			}
//			//删除完之后进行下一次循环
//		}
//	}
	
//	public void revamp(Item item ) {
//		boolean bn=false;
//		for(int i=0;i<items.length;i++) {
//			if(item.equals(items[i])) {
//				bn=true;
//				if(item.getAmount()<items[i].getAmount()) {
//					items[i].setAmount(items[i].getAmount()-item.getAmount()); 
//				}
//				else if(item.getAmount()==items[i].getAmount()){
//					items[i].setAmount(items[i].getAmount()-item.getAmount()); 
//					items=ArrayUtils.remove(items,i);
//				}
//				else {
//					System.out.println("删除数量太多了！");break;
//				}
//				
//			}else  continue;
//		}
//		if(!bn) {
//			System.err.println("购物车中没有该商品！");
//		}
//	}
	
//	public void revamp( ) {
//		int k=0;
//		for (int i = 0; i < items.length-1; i++) {
//			if(items[i].equals(items[i+1])) {
//				if(items[i].getAmount()>items[i+1].getAmount()) {
//					items[i].setAmount(items[i].getAmount()-items[i+1].getAmount());
//					items = ArrayUtils.subarray(items, 0, items.length-1);
//				}else if(items[i].getAmount()==items[i+1].getAmount()) {
//					items[i+1] = null;
//					items[i]=null;
//					++k;
//					items = ArrayUtils.subarray(items, 0, items.length-1-k);
//				}else {
//					System.out.println("购物车中没有该商品！");
//				}
//			}
//		}
//	}
	

	public void showBuyCart() {

		for (Item item : items) {
			System.out.println(item);
		}

	}

}
