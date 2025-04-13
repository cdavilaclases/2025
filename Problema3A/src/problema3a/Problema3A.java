/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3a;

/**
 *
 * @author carlos
 */
public class Problema3A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        DocumentCounter.Counter c = new DocumentCounter.Counter(2);
        DocumentCounter.DocumentNameCreator d = new DocumentCounter.DocumentNameCreator(c, "archivo");
        System.out.println(d.getNewDocumentName());
        System.out.println(d.getNewDocumentName());
        System.out.println(d.getNewDocumentName());
    }
    
}
