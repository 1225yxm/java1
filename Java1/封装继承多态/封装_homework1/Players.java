package 封装_homework1;

public class Players {
	private static int sum=0;
	
	public Players() {
		sum+=1;
		if (sum>11) {
			System.out.println("对不起，已经创建了十一个对象，不能再创建对象了。");
		}else if(sum>=0&&sum<=11) {
			System.out.println("创建了"+sum+"个对象");
		}
	}

	

}
