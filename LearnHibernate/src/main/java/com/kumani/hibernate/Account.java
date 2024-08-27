package com.kumani.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Account {

	@Id
	@GeneratedValue
	int accId;

	@Column
	String accHolderName;

	@Column
	int accHolderNumber;

	@Column
	double accBalance;

	public int getAccId() {
		return accId;
	}

	public void setAccId(int accId) {
		this.accId = accId;
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public int getAccHolderNumber() {
		return accHolderNumber;
	}

	public void setAccHolderNumber(int accHolderNumber) {
		this.accHolderNumber = accHolderNumber;
	}

	public double getAccBalance() {
		return accBalance;
	}

	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}

}
