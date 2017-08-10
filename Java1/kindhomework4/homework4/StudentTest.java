package homework4;

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("你想输入几个学生的成绩：");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		Student[ ] s=new Student[num];
		
		for (int i=0;i<num;i++) {
			System.out.println("请输入第"+(i+1)+"个学生的姓名：");
			String name0=sc.next();
			System.out.println("请输入第"+(i+1)+"个学生的学号：");
			String number0=sc.next();
			System.out.println("请输入第"+(i+1)+"个学生的成绩：");
			 int grade0=sc.nextInt();
			 s[i]=new Student(name0,number0,grade0);
		}

		Student.sgradeSort(s);

	}

	}
	


