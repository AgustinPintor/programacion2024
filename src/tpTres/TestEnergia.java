/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpTres;

/**
 *
 * @author Agustín
 */
public class TestEnergia {
     public static void main(String[] args) {
        Energia calculadora = new Energia();

       
        double reduccionConsumo = 20; // Reducción del consumo en un 20%
        double ahorroAnual = calculadora.calcularAhorroEnergiaAnual(reduccionConsumo);
        System.out.println("Ahorro de energía anual: " + ahorroAnual + " kWh");

        
        double[] consumos = {800, 950, 700, 1100, 600}; 
        double maximoConsumo = calculadora.calcularMaximoConsumo(consumos);
        double minimoConsumo = calculadora.calcularMinimoConsumo(consumos);
        System.out.println("Máximo consumo de energía: " + maximoConsumo + " kWh");
        System.out.println("Mínimo consumo de energía: " + minimoConsumo + " kWh");
    }
}
    
    

