/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co.vista;

import udem.edu.co.controlador.Controlador;
import udem.edu.co.modelo.Gato;
import udem.edu.co.modelo.Perro;

/**
 *
 * @author s204e13
 */
public class Manager {
    
    
    Controlador controlador;
    
    public Manager() {
        controlador = new Controlador();
    }
    
    public void llenar(){
        controlador.llenar(new Perro("Lucas","22","Masculino","Cocker"));
        controlador.llenar(new Gato("Toby","10","Femenino","Gato calvo"));
        controlador.llenar(new Perro("Almendra","14","Masculino","Sabueso"));
    }
    
    public void eliminar(){
        
    }
    
    public String mostrar(){
        String mostrar = controlador.mostrar();
        return mostrar;
    }
    
    
}
