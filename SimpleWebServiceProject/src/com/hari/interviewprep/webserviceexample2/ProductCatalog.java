package com.hari.interviewprep.webserviceexample2;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(name = "TestMartCatalog", portName = "TestMartCatalogPort", serviceName = "TestMartCatlogService", targetNamespace = "http://testmart.com")
public class ProductCatalog {
	
	@WebMethod(action="fetch_productslist", operationName="fetchProductsList")
	public List<String> getProducts() {
		List<String> listOfProds = new ArrayList<String>();
		listOfProds.add("Books");
		listOfProds.add("CDs");
		listOfProds.add("Tablets");
		listOfProds.add("Laptops");

		return listOfProds;
	}
}
