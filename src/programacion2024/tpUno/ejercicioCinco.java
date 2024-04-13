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

public class ejercicioCinco {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese un valor distinto de cero para x");
        int x = scanner.nextInt();
        
        System.out.println("Ingrese un valor distinto de cero para y");
        int y = scanner.nextInt();
        
        if(x > 0 && y > 0){
            System.out.println("El punto ingresado se encuentra en el 1er cuadrante");
        }else if(x < 0 && y < 0){
            System.out.println("El punto ingresado se encuentra en el 2do cuadrante");
        }else{
           System.out.println("El punto ingresado no se encuenta en los dos primeros cuadrantes");
            
        }
        
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    scanner.close();
    }
    
}
