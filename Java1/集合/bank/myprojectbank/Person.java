package bank.myprojectbank;

public class Person {
	private String idnumber;
	private String name;
	private String sex;
	
	public Person() {
	}

	public Person(String idnumber, String name, String sex) {
		this.idnumber = idnumber;
		this.name = name;
		this.sex = sex;
	}
	
	public String getIdnumber() {
		return idnumber;
	}
	public void setIdnumber(String idnumber) {
		this.idnumber = idnumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	

}
