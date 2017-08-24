package buycart;

import java.util.Date;

public class Orders {
	
	private String oid;
	private String date;
	
	private RecInfo recInfo;
	private BuyCart buyCart;
	
	public Orders(String oid, String date, RecInfo recInfo, BuyCart buyCart) {
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
		for(int i=0;i<buyCart.getItems().length;i++) {
			System.out.println(buyCart.getItems()[i].getProduct().getName()+"\t"+buyCart.getItems()[i].getAmount()+"\t"+buyCart.getItems()[i].getProduct().getPrice()+"\t"+(buyCart.getItems()[i].getProduct().getPrice()*buyCart.getItems()[i].getAmount()));
			allprice=allprice+buyCart.getItems()[i].getAmount()*buyCart.getItems()[i].getProduct().getPrice();
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

	public BuyCart getBuyCart() {
		return buyCart;
	}

	public void setBuyCart(BuyCart buyCart) {
		this.buyCart = buyCart;
	}
	
	
	

}
