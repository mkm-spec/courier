package courier.beans;

import java.util.Date;

public class Customer {
	
	private String custName;
	private int custId;
	private Date dateOfReg;
	private String address;
	private String city;
	private String email;
	private int pinCode;
	private int mobile;
	
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public Date getDateOfReg() {
		return dateOfReg;
	}
	public void setDateOfReg(Date dateOfReg) {
		this.dateOfReg = dateOfReg;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pin) {
		this.pinCode = pin;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}

}
