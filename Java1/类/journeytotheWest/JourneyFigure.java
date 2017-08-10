package journeytotheWest;

public class JourneyFigure {
	
	public String name;
	public double fightingCapacity;
	public String weapon;
	public double endurance;
	public String personalGoal;
	public String demontag;
	public String tag;

	public void goal() {
		System.out.println("我是"+name+"我的志向："+personalGoal);
	}
	
	public void demon(String demonname) {
		System.out.println(demonname+"！"+demontag);
		
	}
	
	public void demon() {
		System.out.println(name+":"+demontag);
	}
	
	public void introduce() {
		System.out.println("姓名"+name+"\n"+"战斗力："+fightingCapacity+"\n"+"武器"+weapon+"\n"+"耐力："+endurance);
	}

}
