package com.zinnia.saml;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.zinnia.constants.FrameworkConstants;

public class UserUpdate {

	
	public static void updateLoginUser(String loginuser)
	{
		File xmlFile = new File(FrameworkConstants.getSamlFilePath());
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = null;
		try {
			dBuilder = dbFactory.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}
        Document doc = null;
		try {
			doc = dBuilder.parse(xmlFile);
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

        // Get the list of saml2:Attribute elements
        NodeList attributeList = doc.getElementsByTagName("saml2:Attribute");

        // Check if the second saml2:Attribute element exists
        if (attributeList.getLength() >= 2) {
            Element attribute = (Element) attributeList.item(1); // Index 1 represents the second element

            // Find the saml2:AttributeValue element within the saml2:Attribute element
            NodeList attributeValueList = attribute.getElementsByTagName("saml2:AttributeValue");
            if (attributeValueList.getLength() > 0) {
                Element attributeValue = (Element) attributeValueList.item(0); // Assuming there's only one saml2:AttributeValue element
                // Update the value to your desired value
                attributeValue.setTextContent(loginuser);
            } else {
                System.out.println("saml2:AttributeValue not found within the second saml2:Attribute element.");
            }
        } else {
            System.out.println("Second saml2:Attribute element not found.");
        }

        // Write the updated document back to the file
        // Here you will need to write code to save the modified XML back to the file
        
     // Write the updated XML to a new file
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = null;
		try {
			transformer = transformerFactory.newTransformer();
		} catch (TransformerConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File(FrameworkConstants.getSamlFilePath()));
        try {
			transformer.transform(source, result);
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    //    System.out.println("XML updated successfully!");
	}
	
	
}
