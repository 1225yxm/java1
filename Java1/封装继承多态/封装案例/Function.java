package 封装案例;

import org.apache.commons.lang3.ArrayUtils;

public class Function {
//	private Department department;
	
	
	
	
	public static Emp[ ] Addemp(Emp[] emps,Emp[] emps1) {
		Emp[ ] result=new Emp[emps.length+emps1.length];
		System.arraycopy(emps, 0, result, 0, emps.length);
		System.arraycopy(emps1, 0, result, emps.length, emps1.length);
		return result;
	}
	
	
	public static Emp[ ] remove(Emp[] emps,Emp[] emps1) {
		if(emps.length>=emps1.length) {
//			Emp[ ] result=new Emp[emps.length-emps1.length];
			for(int i=0;i<emps.length;i++) {
				for(int j=0;j<emps1.length;j++) {
					if(emps[i].getPerson().getName()==emps1[j].getPerson().getName()) {
						emps=ArrayUtils.remove (emps,i);
					}
				}
			}
			
			
		}else {
			System.out.print("删除人数太多，一共都没这么多人！");
		}
		
		return emps;
		
	}
	

}
