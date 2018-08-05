/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package critical.path.method;

import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author david
 */
public class Application {
    
    public void read(String path) throws Exception{
        DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
        Document doc = docBuilder.parse(new File(path));
        doc.getDocumentElement().normalize();
        
        
        NodeList as = doc.getElementsByTagName("Actividad");
        for (int i=0; i<as.getLength(); i++){
            Node n = as.item(i);
                if(n.getNodeType() == Node.ELEMENT_NODE){
                    Element a = (Element) n;
                    System.out.println("("+a.getAttribute("id") + ", " + Integer.parseInt(a.getAttribute("duracion"))+")");
                }
        }
        as = doc.getElementsByTagName("Relacion");
        for(int i=0; i<as.getLength(); i++){
            Node n = as.item(i);
                if (n.getNodeType() == Node.ELEMENT_NODE){
                    Element a = (Element) n;
                    System.out.println(a.getAttribute("actividad") + " ===> " + a.getAttribute("sucesor"));
                }
                
        }
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
