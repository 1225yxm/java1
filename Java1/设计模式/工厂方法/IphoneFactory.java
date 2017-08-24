package 工厂方法;

public class IphoneFactory implements Factory {

	@Override
	public Product product() {
		return new Iphone();
	}
	
	

}
