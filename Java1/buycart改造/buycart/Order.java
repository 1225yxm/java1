package buycart;

import java.util.Date;
import java.util.Iterator;

public class Order {
	
	private String oid;
	private String date;
	
	private RecInfo recInfo;
	private BuyCat buyCart;
	
	public Order(String oid, String date, RecInfo recInfo, BuyCat buyCart) {
		this.oid = oid;
		this.date = date;
		this.recInfo = recInfo;
		this.buyCart = buyCart;
	}
	
	public void   showOrders() {
		System.out.println("*****************************************************");
		double allprice=0;
		System.out.println("订单号:"+oid);
		System.out.println("商品名称                                   数量                       单价                     价格");
		
		for (Item item : buyCart.getItems()) {
			System.out.println(item.getProduct().getName()+"\t"+item.getAmount()+"\t"+item.getProduct().getPrice()+"\t"+(item.getProduct().getPrice()*item.getAmount()));
			allprice=allprice+item.getAmount()*item.getProduct().getPrice();
		}
		
		System.out.println("总价："+allprice);
		System.out.println("收货地址："+recInfo.getAddr());
		System.out.println("收货人："+recInfo.getRecName()+"\t"+"联系方式："+recInfo.getTel());
		System.out.println("交易日期："+getDate());
	}

	public String getOid() {
		return oid;
	}

	public void setOid(String oid) {
		this.oid = oid;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public RecInfo getRecInfo() {
		return recInfo;
	}

	public void setRecInfo(RecInfo recInfo) {
		this.recInfo = recInfo;
	}

	public BuyCat getBuyCat() {
		return buyCart;
	}

	public void setBuyCat(BuyCat buyCart) {
		this.buyCart = buyCart;
	}
	
	
	

}
