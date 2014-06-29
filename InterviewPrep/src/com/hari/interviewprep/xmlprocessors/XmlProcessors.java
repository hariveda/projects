package com.hari.interviewprep.xmlprocessors;

import org.w3c.dom.*;

import javax.xml.xpath.*;
import javax.xml.parsers.*;

import java.io.IOException;

import org.xml.sax.SAXException;

public class XmlProcessors {

	public static void main(String[] args) {
		DocumentBuilderFactory docFactory = DocumentBuilderFactory
				.newInstance();
		DocumentBuilder docBuilder;
		Document document = null;

		docFactory.setNamespaceAware(true);
		try {
			docBuilder = docFactory.newDocumentBuilder();
			document = docBuilder.parse("./src/Products.xml");
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		XPath xpath = XPathFactory.newInstance().newXPath();
		getNodeNameAndValue(document, xpath);
	}

	private static void getNodeNameAndValue(Document doc, XPath xpath) {
		XPathExpression expr;
		Object result = null;

		try {
			expr = xpath.compile("//books/name/text()");
			result = expr.evaluate(doc, XPathConstants.NODESET);
		} catch (XPathExpressionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		NodeList nodes = ((NodeList) result);

		for (int i = 0; i < nodes.getLength(); i++) {
			System.out.println(nodes.item(i).getParentNode().getNodeName()
					+ nodes.item(i).getNodeValue());
		}

	}
}