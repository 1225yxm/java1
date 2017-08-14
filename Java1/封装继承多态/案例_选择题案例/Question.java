package 案例_选择题案例;


//JavaBean
public class Question {

	protected String title;
	protected Option[] options;
	protected int type; // ������ û�õ� type    , 0 = ��ѡ , 1 = ��ѡ
	
	
	public Question() {
		
	}
	
	public Question(String title, Option[] options , int type) {
		super();
		this.title = title;
		this.options = options;
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Option[] getOptions() {
		return options;
	}

	public void setOptions(Option[] options) {
		this.options = options;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	
	//���ඨ�� , ����������ʵ�������ļ��鷽ʽ
		public boolean check(char[] customerChoice) {
			return false;
		}
		
	
}
