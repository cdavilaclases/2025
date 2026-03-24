/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectoa2026;

import java.util.ArrayList;

/**
 *
 * @author carlos
 */
public class ProyectoA2026 {

    public static ArrayList<Usuario> usuarios = new ArrayList<>();
    
    public static void main(String[] args) {
        Usuario u = new Usuario();
        u.nombre = "admin";
        u.password = "admin";
        usuarios.add(u);
        Login l = new Login();
        l.setVisible(true);
        
    }
}
