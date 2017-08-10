package 封装案例;

public class Emp {

	private Person person;
	private Company company;
	private Department department;
	private String post;
	private double salary;
	private Emp up;
	private Emp[] downs;
	
	
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}

	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Emp getUp() {
		return up;
	}
	public void setUp(Emp up) {
		this.up = up;
	}
	public Emp[] getDowns() {
		return downs;
	}
	public void setDowns(Emp[] downs) {
//		if (this.department==downs)
		this.downs = downs;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}

	

	
	
	

}
