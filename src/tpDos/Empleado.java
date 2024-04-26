/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpDos;

/**
 *
 * @author Agustín
 */
public class Empleado {
    
    private String nombre;
    private String apellido;
    private int edad;
    private double salario;

    // constructor
    public Empleado(String nombre, String apellido, int edad, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = salario;
}
    
    // informacion completa
    public void mostrarInformacionCompleta() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: $" + salario);
    }

    // informacion sin salario
    public void mostrarInformacionSinSalario() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
    }

    // incremento especifico de salario
    public void incrementarSalario(double cantidad) {
        this.salario += cantidad;
    }

    //  incrementar adicional de salario
    public void incrementarSalario(double cantidad, double porcentajeAdicional) {
        double incrementoTotal = cantidad * (1 + (porcentajeAdicional / 100));
        this.salario += incrementoTotal;
    }
}
