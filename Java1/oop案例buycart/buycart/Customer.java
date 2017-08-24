package buycart;

import java.util.Arrays;

public class Customer {
	
	private int id;
	private String name;
	private String tel;
	
	private RecInfo[ ] recInfos;
	

	public Customer() {
		
	}

	public Customer(int id, String name, RecInfo[ ] recInfos) {
		
		this.id = id;
		this.name = name;
		this.recInfos = recInfos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public RecInfo getRecInfos() {
		RecInfo mRecInfo=null;
		for(int i=0;i<recInfos.length;i++) {
			if(recInfos[i].isDefault()==true) {
				mRecInfo = recInfos[i];
		}
		}
		return mRecInfo;
	}

	public void setRecInfos(RecInfo[] recInfos) {		
			this.recInfos = recInfos;
	}
	
	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", tel=" + tel + ", recInfos=" + Arrays.toString(recInfos)
				+ "]";
	}

	
	
	
}
