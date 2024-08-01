/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plantelEquipo;

/**
 *
 * @author Agustín
 */
public class Entrenador extends Persona {
    private int aniosExperencia;
    private String titulo;
    private String nombreEquipo;
    private final int aniosExperiencia;

    
    public Entrenador(String nombre, int edad, int aniosExperiencia, String titulo, String nombreEquipo){
    super(nombre, edad);
    this.aniosExperiencia = aniosExperiencia;
    this.titulo = titulo;
    this.nombreEquipo = nombreEquipo;
    }
    
    public int getAniosExperiencia(){
    return aniosExperiencia;
    }
    
    public void setAniosExperiencia(int aniosExperiencia){
    this.aniosExperencia = aniosExperiencia;
    }
    
    public String getTitulo(){
    return titulo;
    }
    
    public void setTitulo(String titulo){
    this.titulo = titulo;
    }
    
    public String getNombreEquipo(){
    return nombreEquipo;
    }
    
    public void setNombreEquipo(String nombreEquipo){
    this.nombreEquipo = nombreEquipo;
    }
}
