package homework5;

public class Person {
	public String name;
	public double  height;
	public double  weight;
	
	public Person(String name,double height,double weight){ 
		this.name=name;
		this.height=height;
		this.weight=weight;
	}
	
	public void sayHello() {
		System.out.println("hello,my name is "+name);
		
	}

}
