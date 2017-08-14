package 封装继承多态案例考题类;



public class Function {
	
	//显示题目和选项
	public void showquestion(Question[ ] questions) {
		if(questions!=null&&questions.length>0) {
			for (int i = 0; i < questions.length; i++) {

				System.out.println("题目 " + (i + 1) + " : " + questions[i].getText());
				
				System.out.println("***************************");

			}
		}
	}
	

}
