package 封装_homework6;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Random random= new Random();
		int s1=random.nextInt(5);
		int s2=random.nextInt(5-s1);
		int s3=5-s1-s2;
		double grade=0;
		
		Student[ ] student=new Student[5];
//		student[0].setsName("student0");
//		student[0].setsSex("男");
//		student[0].setsAge(20);
//		
//		student[1].setsName("student1");
//		student[1].setsSex("男");
//		student[1].setsAge(20);
//		
//		student[2].setsName("student2");
//		student[2].setsSex("女");
//		student[2].setsAge(20);
//		
//		student[3].setsName("student3");
//		student[3].setsSex("男");
//		student[3].setsAge(20);
//		
//		student[4].setsName("student4");
//		student[4].setsSex("女");
//		student[4].setsAge(20);
//		Student student1=new Student();
		
		English[ ] estudent=new English[s1];
		for(int i=0;i<s1;i++) {
			grade = Double.valueOf(100);
//			System.out.print(grade);
			student[i]=new English();
			estudent[i]=(English)student[i];
			estudent[i].setFinalgrade(grade);
			estudent[i].setMiddlegrade(grade);
			estudent[i].setSpeech(grade);
			estudent[i].setsId("100"+i);
			estudent[i].setsName("student"+i);
			estudent[i].setsSex("男");
			estudent[i].setsAge(20);
			
		}
		
		
		Culture[ ] culturestudent=new Culture[s2];
		for(int i=0;i<s2;i++) {
			grade = Double.valueOf(100);
//			System.out.print(grade);
			student[s1+i]=new Culture();
			culturestudent[i]=(Culture)student[s1+i];
			culturestudent[i].setFinalgrade(grade);
			culturestudent[i].setMiddlegrade(grade);
			culturestudent[i].setSpeech(grade);
			culturestudent[i].setProduction(grade);
			culturestudent[i].setsId("200"+s1+i);
			culturestudent[i].setsName("student"+(s1+i));
			culturestudent[i].setsSex("男");
			culturestudent[i].setsAge(20);
		}
		
		Computer[ ] computerstudent=new Computer[s3];
		for(int i=0;i<s3;i++) {
			grade = Double.valueOf(100);
//			System.out.print(grade);
			student[s1+s2+i]=new Computer();
			computerstudent[i]=(Computer)student[s1+s2+i];
			computerstudent[i].setFinalgrade(grade);
			computerstudent[i].setMiddlegrade(grade);
			computerstudent[i].setWritten(grade );
			computerstudent[i].setsId("300"+s1+s2+i);
			computerstudent[i].setsName("student"+(s1+s2+i));
			computerstudent[i].setsSex("男");
			computerstudent[i].setsAge(20);
		}
		
		
		ShowAll.ShowStudent(student);

	}

}
