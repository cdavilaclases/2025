/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema3b;

/**
 *
 * @author carlos
 */
public class DocumentCounter {    
    public static class Counter{
         private int count;
         private int increment;        
         
         public Counter(int increment){
             this.increment = increment;
         }     
         
         public int getAndIncrement(){
             count += increment;
             return count;             
         }
         
  
    }
    
    public static class DocumentNameCreator {
        private String prefix;
        private Counter counter;
        
        public DocumentNameCreator(Counter counter, String prefix){
            this.counter = counter;
            this.prefix = prefix;
        }
        
        public String getDocumentName(){
            return prefix+counter.getAndIncrement();
        }
    }
    
}
