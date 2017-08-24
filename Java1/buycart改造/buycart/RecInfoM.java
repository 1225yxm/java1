package buycart;

public class RecInfoM {

	private int id;
	private String addr;
	private String recName;
	
	private String tel;
	private boolean isDefault = false;

	public RecInfoM() {
	}

	public RecInfoM(int id, String addr, String recName ,String tel, boolean isDefault) {
		this.id = id;
		this.addr = addr;
		this.recName = recName;
		this.tel=tel;
		this.isDefault = isDefault;
	}
	
	public RecInfoM(int id, String addr, String recName ,boolean isDefault) {
		this.id = id;
		this.addr = addr;
		this.recName = recName;
		this.isDefault = isDefault;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getRecName() {
		return recName;
	}

	public void setRecName(String recName) {
		this.recName = recName;
	}

	public boolean isDefault() {
		return isDefault;
	}

	public void setDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}
	
	

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "RecInfo [id=" + id + ", addr=" + addr + ", recName=" + recName + ", isDefault=" + isDefault + "]";
	}

	
}
