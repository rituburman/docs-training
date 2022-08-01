package com.beans;

public class Account {
public String username;
public String firstname;
public String lastname;
public String mobNo;
public String email;
public String address;
public String accNo;
public double balance;

public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getMobNo() {
	return mobNo;
}
public void setMobNo(String mobNo) {
	this.mobNo = mobNo;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getAccNo() {
	return accNo;
}
public void setAccNo(String accNo) {
	this.accNo = accNo;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public Account(String username, String firstname, String lastname, String mobNo, String email, String address,
		String accNo, double balance) {
	super();
	this.username = username;
	this.firstname = firstname;
	this.lastname = lastname;
	this.mobNo = mobNo;
	this.email = email;
	this.address = address;
	this.accNo = accNo;
	this.balance = balance;
}

public Account() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Account [username=" + username + ", firstname=" + firstname + ", lastname=" + lastname + ", mobNo=" + mobNo
			+ ", email=" + email + ", address=" + address + ", accNo=" + accNo + ", balance=" + balance + "]";
}


}


