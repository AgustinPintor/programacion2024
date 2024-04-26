/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpDos;



public class TestFechas {
    
 public static void main(String[] args) {
        Fechas manejador = new Fechas();

       
        int diasTranscurridos1 = manejador.calcularDiasTranscurridos(15, 4, 2023);
        System.out.println("Días transcurridos: " + diasTranscurridos1);

     
        int diasTranscurridos2 = manejador.calcularDiasTranscurridos("15/04/2023");
        System.out.println("Días transcurridos: " + diasTranscurridos2);

      
        int año = 2024;
        boolean esBisiesto1 = manejador.esBisiesto(año);
        System.out.println(año + " es bisiesto: " + esBisiesto1);

 
        String fecha = "15/04/2024";
        boolean esBisiesto2 = manejador.esBisiesto(fecha);
        System.out.println(fecha + " es bisiesto: " + esBisiesto2);
    }
 
    
}
