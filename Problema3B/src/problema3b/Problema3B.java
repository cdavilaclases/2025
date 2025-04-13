/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3b;

/**
 *
 * @author carlos
 */
public class Problema3B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        DocumentCounter.Counter count = new DocumentCounter.Counter(1);
        DocumentCounter.DocumentNameCreator algo = new DocumentCounter.DocumentNameCreator(count,"nombreDocumento");
        System.out.println(algo.getDocumentName());
        System.out.println(algo.getDocumentName());
        System.out.println(algo.getDocumentName());
        
        
        
    }
    
}
