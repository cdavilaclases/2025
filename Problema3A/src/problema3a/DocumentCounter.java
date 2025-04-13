/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema3a;

/**
 *
 * @author carlos
 */
public class DocumentCounter {
    
    public static class Counter{
    
        private int count = 0;
        private int increment ;
        
        public Counter(int increment){
            this.increment = increment;
        }
        
        protected int getAndIncrement(){
            this.count += this.increment;
            return count;
        }
        
    }
    
    public static class DocumentNameCreator { 
        private String prefix;
        private Counter counter;
        
        public DocumentNameCreator(Counter counter,String prefix){
            this.counter = counter;
            this.prefix = prefix;
        }
        
        public String getNewDocumentName(){
            return prefix + counter.getAndIncrement();
        }        
    }    
}
