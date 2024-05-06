/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpTres;



/**
 *
 * @author Agustín
 */
public class Energia {
     
    public double calcularAhorroEnergiaAnual(double reduccionConsumo) {
      
        double consumoOriginal = 1000; // Consumo original en kWh
        double consumoReduccido = consumoOriginal * (1 - reduccionConsumo/100); // Consumo reducido en kWh

      
        double diferenciaConsumo = consumoOriginal - consumoReduccido;

      
        double ahorroAnual = Math.sqrt(diferenciaConsumo) * 365; 
        return ahorroAnual;
    }

    
    public double calcularMaximoConsumo(double[] consumos) {
        
        if (consumos.length == 0) {
            return 0;
        }

       
        double maximo = consumos[0];

      
        for (int i = 1; i < consumos.length; i++) {
            maximo = Math.max(maximo, consumos[i]);
        }

        return maximo;
    }
    
     public double calcularMinimoConsumo(double[] consumos) {
     
        if (consumos.length == 0) {
            return 0;
        }

    
        double minimo = consumos[0];

       
        for (int i = 1; i < consumos.length; i++) {
            minimo = Math.min(minimo, consumos[i]);
        }

        return minimo;
    }



    
}
