package 封装案例;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Company c1=new Company();
		c1.setCname("neusoft");
		c1.setCcreationtime("1991");
		c1.setCculture("东软致力于成为最受社会、客户、投资者和员工尊敬的公司，并通过组织与过程的持续改进，领导力与员工竞争力的发展，联盟与开放式创新，使东软成为全球优秀的IT解决方案和服务供应商。");
		
		Company c2=new Company();
		c2.setCname("jiepu");
		c2.setCcreationtime("1995");
		c2.setCculture("........");
		
		Department d1=new Department();
		d1.setDname("宣传部");
		d1.setPerformance(2);
		d1.setTask(" 负责对公司进行宣传");
		
		Department d2=new Department();
		d2.setDname("销售部");
		d2.setPerformance(1);
		d2.setTask(" 负责公司产品的销售");
		
		Person p1=new Person();
		p1.setName("boss");
		p1.setSex("男");
		p1.setAge(30);
		p1.setTeliPhone("15735104159");
		p1.setAdd("山西运城");
		Emp e1=new Emp();
		e1.setPerson(p1);
		e1.setCompany(c1);
		e1.setSalary(1000000);
		e1.setPost("董事长");
		
		Person p2=new Person();
		p2.setName("sortt");
		p2.setSex("女");
		p2.setAge(25);
		p2.setTeliPhone("15735104158");
		p2.setAdd("山西长治");
		Emp e2=new Emp();
		e2.setPerson(p2);
		e2.setCompany(c1);
		e2.setDepartment(d2);
		e2.setSalary(100000);
		e2.setPost("经理");
		
		Person p3=new Person();
		p3.setName("emp3");
		p3.setSex("男");
		p3.setAge(20);
		p3.setTeliPhone("15735104157");
		p3.setAdd("山西朔州");
		Emp e3=new Emp();
		e3.setPerson(p3);
		e3.setCompany(c1);
		e3.setDepartment(d2);
		e3.setSalary(5000);
		e3.setPost("普通员工");
		
		Person p4=new Person();
		p4.setName("emp4");
		p4.setSex("男");
		p4.setAge(24);
		p4.setTeliPhone("15735104149");
		p4.setAdd("山西临汾");
		Emp e4=new Emp();
		e4.setPerson(p4);
		e4.setCompany(c1);
		e4.setDepartment(d2);
		e4.setSalary(5000);
		e4.setPost("普通员工");
		
		
		Person p5=new Person();
		p5.setName("emp5");
		p5.setSex("男");
		p5.setAge(24);
		p5.setTeliPhone("15735104149");
		p5.setAdd("山西临汾");
		Emp e5=new Emp();
		e5.setPerson(p5);
		e5.setCompany(c1);
		e5.setDepartment(d2);
		e5.setSalary(5000);
		e5.setPost("普通员工");
		
		//构造下属
		Emp[ ] emps= {e3,e4};
		
		//人物关系
		e2.setDowns(emps);
		
		e2.setUp(e1);
		
		//部门人数
		Emp[ ] dEmps= {e2,e3,e4};
		d1.setDEmps(dEmps);
		System.out.println("原来的人数："+dEmps.length);
		
		for(int i=0;i<dEmps.length;i++) {
			System.out.println(dEmps[i].getPerson().getName());
		}
		
		//增加员工：
		Emp[ ]emps1= {e5};
		
		
		//输出现在员工的总人数：
		Emp[ ] newdemp=Function.Addemp(dEmps,emps1);//newdemp接收增加员工后的数组；
		System.out.println("增加e5后的人数："+newdemp.length);
		for(int i=0;i<Function.Addemp(dEmps,emps1).length;i++) {
			System.out.println(newdemp[i].getPerson().getName());
		}

		
		
		
		//删除员工e3,e4：
		Emp[ ]emps2= {e3,e4};
		Emp[] removeemp=Function.remove(newdemp,emps2);//removeemp数组接收删除员工后的员工
		System.out.println("删除e3、e4后的人数："+removeemp.length);
		for(int i=0;i<removeemp.length;i++) {
			System.out.println(removeemp[i].getPerson().getName());
		}
		
		
		
		System.out.println("e2的所有信息："+"姓名："+e2.getPerson().getName()+"\n"
															   +"年龄："+e2.getPerson().getAge()+"\n"
															   +"性别："+e2.getPerson().getSex()+"\n"
															   +"联系方式："+e2.getPerson().getTeliPhone()+"\n"
														       +"地址："+e2.getPerson().getAdd()+"\n"
															   +"所在公司："+e2.getCompany().getCname()+"\n"
															   +"公司创立时间："+e2.getCompany().getCcreationtime()+"\n"
															   +"所在部门："+e2.getDepartment().getDname()+"\n"
															   +"岗位："+e2.getPost()+"\n"
															   +"部门职责："+e2.getDepartment().getTask()+"\n"
															   +"部门业绩："+e2.getDepartment().getPerformance()+"\n"
															   +"部门总人数："+Function.Addemp(dEmps,emps1).length+"\n"
															   +"下属："+e2.getDowns()[1].getPerson().getName()+"\t\t"+e2.getDowns()[0].getPerson().getName());
		
		
		System.out.println(d1.getDname()+"的信息："+"\n部门职责："+d1.getTask()+"\n业绩："+d1.getPerformance()+"\n部门负责人："+d1.getDEmps()[0].getPerson().getName());
		
	}

}
