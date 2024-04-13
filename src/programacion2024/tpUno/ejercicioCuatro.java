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


public class ejercicioCuatro {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Ingrese el día");
        double dia = scanner.nextDouble();
        
         System.out.println("Ingrese el mes");
        double mes = scanner.nextDouble();
        
         System.out.println("Ingrese el año");
        double año = scanner.nextDouble();
        
        if(mes >= 1 && mes <= 3){
        System.out.println("La fecha se encuentra en el primer trimestre del año");
        }else if(mes > 3 && mes <= 6){
           System.out.println("La fecha se encuentra en el segundo trimestre del año"); 
        }else if(mes > 6 && mes <= 9){
            System.out.println("La fecha se encuentra en el tercer trimestre del año");
        }else if(mes > 9 && mes <= 12){
             System.out.println("La fecha se encuentra en el cuarto trimestre del año");
        }else{
             System.out.println("Revise el número de mes ingresado");
        }
        

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    scanner.close();
    }
    
}
