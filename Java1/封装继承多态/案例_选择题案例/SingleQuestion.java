package 案例_选择题案例;

public class SingleQuestion extends Question {
	
	public char answer; //��ȷ��
	
	public SingleQuestion(String title , Option[] options , int type , char answer) {
		
		super(title , options , type);
		this.answer = answer;
		
	}

	public char getAnswer() {
		return answer;
	}

	public void setAnswer(char answer) {
		this.answer = answer;
	}
	
	
	public boolean check(char[] customerChoice) {
		
		boolean  bn=false;
		if( customerChoice.length==1) {
			if ( customerChoice[0]==this.answer) {
			bn=true;
		}else {
			bn=false;
		}
		}else  bn=false;
		
		return bn;
	}
	

}
