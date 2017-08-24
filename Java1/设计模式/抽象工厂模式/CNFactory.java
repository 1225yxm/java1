package 抽象工厂模式;

public class CNFactory implements MFactory {

	@Override
	public AClass aClass() {
		// TODO Auto-generated method stub
		return new AClassCN() ;
	}

	@Override
	public BClass bClass() {
		// TODO Auto-generated method stub
		return new BClassCN();
	}

}
