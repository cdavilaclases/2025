/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package archivobinarioa;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author carlos
 */
public class Programa implements Serializable{
    
    private ArrayList<Persona> personas;

    /**
     * @return the personas
     */
    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    /**
     * @param personas the personas to set
     */
    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }
    
}
