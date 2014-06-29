package com.hari.strutsdemo.action;

import com.hari.strutsdemo.service.CalculationService;

public class CalculationAction {
	public String execute() {
		CalculationService calServ = new CalculationService();
		int sum = calServ.getSum(5, 2);
		return "Total sum is : " + Integer.toString(sum);
	}
}
