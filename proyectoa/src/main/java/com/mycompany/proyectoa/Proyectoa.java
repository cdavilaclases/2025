/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectoa;

import java.util.ArrayList;

/**
 *
 * @author carlos
 */
public class Proyectoa {

    
    public static ArrayList<Usuario> usuarios = new ArrayList<>();
    
    public static void main(String[] args) {
     
        Usuario admin = new Usuario();
        admin.nombre = "admin";
        admin.password = "admin";
        admin.rol = "A";
        admin.usuario = "admin";
        usuarios.add(admin);
        
        Login l = new Login();
        l.setVisible(true);
        
    }
}
