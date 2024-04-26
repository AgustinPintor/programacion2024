/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpDos;

/**
 *
 * @author Agustín
 */
public class Operaciones {
    
    public int sumar(int a, int b) {
        return a + b;
    }

  
    public double sumar(double a, double b) {
        return a + b;
    }


    public int restar(int a, int b) {
        return a - b;
    }

 
    public double restar(double a, double b) {
        return a - b;
    }

   
    public int multiplicar(int a, int b) {
        return a * b;
    }

  
    public double multiplicar(double a, double b) {
        return a * b;
    }

  
    public double dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero.");
        }
        return (double) a / b;
    }

  
    public double dividir(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero.");
        }
        return a / b;
    }
}
