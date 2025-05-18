/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lecturaxmla;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;


/**
 *
 * @author carlos
 */
public class LecturaXmlA {

    public static void main(String[] args) {
        leerXml("persona.xml");
    }
    
    public static void leerXml(String path){
        try {
            DocumentBuilderFactory constructor = DocumentBuilderFactory.newInstance();
            DocumentBuilder lector = constructor.newDocumentBuilder();
            
            Document document = lector.parse(new File(path));
            document.getDocumentElement().normalize();//limpiar
            
            NodeList nodos = document.getElementsByTagName("persona");
            
            for(int i = 0; i<nodos.getLength(); i ++){
                Node nodo = nodos.item(i);
                
                if(nodo.getNodeType() == Node.ELEMENT_NODE){
                    Element elmento = (Element) nodo;
                    String nombre = elmento.getElementsByTagName("nombre").item(0)
                            .getTextContent();
                    String apellido = elmento.getElementsByTagName("apellido").item(0)
                            .getTextContent();
                    int edad = Integer.parseInt(elmento.getElementsByTagName("edad").item(0)
                            .getTextContent());
                    System.out.println("Nombre: "+nombre);
                    System.out.println("Apellido: "+apellido);
                    System.out.println("Edad: "+edad);
                    System.out.println("-----------");
                }
            }
            
        } catch (Exception ex) {
            Logger.getLogger(LecturaXmlA.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
