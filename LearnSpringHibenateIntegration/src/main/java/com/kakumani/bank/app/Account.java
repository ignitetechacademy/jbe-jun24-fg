package com.kakumani.bank.app;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "accounts")
public class Account {

	@Id
	@GeneratedValue
	@Column(name = "acc_id")
	int accId;

	@Column(name = "acc_holder_name")
	String accHolderName;

	@Column(name = "acc_holder_number")
	int accHolderNumber;

	@Column(name = "acc_balance")
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
