package homework4;

public class Student {

	public String  sname;
	public String snumber;
	public int sgrade;
	
	
	public Student() {
		
	}
	
	public  Student(String  sname,String snumber,int sgrade) {
		this.sname=sname;
		this.snumber=snumber;
		this.sgrade=sgrade;
	}
	
	public static void sgradeSort(Student[] s) {
		Student temp;
		for(int i=0;i<s.length;i++) {
			for(int j=0;j<s.length-1;j++) {
				if(s[j].sgrade<s[j+1].sgrade) {
					temp=s[j+1];
					s[j+1]=s[j];
					s[j]=temp;
				}
			}
		}
		for (Student student : s) {
			System.out.println(student.snumber+"\t"+student.sname+"\t"+student.sgrade);
		}
	}
	
	
}
