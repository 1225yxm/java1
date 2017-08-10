package homework3;

public class NoteBook {
	public char color;
	public int cpu;
	
	public NoteBook() {
		
	}
	
public NoteBook(char color,int cpu) {
		this.color=color;
		this.cpu=cpu;
	}

public void showNoteBook() {
	System.out.println("color:"+color+"\tcpu:"+cpu);
}

	

}
