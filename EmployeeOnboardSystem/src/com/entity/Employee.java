package com.entity;

public class Employee {

	private String E_FName;
	private String E_LName;
	private long EmNo;
	private String E_Email;
	private long E_Contactno;
	private String E_Address;
	private String E_post;

	public Employee(String e_FName, String e_LName, long emNo, String e_Email, long e_Contactno,
			String e_Address, String e_post) {
		super();
		this.E_FName = e_FName;
		this.E_LName = e_LName;
		this.EmNo = emNo;
		this.E_Email = e_Email;
		this.E_Contactno = e_Contactno;
		this.E_Address = e_Address;
		this.E_post = e_post;
	}

	public String getE_FName() {
		return E_FName;
	}

	public void setE_FName(String e_FName) {
		E_FName = e_FName;
	}

	public String getE_LName() {
		return E_LName;
	}

	public void setE_LName(String e_LName) {
		E_LName = e_LName;
	}

	public long getEmNo() {
		return EmNo;
	}

	public void setEmNo(long emNo) {
		EmNo = emNo;
	}

	public String getE_post() {
		return E_post;
	}

	public void setE_post(String e_post) {
		E_post = e_post;
	}

	public String getE_Email() {
		return E_Email;
	}

	public void setE_Email(String e_Email) {
		E_Email = e_Email;
	}

	public long getE_Contactno() {
		return E_Contactno;
	}

	public void setE_Contactno(long e_Contactno) {
		E_Contactno = e_Contactno;
	}

	public String getE_Address() {
		return E_Address;
	}

	public void setE_Address(String e_Address) {
		E_Address = e_Address;
	}

	@Override
	public String toString() {
		return "Employee [E_FName=" + E_FName + ", E_LName=" + E_LName + ", EmNo=" + EmNo + ", E_Email=" + E_Email
				+ ", E_Contactno=" + E_Contactno + ", E_Address=" + E_Address + ", E_post=" + E_post + "]";
	}
}