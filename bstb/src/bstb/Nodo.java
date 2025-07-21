/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bstb;

/**
 *
 * @author carlos
 */
public class Nodo {
    
    public int valor;
    private Nodo derecha;
    private Nodo izquierda;
    
    public void insertar(Nodo nuevo){
                
        if(nuevo.valor>valor){
            //insertar derecha
            if(derecha==null){
                derecha = nuevo;
            }else{
                derecha.insertar(nuevo);
            }
        }
        else{
            //insertar izquierda
            if(izquierda==null){
               izquierda = nuevo;
            }
            else{
                izquierda.insertar(nuevo);
            }            
        }       
    }
    
    public void inorden(){
        if(izquierda!=null){
            izquierda.inorden();
        }
        System.out.print(valor+", ");
        if(derecha!=null){
            derecha.inorden();
        }
    }
    
    public void postorden(){
        if(izquierda!=null){
            izquierda.postorden();
        }
        if(derecha!=null){
            derecha.postorden();
        }
        System.out.print(valor+", ");
    }
    
     public void preorden(){
        
        System.out.print(valor+", "); 
        if(izquierda!=null){
            izquierda.preorden();
        }
        if(derecha!=null){
            derecha.preorden();
        }
        
    }
    
}
