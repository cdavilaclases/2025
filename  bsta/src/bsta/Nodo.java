/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bsta;

/**
 *
 * @author carlos
 */
public class Nodo {
    
    private Nodo izquierda;
    private Nodo derecha;
    public int valor;
    
    public void insertar(Nodo nuevo){
        if(nuevo.valor>valor){
            if(derecha==null){
                derecha = nuevo;
            }
            else{
                derecha.insertar(nuevo);
            }
        }
        else{
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
