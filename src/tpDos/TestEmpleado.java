/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpDos;

/**
 *
 * @author Agustín
 */
public class TestEmpleado {
   
    public static void main(String[] args) {
    
        Empleado empleado1 = new Empleado("Agustin", "Pintor", 21, 2500.0);

        
        empleado1.mostrarInformacionCompleta();

        
        empleado1.incrementarSalario(1500.0);

      
        empleado1.mostrarInformacionCompleta();

        // salario mas $500 con 15% adicional
        empleado1.incrementarSalario(500.0, 15.0);

        //
        empleado1.mostrarInformacionCompleta();
    }
 
}
    
    

