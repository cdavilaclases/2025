/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectob2026;
import java.util.ArrayList;
/**
 *
 * @author carlos
 */
public class ProyectoB2026 {

    public static ArrayList<Usuario> usuarios = new ArrayList<>();
    public static Usuario usuarioLogin;
    
    public static ArrayList<Consultorio> consultorios = new ArrayList<>();
    
    public static void main(String[] args) {
        Login l = new Login();
        l.setVisible(true);
        
        Usuario u = new Usuario();
        u.usuario = "admin";
        u.password = "admin";
        u.rol = "Administrador";
        
        usuarios.add(u);
        
    }
}
