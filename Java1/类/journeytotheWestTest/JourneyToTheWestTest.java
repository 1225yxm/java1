package journeytotheWestTest;

import journeytotheWest.JourneyFigure;

public class JourneyToTheWestTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JourneyFigure  figure1=new JourneyFigure();
		figure1.name="唐三藏";
		figure1.endurance=10;
		figure1.fightingCapacity=0;
		figure1.weapon="法杖";
		figure1.personalGoal	="去西天取经，拯救大唐";
		figure1.demontag="啊.......";
		figure1.tag="悟空，是为师错怪你了";
				
		JourneyFigure  figure2=new JourneyFigure();
		figure2.name="孙行者";
		figure2.endurance=10;
		figure2.fightingCapacity=10;
		figure2.weapon="金箍棒";
		figure2.personalGoal	="保护师傅去西天取经";
		figure2.demontag="妖怪，吃俺老孙一棒";
		figure2.tag="喂！呆子";
		
		JourneyFigure  figure3=new JourneyFigure();
		figure3.name="猪八戒";
		figure3.endurance=3;
		figure3.fightingCapacity=5;
		figure3.weapon="九齿钉耙";
		figure3.personalGoal	="安静的吃饭睡觉打豆豆";
		figure3.demontag="这妖怪一看就很厉害，我还是先跑吧!";
		figure3.tag="大师兄，师傅被妖怪抓走了";
		
		JourneyFigure  figure4=new JourneyFigure();
		figure4.name="沙僧";
		figure4.endurance=9;
		figure4.fightingCapacity=4;
		figure4.weapon="月牙铲";
		figure4.personalGoal	="随师傅和师兄们一同前行";
		figure4.demontag="大师兄，师傅和二师兄被妖怪抓走了";
		figure4.tag="  .........";
		
		
		figure1.introduce();
		figure2.introduce();
		
		figure1.goal();
		figure2.goal();
		figure3.goal();
		figure4.goal();
		
		figure1.demon();
		figure2.demon();
		figure2.demon("白骨精");
		figure3.demon();
		figure4.demon();
		
		
		
	}

}
