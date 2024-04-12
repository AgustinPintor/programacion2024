/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2024.tpUno;



import java.util.Scanner;

public class ejercicioDos {
    public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 
 System.out.println("Ingrese la nota del primer parcial: ");
  double nota1 = scanner.nextDouble();
  
 System.out.println("Ingrese la nota del segundo parcial: ");
  double nota2 = scanner.nextDouble();
  
 System.out.println("Ingrese la nota del tercer parcial: ");
  double nota3 = scanner.nextDouble();
  
  double promedio = (nota1 + nota2 + nota3) / 3;
  
   if (promedio >= 8){
       System.out.println("El alumno esata aprobado con una nota de: " + promedio);
   } else{
       System.out.println("El alumno desaprobo con un promedio de: " + promedio);
   }
  
 scanner.close();  
    }
}
    
