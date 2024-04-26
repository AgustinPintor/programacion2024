/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpDos;

/**
 *
 * @author Agustín
 */
public class TestOperaciones {
     public static void main(String[] args) {
        Operaciones operaciones = new Operaciones();

        
        System.out.println("Suma de enteros: " + operaciones.sumar(8, 2));

        
        System.out.println("Suma de decimales: " + operaciones.sumar(9.5, 7.2));

       
        System.out.println("Resta de enteros: " + operaciones.restar(8, 5));

      
        System.out.println("Resta de decimales: " + operaciones.restar(4.3, 2.1));

    
        System.out.println("Multiplicacion de enteros: " + operaciones.multiplicar(8, 2));

        
        System.out.println("Multiplicacion de decimales: " + operaciones.multiplicar(4.5, 4.5));

        
        System.out.println("Division de enteros: " + operaciones.dividir(8, 4));

        
        System.out.println("Division de decimales: " + operaciones.dividir(8.0, 4.0));
    }
    
}
