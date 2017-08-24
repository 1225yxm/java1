package buycart;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.crypto.Data;

public class TestBuy {
	
	public static void main(String[] args) {
		
		String [ ]color={"红色", "土豪金", "玫瑰红"};
		Product p1 = new Product(1, "Java从入门到精通", 100);
		Product p2 = new Product(2, "iphone 8", 10,color);
		Product p3 = new Product(3, "iphone 13", 10);
		
		Customer c1 = new Customer();
		c1.setId(1);
		c1.setName("tom");
		c1.setTel("15731101223");
		
		RecInfo rec1 = new RecInfo(1, "智慧公寓", "保安-jack",c1.getTel(), true);
		RecInfo rec2 = new RecInfo(1, "neusoft大厦", "保安队长-boss",c1.getTel(), false);
		RecInfo[] infos = { rec1 , rec2 };
		
		c1.setRecInfos(infos);
		
		Item1 item01 = new Item1(p1 , 2 );
		Item1 item02 = new Item1(p2 ,"土豪金", 6 );
		Item1 item03 = new Item1(p2 ,"土豪金", 1);
		Item1 item04 = new Item1(p1 , 1 );
		Item1 item05 = new Item1(p1 , 3 );
		Item1 item06 = new Item1(p3 , "土豪金",6 );
		Item1[] items = {item01, item02 , item03,item04,item05,item06};
		
		BuyCart cart = new BuyCart();
		
		cart.setItems(items);
		
		//做处理  , 　多余的让其加数量　　　减少项
		cart.handler();
		//处理完后查看购物车
		System.out.println("处理完后查看购物车:");
		cart.showBuyCart();
		
		
		//删除商品
		cart.revamp(item05);
		//////////////////////
		//删除商品后查看购物车
		System.out.println("删除商品后查看购物车:");
		cart.showBuyCart();

		//////////生成订单
		//生成日期
		Date date=new Date();
		DateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Orders orders=new Orders("001",format.format(date) ,c1.getRecInfos(), cart);
		orders.showOrders();
	}
	

}
