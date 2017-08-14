package 封装继承多态案例考题类;

import org.apache.commons.lang3.ArrayUtils;

public class MultiChoice extends Question {
	private String [ ] options;
	private int [] answers;
	
	//构造方法
	public MultiChoice(String text,String [] options, int[] answers) {
		super.setText(text);
		this.options=options;
		this.answers=answers;
		
	}
	
	public MultiChoice() {
		
	}

//set\get
	public String[] getOptions() {
		return options;
	}


	public void setOptions(String[] options) {
		this.options = options;
	}


	public int[] getAnswers() {
		return answers;
	}


	public void setAnswers(int[] answers) {
		this.answers = answers;
	}
	
	//检测答案
	public void check(int [ ]answers) {
		boolean  bn=false;
		for(int i=0;i<answers.length;i++) {
			for(int j=i+1;j<answers.length;j++) {
				if(answers[i]==answers[j]) {
					answers=ArrayUtils.remove (answers,j);
				}
			}
		}
		if (answers.length==this.answers.length) {
			for(int i=0;i<answers.length;i++) {
			for(int j=0;j<this.answers.length;j++) {
				
				if(answers[i]==this.answers[j]) {
					bn=true;	break;
				}
				else {
					bn=false;
				}
		
			}
		}
		}
		else {
			bn=false;
		}
		
		if(bn) {
			System.out.println("正确");
		}else {
			System.out.println("回答错误");
		}
		
	}
	
	

}
