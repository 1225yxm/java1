package 封装_homework2;

public class VehicleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle  v2=new Vehicle("benz","red");
		v2.run();
		
		Car c1=new Car(2);
		c1.setBrand("benz");
		c1.setColor("red");
		c1.setLoader(2);
		c1.run();

	}

}
