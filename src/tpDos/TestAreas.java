/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpDos;

/**
 *
 * @author Agustín
 */
public class TestAreas {
      public static void main(String[] args) {
        Areas calculadora = new Areas();

        
        double ladoCuadrado = 5.0;
        System.out.println("area del cuadrado: " + calculadora.calcularAreaCuadrado(ladoCuadrado));
        System.out.println("Perimetro del cuadrado: " + calculadora.calcularPerimetroCuadrado(ladoCuadrado));

        
        double baseRectangulo = 4.0;
        double alturaRectangulo = 6.0;
        System.out.println("area del rectangulo: " + calculadora.calcularAreaRectangulo(baseRectangulo, alturaRectangulo));
        System.out.println("Perimetro del rectangulo: " + calculadora.calcularPerimetroRectangulo(baseRectangulo, alturaRectangulo));

        
        double radioCirculo = 3.0;
        System.out.println("area del circulo: " + calculadora.calcularAreaCirculo(radioCirculo));
        System.out.println("Perimetro del circulo: " + calculadora.calcularPerimetroCirculo(radioCirculo));
    }
    
}
