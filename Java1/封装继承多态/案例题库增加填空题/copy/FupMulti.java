package 案例题库增加填空题.copy;

public class FupMulti extends FillUpPad {
	
	private String [ ] [ ] fupmanswer;

	public FupMulti() {
		
	}
	
	public FupMulti(String title ,String [ ][ ]dfupmanswer) {
		super.setFuptitle(title);
		this.fupmanswer=dfupmanswer;
	}
	
	
	@Override
	public boolean fupcheck(String[][] dfupmanswer) {
		// TODO Auto-generated method stub
		boolean bn=false;
		if(this.fupmanswer.length==dfupmanswer.length) {
			for(int i=0;i<dfupmanswer.length;i++) {
				for (int j=0;j<dfupmanswer[i].length;j++) {
//					if (this.fupmanswer[i][j]==dfupmanswer[i][j]) {
//						bn=true;
//					}
//					else bn=false;
					if(dfupmanswer[i][j].equals(this.fupmanswer[i][j])) {//equals判断字符串
					bn=true;
				}else bn=false;
				}
				
			}
		}else bn=false;
		return bn;
	}

	public String[][] getDfupmanswer() {
		return fupmanswer;
	}

	public void setDfupmanswer(String[][] dfupmanswer) {
		this.fupmanswer = dfupmanswer;
	}
	
	
	

}
