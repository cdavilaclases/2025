/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package automatab;

/**
 *
 * @author carlos
 */
public class AutomataB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String entrada = "ababa";
        System.out.println(parsear(entrada));
        
        
        
    }
    
    public static boolean parsear(String entrada){
        
        char[] letras = entrada.toCharArray();
        char estado = 'A';
        boolean aceptar = true;
        
        for(char letra: letras){
            switch (estado){
                case 'A' -> {                    
                    switch (letra){
                        case 'a' ->{
                            estado = 'B';
                            aceptar = false;
                        }
                        case 'b' ->{
                            estado = 'C';
                            aceptar = false;
                        }
                        case 'c' ->{
                            return false;                        
                        }
                        default ->{
                            return false;
                        }
                    }
                    
                    
                }
                case 'B' -> {
                    switch (letra){
                        case 'a' ->{
                            return false;
                        }
                        case 'b' ->{
                            estado = 'D';
                            aceptar = true;
                        }
                        case 'c' ->{
                            estado = 'D';
                            aceptar = true;                        
                        }
                        default ->{
                            return false;
                        }
                    }
                }
                case 'C' -> {
                    switch (letra){
                        case 'a' ->{
                            return false;
                        }
                        case 'b' ->{
                            return false;
                        }
                        case 'c' ->{
                            estado = 'E';
                            aceptar = true;                        
                        }
                        default ->{
                            return false;
                        }
                    }
                }
                
                case 'D' -> {
                    
                    switch (letra){
                        case 'a' ->{
                            estado = 'B';
                            aceptar = false;
                        }
                        case 'b' ->{
                            estado = 'D';
                            aceptar = true;
                        }
                        case 'c' ->{
                            estado = 'E';
                            aceptar = true;                        
                        }
                        default ->{
                            return false;
                        }
                    }
                    
                }
                case 'E' -> {
                    
                     switch (letra){
                        case 'a' ->{
                            return false;
                        }
                        case 'b' ->{
                            estado = 'C';
                            aceptar = false;
                        }
                        case 'c' ->{
                            return false;
                        }
                        default ->{
                            return false;
                        }
                    }
                    
                }
                    
            }
                  
        }
        
        return aceptar;
    }
    
}
