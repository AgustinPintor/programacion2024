/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpDos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Fechas {
    
    public int calcularDiasTranscurridos(int dia, int mes, int año) {
        LocalDate fechaIngresada = LocalDate.of(año, mes, dia);
        LocalDate fechaActual = LocalDate.now();
        return Math.abs((int) (fechaActual.toEpochDay() - fechaIngresada.toEpochDay()));
    }


    public int calcularDiasTranscurridos(String fecha) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaIngresada = LocalDate.parse(fecha, formatter);
        LocalDate fechaActual = LocalDate.now();
        return Math.abs((int) (fechaActual.toEpochDay() - fechaIngresada.toEpochDay()));
    }

   
    public boolean esBisiesto(int año) {
        return (año % 4 == 0 && año % 100 != 0) || año % 400 == 0;
    }

    
    public boolean esBisiesto(String fecha) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaIngresada = LocalDate.parse(fecha, formatter);
        int año = fechaIngresada.getYear();
        return esBisiesto(año);
    }
}

