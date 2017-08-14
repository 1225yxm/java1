package 封装_homework6;

public class ShowAll {
	public static void ShowStudent(Student[ ] student) {
		for(int i=0;i<student.length;i++) {
			System.out.println("学号："+student[i].getsId()+
					"\t姓名："+student[i].getsName()+
					"\t性别："+student[i].getsSex()+
					"\t年龄："+student[i].getsAge()+
					"\t成绩："+student[i].Grade());
		}
	}
}
