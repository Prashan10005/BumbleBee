package ModelBean;

public class admin {
	public int adID;
	public String fName;
	public String lName;
	public String nic;
	public String email;
	public int mobile;
	
	public int getAdID() {
		return adID;
	}
	public void setAdID(int adID) {
		this.adID = adID;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getNic() {
		return nic;
	}
	public void setNic(String nic) {
		this.nic = nic;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public admin(int adID, String fName, String lName, String nic, String email, int mobile) {
		super();
		this.adID = adID;
		this.fName = fName;
		this.lName = lName;
		this.nic = nic;
		this.email = email;
		this.mobile = mobile;
	}
	
	
}
