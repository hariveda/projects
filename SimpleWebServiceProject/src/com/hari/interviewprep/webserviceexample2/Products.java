package com.hari.interviewprep.webserviceexample2;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "Product")
@XmlType(propOrder = { "price", "sku", "name" })
public class Products {

	@XmlElement(name = "ProductName")
	private String name;
	@XmlElement(name = "ProductSku")
	private String sku;
	@XmlElement(name = "ProductPrice")
	private double price;

	/* No-args contructor */
	public Products() {
	}

	public Products(String name, String sku, double price) {
		this.name = name;
		this.sku = sku;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
