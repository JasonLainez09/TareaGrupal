/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helpers;

/**
 *
 * @author PCVISION
 */
public class Persona {
    
private String nombre;   

private String edad;

private String areatrabajo;

private String lugartrabajo;


public Persona(){
    
    }
   
public void establecernombre (String nombre){
    this.nombre = nombre;
}

public String obtenernombre (){
    return this.nombre;
    
}

public void edad (String edad){
    this.edad = edad;
}

public String obteneredad (){
    return this.edad;
    
}
public void areatrabajo (String areatrabajo){
    this.areatrabajo = areatrabajo;
}

public String obtenerareatrabajo (){
    return this.areatrabajo;
    
}
public void lugartrabajo (String lugartrabajo){
    this.lugartrabajo = lugartrabajo;
}

public String obtenerlugartrabajo (){
    return this.lugartrabajo;
    
}


public void imprimirInformacion (){
    
    System.out.println ("Nombre:"+ nombre);
    System.out.println ("Edad:"+ edad);
    System.out.println ("Area de trabajo:"+ areatrabajo);
    System.out.println ("Lugar de trabajo :"+ lugartrabajo);
 
}

}
