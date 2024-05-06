/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpTres;

import java.util.Scanner;

/**
 *
 * @author Agustín
 */
public class TestContrasenas {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Ingrese una contraseña: ");
        String contrasena = scanner.nextLine();

     
        boolean longitudValida = Contrasenas.verificarLongitud(contrasena);
        boolean contieneDigitos = Contrasenas.verificarDigitos(contrasena);
        boolean contieneCaracterEspecial = Contrasenas.verificarCaracterEspecial(contrasena);

       
        System.out.println("Longitud de la contraseña: " + (longitudValida ? "Válida" : "No válida"));
        System.out.println("Contiene al menos un dígito numérico: " + (contieneDigitos ? "Sí" : "No"));
        System.out.println("Contiene al menos un carácter especial: " + (contieneCaracterEspecial ? "Sí" : "No"));

    
        String parte1 = "Ahjak";
        String parte2 = "123";
        String parte3 = "!@#$";
        String contrasenaSegura = Contrasenas.construirContrasena(parte1, parte2, parte3);
        System.out.println("Contraseña segura construida: " + contrasenaSegura);
    }
    
}
