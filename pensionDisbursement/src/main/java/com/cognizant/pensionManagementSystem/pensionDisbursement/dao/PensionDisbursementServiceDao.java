package com.cognizant.pensionManagementSystem.pensionDisbursement.dao;

import com.cognizant.pensionManagementSystem.pensionDisbursement.model.ProcessPensionInput;

public interface PensionDisbursementServiceDao {

	public double getBankServiceCharge(String bankName);

	public int processPension(String token, ProcessPensionInput processPensionInput);

	public Boolean isSessionValid(String token);
}
