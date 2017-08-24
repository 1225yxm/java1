package apache组件;

import org.apache.commons.beanutils.BeanUtils;

public class Apache01 {

	public static void main(String[] args) throws Exception {
		Person p1=new Person();
		p1.setIdnumber("001");
		p1.setName("tom");
		p1.setSex("男");
		
		Person p2=new Person();
		
		BeanUtils.copyProperties(p2, p1);
		
		System.out.println(p2);
	}

}
