/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plantelEquipo;

/**
 *
 * @author Agustín
 */
import java.util.List;

public class Masajista extends Persona {
    private int aniosExperiencia;
    private List<String> certificados;
    private String especialidad;
    
    public Masajista(String nombre, int edad, int aniosExperiencia, List<String> certificados, String especialidad){
        super(nombre, edad);
        this.aniosExperiencia = aniosExperiencia;
        this.certificados = certificados;
        this.especialidad = especialidad;
    }
            
    public int getAniosExperiencia(){
    return aniosExperiencia;
    }        
    
    public void setAniosExperiencia(int aniosExperiencia){
    this.aniosExperiencia = aniosExperiencia;
    }
    
    public List<String> getCertificados(){
    return certificados;
    }
    
    public void setCertificados(List <String> certificados){
    this.certificados = certificados;
    }
    
    public String getEspecialidad(){
    return especialidad;
    }
    
    public void setEspecialidad(String especialidad){
    this.especialidad = especialidad;
    }





}

