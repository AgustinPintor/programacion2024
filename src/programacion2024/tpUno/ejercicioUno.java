/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2024.tpUno;


import java.util.Scanner;

public class ejercicioUno {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la nota del alumno: ");
        double nota = scanner.nextDouble();

        if (nota < 4) {
            System.out.println("El alumno desaprobó la materia.");
        } else if (nota > 4 && nota < 10) {
            System.out.println("El alumno aprobó la materia.");
        } else if (nota == 10) {
            System.out.println("¡El alumno es sobresaliente!");
        } else {
            System.out.println("La nota ingresada no es válida.");
        }

        scanner.close();
    }
    
}
