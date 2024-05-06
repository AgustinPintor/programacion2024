/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpTres;

/**
 *
 * @author Agustín
 */




public class TestInversion {
     public static void main(String[] args) {
        
        double inversionInicial = 10000; 
        double tasaInteresAnual = 0.06; 
        int años = 5; 

    
        double valorFuturo = Inversion.calcularValorFuturo(inversionInicial, tasaInteresAnual, años);

       
        double valorFuturoRedondeadoNormal = Inversion.redondearValor(valorFuturo, "normal");
        double valorFuturoRedondeadoArriba = Inversion.redondearValor(valorFuturo, "arriba");
        double valorFuturoRedondeadoAbajo = Inversion.redondearValor(valorFuturo, "abajo");


        System.out.println("Valor futuro de la inversión: $" + valorFuturo);
        System.out.println("Valor futuro redondeado (normal): $" + valorFuturoRedondeadoNormal);
        System.out.println("Valor futuro redondeado hacia arriba: $" + valorFuturoRedondeadoArriba);
        System.out.println("Valor futuro redondeado hacia abajo: $" + valorFuturoRedondeadoAbajo);
    }
    }
    
    

