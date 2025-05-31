/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package archivobinariob;

import java.io.Serializable;
import java.util.LinkedList;

/**
 *
 * @author carlos
 */
public class Listas implements Serializable{
    
    private LinkedList<Persona> personas;

    /**
     * @return the personas
     */
    public LinkedList<Persona> getPersonas() {
        return personas;
    }

    /**
     * @param personas the personas to set
     */
    public void setPersonas(LinkedList<Persona> personas) {
        this.personas = personas;
    }
    
}
