package 案例题库增加填空题.copy;

public abstract class FillUpPad  {
	private String fuptitle;
//	private String [] fupanswer;
	private int fupnumber;
	
	public FillUpPad() {
		
	}
	
	public FillUpPad(String fuptitle,/*String[ ] fupanswer,*/int fupnumber) {
		this.fuptitle=fuptitle;
//		this.fupanswer=fupanswer;
		this.fupnumber=fupnumber;
	}
	
	public abstract boolean fupcheck(String [ ] [ ] dfupanswer);

	public String getFuptitle() {
		return fuptitle;
	}

	public void setFuptitle(String fuptitle) {
		this.fuptitle = fuptitle;
	}

	public int getFupnumber() {
		return fupnumber;
	}

	public void setFupnumber(int fupnumber) {
		this.fupnumber = fupnumber;
	}
	
	
	
	

}
