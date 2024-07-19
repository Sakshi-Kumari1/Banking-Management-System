package com.wipro.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int customerid;
	@Column
	private String customername;
	@Column
	private String cityname;
	@Column
	private int mobileno;
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<Account>accounts;

public Customer() {
	super();
}
public Customer(int customerid,String customername,String cityname,int mobileno,List<Account>accounts) {
	this.customerid=customerid;
	this.customername=customername;
	this.cityname=cityname;
	this.mobileno=mobileno;
	this.accounts=accounts;
}
public int getCustomerid() {
	return customerid;
}
public void setCustomerid(int customerid) {
	this.customerid = customerid;
}
public String getCustomername() {
	return customername;
}
public void setCustomername(String customername) {
	this.customername = customername;
}
public String getCityname() {
	return cityname;
}
public void setCityname(String cityname) {
	this.cityname = cityname;
}
public int getMobileno() {
	return mobileno;
}
public void setMobileno(int mobileno) {
	this.mobileno = mobileno;
}
public List<Account> getAccounts() {
	return accounts;
}
public void setAccounts(List<Account> accounts) {
	this.accounts = accounts;
}

}
