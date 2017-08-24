package simplefactory;

public class  Factory {
	
	public static Fruits creatFruit(String name) {
		if("apple".equals(name)) {
			return new Apple();
		}else if("grape".equals(name)) {
			return new Grape();
		}else {
			return null;
		}
	}
	

}
