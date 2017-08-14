package 封装_homework6;



public class English extends Student {
	private double speech;
	private double finalgrade;
	private double middlegrade;
	
	public English() {
		
	}
	
	public English(double speech,double finalgrade,double middlegrade) {
		this.speech=speech;
		this.finalgrade=finalgrade;
		this.middlegrade=middlegrade;
	}
	
	
	public double Grade() {
		double grade = 0;
		grade=speech*0.5+finalgrade*0.25+middlegrade*0.25;
		return grade;
		
	}

	public double getSpeech() {
		return speech;
	}

	public void setSpeech(double speech) {
		this.speech = speech;
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
