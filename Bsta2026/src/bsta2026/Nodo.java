/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bsta2026;

/**
 *
 * @author carlos
 */
public class Nodo {
    
    public Nodo izquierda;
    public Nodo derecha;
    public int valor;
    
    public void insertarHijo(Nodo hijo){
        
        if(hijo.valor<valor){
            if(izquierda !=null){
                izquierda.insertarHijo(hijo);
            }
            else{
                izquierda = hijo;
            }
        }
        else{
            if(derecha !=null){
                derecha.insertarHijo(hijo);
            }
            else{
                derecha = hijo;
            }
        }
    
    }
    
    public void inorden(){
        if(izquierda != null){
            izquierda.inorden();
        }
        System.out.print(","+valor);
        if(derecha != null){
            derecha.inorden();
        }
    }
    
    public void postorden(){
        if(izquierda != null){
            izquierda.postorden();
        }
        if(derecha != null){
            derecha.postorden();
        }
        System.out.print(","+valor);
        
    }
    
    public void preorden(){
        System.out.print(","+valor);
        if(izquierda != null){
            izquierda.preorden();
        }
        if(derecha != null){
            derecha.preorden();
        }
    }
    
    public String textoGraphviz(){
        if(izquierda == null && derecha == null){
            return String.valueOf(valor);
        }
        else{
            String texto = "";
            if(izquierda!=null){
                texto = valor+"->"+izquierda.textoGraphviz()+"\n";
                
            }
            if(derecha!=null){
                texto+= valor+"->"+derecha.textoGraphviz()+"\n";
            }
            return texto;
        }
    }
    
}
