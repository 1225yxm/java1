package 工厂方法;

public class IpadFactory implements Factory{

	@Override
	public Product product() {
		return new Ipad();
	}

}
