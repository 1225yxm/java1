package 案例题库增加填空题.copy;

public class FupSingle extends FillUpPad {
	private String [ ] [ ]fupanswer;//标准答案
	
	public FupSingle() {
		
	}
	
	public FupSingle(String title ,String[ ][ ] dfupsanswer) {
		super.setFuptitle(title);
		this.fupanswer=dfupsanswer;
	}

	@Override
	public boolean fupcheck(String[] [] dfupsanswer) {
		// TODO Auto-generated method stub
		boolean bn=false;
		if(fupanswer.length==dfupsanswer.length) {
			for(int i=0;i<fupanswer.length;i++) {
			for (int j=0;j<dfupsanswer.length;j++) {
				if(dfupsanswer[i][j].equals(fupanswer[i][j])) {
					bn=true;
					
				}else {
					bn=false;
				}
					
			}
		}
		}
		

		return bn;

	}

	public String[][] getFupanswer() {
		return fupanswer;
	}

	public void setFupanswer(String[][] fupanswer) {
		this.fupanswer = fupanswer;
	}
	
	
	
}
