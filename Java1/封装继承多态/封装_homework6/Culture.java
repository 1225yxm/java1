package 封装_homework6;

public class Culture extends Student {
	private double speech;
	private double production;
	private double finalgrade;
	private double middlegrade;
	
	public Culture() {
		
	}
	
	public Culture( double speech,double production,double finalgrade,double middlegrade) {
		this.speech=speech;
		this.production=production;
		this.finalgrade=finalgrade;
		this.middlegrade=middlegrade;
	}
	
	public double Grade() {
		double grade = 0;
		grade=speech*0.35+production*0.35+finalgrade*0.15+middlegrade*0.15;
		return grade;
		
	}

	public double getSpeech() {
		return speech;
	}

	public void setSpeech(double speech) {
		this.speech = speech;
	}

	public double getProduction() {
		return production;
	}

	public void setProduction(double production) {
		this.production = production;
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
