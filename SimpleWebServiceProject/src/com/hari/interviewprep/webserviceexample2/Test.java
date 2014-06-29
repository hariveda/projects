package com.hari.interviewprep.webserviceexample2;

import javax.xml.ws.Endpoint;

public class Test {

	public static void main(String[] args) {
		Endpoint.publish(
				"http://localhost:1234/SimpleWebServiceProject/services/SportsTypes",
				new SportsTypes());
	}

}
