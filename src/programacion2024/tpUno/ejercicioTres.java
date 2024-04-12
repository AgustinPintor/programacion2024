/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2024.tpUno;

/**
 *
 * @author Agustín
 */

import java.util.Scanner;

public class ejercicioTres {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese un numero del 1 al 99: ");
        double numero = scanner.nextDouble();
        
        if(numero > 0 && numero <= 99){
         if(numero >= 10){
            System.out.println("El numero ingresado tiene dos digitos");
        } else{
        System.out.println("El numero ingresado tiene un digito");
        }
        } else{
            System.out.println("El numero ingresado esta fuera del rango solicitado");
        }
      
         
    
    
    
    
    
    
    
    
    
    
    
    scanner.close();
    }
    
}
