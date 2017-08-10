package 封装案例;

public class Department {
	private String Dname;
	private int performance;
	private int numberofpeople;
	private String task;
	private Emp[ ]DEmps;
	
	

	
	public Emp[] getDEmps() {
		return DEmps;
	}
	public void setDEmps(Emp[] dEmps) {
		DEmps = dEmps;
	}
	public String getDname() {
		return Dname;
	}
	public void setDname(String dname) {
		Dname = dname;
	}
	public int getPerformance() {
		return performance;
	}
	public void setPerformance(int performance) {
		this.performance = performance;
	}
	public int getNumberofpeople() {
		return numberofpeople;
	}
	public void setNumberofpeople(int numberofpeople) {
		this.numberofpeople = numberofpeople;
	}
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}

}
