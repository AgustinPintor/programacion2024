/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plantelEquipo;

/**
 *
 * @author Agustín
 */
public class Utilero extends Persona {
    private int aniosExperiencia;
    private String funciones;
    private String categoria;
    
    public Utilero(String nombre, int edad, int aniosExperiencia, String funciones, String categoria){
    super(nombre, edad);
    this.aniosExperiencia = aniosExperiencia;
    this.funciones = funciones;
    this.categoria = categoria;
    }
    
    public int getAniosExperiencia(){
    return aniosExperiencia;
    }
    
    public void setAniosExperiencia(int aniosExperiencia){
        this.aniosExperiencia = aniosExperiencia;
    }
    
    public String getFunciones(){
    return funciones;
    }
    
    public void setFunciones(String funciones){
    this.funciones = funciones;
    }
    
    public String getCategoria(){
    return categoria;
    }
    
    public void setCategoria(String categoria){
    this.categoria = categoria;
    }
    
    
    
}
