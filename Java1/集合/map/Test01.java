package map;

import java.util.HashMap;
import java.util.Map;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map <String,Object> map=new HashMap<String,Object>();
		map.put("002", "xxx");
		map.put("001", "yyy");
		map.put("003", "value");
		map.put("006", "xxx");
		map.put("005", "yyy");
		map.put("009", "value");
		
		System.out.println(map);

	}

}
