/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lecturaxmlb;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;

/**
 *
 * @author carlos
 */
public class LecturaXmlB {

    public static void main(String[] args) {
        
        leerXML("archivo.xml");
    }
    
    public static void leerXML(String path){
        try {
            DocumentBuilderFactory lector = DocumentBuilderFactory.newInstance();
            DocumentBuilder construye = lector.newDocumentBuilder();
            Document documento = construye.parse(new File(path));
            documento.getDocumentElement().normalize();//limpiar el contenido
            
            
            
            NodeList lista = documento.getElementsByTagName("estudiante");
            
            for(int i = 0; i<lista.getLength(); i ++){
                Node nodo = lista.item(i);
                if(nodo.getNodeType() == Node.ELEMENT_NODE){
                    Element elemento = (Element) nodo;
                    String nombre = elemento.getElementsByTagName("nombre").item(0).getTextContent();
                    int carnet = Integer.parseInt(elemento.getElementsByTagName("carnet").item(0).getTextContent());
                    System.out.println("Nombre: " + nombre);
                    System.out.println("Carnet: " + carnet);
                    System.out.println("--------------------");
                    
                }
            }
            
            
            
            
            
        } catch (Exception ex) {
            Logger.getLogger(LecturaXmlB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
