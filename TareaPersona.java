/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tareapersona;

import helpers.Deportista;
import helpers.Doctor;

/**
 *
 * @author PCVISION
 */
public class TareaPersona {

    public static void main(String[] args) {
       Doctor doctor = new Doctor ();
       Deportista deportista = new Deportista ();
       
       System.out.println("Doctor");
        
        
        
          doctor.imprimirInformacion ();
          
              System.out.println("Deportista");
              
              
         deportista.imprimirInformacion ();
    }
}
