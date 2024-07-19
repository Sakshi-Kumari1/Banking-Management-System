package com.wipro.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Account {
	@Id
	private int accountid;
	@Column
	private int accountno;
	@Column
	private String accounttype;
	@Column
	private int accountbalance;
	public Account() {
		super();
	}
	public Account(int accountid,int accountno,String accounttype,int accountbalance) {
		super();
		this.accountid=accountid;
		this.accountno=accountno;
		this.accounttype=accounttype;
		this.accountbalance=accountbalance;
	}
	public int getAccountid() {
		return accountid;
	}
	public void setAccountid(int accountid) {
		this.accountid = accountid;
	}
	public int getAccountno() {
		return accountno;
	}
	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}
	public String getAccounttype() {
		return accounttype;
	}
	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}
	public int getAccountbalance() {
		return accountbalance;
	}
	public void setAccountbalance(int accountbalance) {
		this.accountbalance = accountbalance;
	}
	

}
