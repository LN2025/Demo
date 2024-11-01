import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XMLParserDemo {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		try {	
			File xmlFile = new File("c:\\tmp\\emp.xml");
		
			DocumentBuilderFactory builder = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = builder.newDocumentBuilder();
			
			Document doc = db.parse(xmlFile);
			
			doc.getDocumentElement().normalize();
			
			System.out.println(doc.getDocumentElement().getNodeName());
			NodeList nList = doc.getElementsByTagName("emp");
			
			for(int i=0; i<nList.getLength(); i++) {
				Node nNode = nList.item(i);
				if(nNode.getNodeType()==Node.ELEMENT_NODE)
				{
					Element e = (Element) nNode;
					System.out.println("emp Id "+e.getAttribute("id"));
					
					System.out.println("First Name: "+e.getElementsByTagName("firstname").item(i).getTextContent());
					System.out.println("Last Name :"+e.getElementsByTagName("lastname").item(i).getTextContent());
					System.out.println("Salary    :"+e.getElementsByTagName("salary").item(i).getTextContent());
				}						
				}
				}catch(Exception e) {
					System.out.println(e);

			}
	
	}

}