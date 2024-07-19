package com.wipro.model;

public class Transaction {
	private int fromaccountid;
	private int targetAccountId;
	private int debitCreditAmount;
	public int getFromaccountid() {
		return fromaccountid;
	}
	public void setFromaccountid(int fromaccountid) {
		this.fromaccountid = fromaccountid;
	}
	public int getTargetAccountId() {
		return targetAccountId;
	}
	public void setTargetAccountId(int targetAccountId) {
		this.targetAccountId = targetAccountId;
	}
	public int getDebitCreditAmount() {
		return debitCreditAmount;
	}
	public void setDebitCreditAmount(int debitCreditAmount) {
		this.debitCreditAmount = debitCreditAmount;
	}
	@Override
	public String toString() {
		return "Transaction [fromaccountid=" + fromaccountid + ", targetAccountId=" + targetAccountId
				+ ", debitCreditAmount=" + debitCreditAmount + "]";
	}
	
	
	
	
	

}
