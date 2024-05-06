/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpTres;

/**
 *
 * @author Agustín
 */
public class Contrasenas {
    
    public static boolean verificarLongitud(String contrasena) {
        return contrasena.length() >= 8;
    }

   
    public static boolean verificarDigitos(String contrasena) {
        for (char caracter : contrasena.toCharArray()) {
            if (Character.isDigit(caracter)) {
                return true;
            }
        }
        return false;
    }

  
    public static boolean verificarCaracterEspecial(String contrasena) {
        String caracteresEspeciales = "!@#$%^&*";
        for (char caracter : contrasena.toCharArray()) {
            if (caracteresEspeciales.contains(Character.toString(caracter))) {
                return true;
            }
        }
        return false;
    }

    
    public static String construirContrasena(String... componentes) {
        StringBuilder contrasenaSegura = new StringBuilder();
        for (String componente : componentes) {
            contrasenaSegura.append(componente);
        }
        return contrasenaSegura.toString();
    }
}
