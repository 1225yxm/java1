package 抽象工厂模式;

import simplefactory.Factory;

public class Test {

	public static void main(String[] args) {
		
		AClass class1;
		MFactory factory=new CNFactory();
		class1=factory.aClass();
		
		AClass class2;
		MFactory factory2=new GemoryFactory();
		class2=factory2.aClass();
		
		BClass class3;
		MFactory factory3=new GemoryFactory();
		class3=factory3.bClass();
		
		BClass class4;
		MFactory factory4=new CNFactory();
		class4=factory4.bClass();
	}

}
