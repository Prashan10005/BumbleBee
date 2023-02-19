package ModelBean;

import java.util.Date;

public class user {
	public int userID;
	public String name;
	public Date dob;
	public String address;
	public String nic;
	public String email;
	public int mobile;
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
	public user(int userID, String name, Date dob, String address, String nic, String email, int mobile) {
		super();
		this.userID = userID;
		this.name = name;
		this.dob = dob;
		this.address = address;
		this.nic = nic;
		this.email = email;
		this.mobile = mobile;
	}
	
	
}
