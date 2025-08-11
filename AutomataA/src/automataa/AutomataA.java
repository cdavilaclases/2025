/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package automataa;

/**
 *
 * @author carlos
 */
public class AutomataA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String entrada = "abac";
        System.out.println(parsear(entrada));
        
    }
    
    public static boolean parsear(String entrada){
    
        char estado = 'A';
        boolean valida = true;
        
        char[] letras = entrada.toCharArray();
        
        for(char letra:letras){
        
                switch(estado){
                    case 'A'->{
                        switch (letra){
                            case 'a' ->{
                                estado = 'B';
                                valida = false;
                            }
                            case 'b' ->{
                                estado = 'C';
                                valida = false;
                            }
                            case 'c' ->{
                                return false;
                            }
                            default ->{
                               return false; 
                            }
                        }
                    }
                    case 'B'->{
                        switch (letra){
                            case 'a' ->{
                                return false;
                            }
                            case 'b' ->{
                                estado = 'A';
                                valida = true;
                            }
                            case 'c' ->{
                                estado = 'A';
                                valida = true;
                            }
                            default ->{
                               return false; 
                            }
                        }
                    }
                    case 'C'->{
                        switch (letra){
                            case 'a' ->{
                                return false;
                            }
                            case 'b' ->{
                                return false;
                            }
                            case 'c' ->{
                                estado = 'D';
                                valida = true;
                            }
                            default ->{
                               return false; 
                            }
                        }
                    }
                    case 'D'->{
                        switch (letra){
                            case 'a' ->{
                                return false;
                            }
                            case 'b' ->{
                                estado = 'C';
                                valida = false;
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
        
        return valida;
            
    }
    
    
}
