package 封装_homework6;

public class Computer extends Student {
	private double skill;
	private double written;
	private double finalgrade;
	private double middlegrade;
	
	public Computer() {
		
	}
	
	public Computer( double skill,double written,double finalgrade,double middlegrade) {
		this.skill=skill;
		this.written=written;
		this.finalgrade=finalgrade;
		this.middlegrade=middlegrade;
	}
	
	public double Grade() {
		double grade = 0;
		grade=skill*0.4+written*0.2+finalgrade*0.2+middlegrade*0.2;
		return grade;
		
	}

	
	
	public double getSkill() {
		return skill;
	}

	public void setSkill(double skill) {
		this.skill = skill;
	}

	public double getWritten() {
		return written;
	}

	public void setWritten(double written) {
		this.written = written;
	}

	public double getFinalgrade() {
		return finalgrade;
	}

	public void setFinalgrade(double finalgrade) {
		this.finalgrade = finalgrade;
	}

	public double getMiddlegrade() {
		return middlegrade;
	}

	public void setMiddlegrade(double middlegrade) {
		this.middlegrade = middlegrade;
	}
	
	
	

}
