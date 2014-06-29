package com.hari.interviewprep.webserviceexample2;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public class SportsTypes {

	@WebMethod
	@WebResult(partName = "lookupOutput")
	public String getSportsType(
			@WebParam(partName = "lookupInput") String category) {
		String sportsType = "";
		switch (category.toLowerCase()) {
		case "cricket":
			return "Cricket";
		case "baseball":
			return "Baseball";
		case "basketball":
			return "Basketball";
		default:
			return "Soccer";
		}
	}
}
