package homework4;

import java.util.HashMap;
import java.util.Set;

public class HomeWork4 {

	public static void main(String[] args) {
		
		HashMap<String, Customer> hm1=new HashMap<String, Customer>();
//		HashMap<String, Double> hm2=new HashMap<String, Double>();
		
		Customer c1=new Customer("0001","tom",1000.0);
		Customer c2=new Customer("0002","jack",12300.0);
		Customer c3=new Customer("0003","jiajia",986750.0);
		
		hm1.put("001",c1 );
		hm1.put("002", c2);
		hm1.put("003", c3);
		
//		Collection values=(Collection) hm1.get("001");
		Set key=hm1.keySet();
		System.out.println("键值："+key);
		
		System.out.println("请输入键值：");
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		String str=scanner.next();
		System.out.println(hm1.get(str).getMoney());

	}

}
