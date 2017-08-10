package homework5;

public class PersonCreate {
	public String name;
	public double  height;
	public double  weight;
	
	public PersonCreate(String name,double height,double weight){ 
		this.name=name;
		this.height=height;
		this.weight=weight;
	}
	
	public void sayHello() {
		System.out.println("hello,my name is "+name);
		
	}

}
