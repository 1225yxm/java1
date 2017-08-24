package 抽象工厂模式;

public class GemoryFactory implements MFactory {

	@Override
	public AClass aClass() {
		// TODO Auto-generated method stub
		return new AClassGemory();
	}

	@Override
	public BClass bClass() {
		// TODO Auto-generated method stub
		return new BClassGemory();
	}

}
