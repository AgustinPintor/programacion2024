/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plantelEquipo;

/**
 *
 * @author Agustín
 */
public class Jugador extends Persona {
    private String posicion;
    private int dorsal;
    private int golesAnotados;

    public Jugador(String nombre, int edad, String posicion, int dorsal){
        super(nombre, edad);
        this.posicion = posicion;
        this.dorsal = dorsal;
        this.golesAnotados = 0;
    }
    
    public String getPosicion(){
    return posicion;
    }
    
    public void setPosicion(String posicion){
    this.posicion = posicion;
    }
    
    public int getDorsal(){
    return dorsal;
    }
    
    public void setDorsal(int dorsal){
    this.dorsal = dorsal;
    }
    
    public int getGolesAnotados(){
    return golesAnotados;
    }
    
    public void anotarGol(){
    this.golesAnotados++;
    }
}
