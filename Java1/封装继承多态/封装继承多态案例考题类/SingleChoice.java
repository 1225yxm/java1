package 封装继承多态案例考题类;

public class SingleChoice extends Question {
	private String [] options;
	private int  answer;
	
	//构造方法
	public SingleChoice(String text,String [] options, int answer) {
		super.setText(text);
		this.options=options;
		this.answer=answer;
	}
	
	public SingleChoice() {
		
	}
	
	//检测答案
	public void check(int answer) {
		boolean  bn=false;
		if (answer==this.answer) {
			bn=true;
		}else {
			bn=false;
		}
		if(bn) {
			System.out.println("正确");
		}else {
			System.out.println("回答错误");
		}
	}

//set/get
	public String[] getOptions() {
		return options;
	}


	public void setOptions(String[] options) {
		this.options = options;
	}


	public int getAnswer() {
		return answer;
	}


	public void setAnswer(int answer) {
		this.answer = answer;
	}

}
