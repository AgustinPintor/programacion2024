/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpTres;

/**
 *
 * @author Agustín
 */
public class Inversion {
    
    public static double calcularValorFuturo(double inversionInicial, double tasaInteresAnual, int años) {
        return inversionInicial * Math.pow(1 + tasaInteresAnual, años);
    }

   
    public static double redondearValor(double valor, String metodo) {
        return switch (metodo) {
            case "normal" -> Math.round(valor);
            case "arriba" -> Math.ceil(valor);
            case "abajo" -> Math.floor(valor);
            default -> valor;
        }; 
    }
}
