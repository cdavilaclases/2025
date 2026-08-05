/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automataa2026;

/**
 *
 * @author carlos
 */
public class Automata1 {
    
    public boolean validar(String cadena){
        boolean aceptar = true;
        char estado = 'A';
        
        if(cadena!=null && !"".equals(cadena)){
        
            char[] letras = cadena.toCharArray();
            for(char letra:letras){
                
                switch(estado){
                    
                    case 'A'->{
                        
                        switch(letra){                            
                            case 'a'->{
                                estado = 'B';
                                aceptar = true;
                            }
                            case 'b'->{
                                estado = 'C';
                                aceptar = true;                                
                            }
                            case 'c'->{
                                estado = 'D';
                                aceptar = true;
                            }
                            default->{
                                return false;
                            }                            
                        }
                    
                    }
                    case 'B'->{
                        
                        switch(letra){                            
                            case 'a'->{
                                estado = 'C';
                                aceptar = true;
                            }
                            case 'b'->{
                                estado = 'C';
                                aceptar = true;                                
                            }
                            case 'c'->{
                                return false;
                            }
                            default->{
                                return false;
                            }                            
                        }
                    
                    }
                    case 'C'->{
                        switch(letra){                            
                            case 'a'->{
                                estado = 'C';
                                aceptar = true;
                            }
                            case 'b'->{
                                estado = 'C';
                                aceptar = true;                                
                            }
                            case 'c'->{
                                return false;
                            }
                            default->{
                                return false;
                            }                            
                        }
                    
                    }
                    case 'D'->{
                        
                        switch(letra){                            
                            case 'a'->{
                                estado = 'C';
                                aceptar = true;
                            }
                            case 'b'->{
                                estado = 'C';
                                aceptar = true;                                
                            }
                            case 'c'->{
                                estado = 'D';
                                aceptar = true;
                            }
                            default->{
                                return false;
                            }                            
                        }
                    
                    }
                    
                }
                
            }
            
        }
        
        return aceptar;
    }
    
}
