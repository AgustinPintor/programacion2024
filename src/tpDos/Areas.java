/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpDos;

/**
 *
 * @author Agustín
 */
public class Areas {
  
    public double calcularAreaCuadrado(double lado) {
        return lado * lado;
    }

  
    public double calcularPerimetroCuadrado(double lado) {
        return 4 * lado;
    }

 
    public double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }

   
    public double calcularPerimetroRectangulo(double base, double altura) {
        return 2 * (base + altura);
    }


    public double calcularAreaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

   
    public double calcularPerimetroCirculo(double radio) {
        return 2 * Math.PI * radio;
    }
}
