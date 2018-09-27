/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co.controlador;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import java.util.List;
import udem.edu.co.modelo.Animal;

/**
 *
 * @author s204e13
 */
public class Controlador {
    
    private List<Animal> listAnimales;
    
    public Controlador() {
        this.listAnimales = new ArrayList<Animal>();
    }
    
    //Si se implementa este método se deben usar DTO's, debido a que éste método solicitará métodos abstractos.
    /*
    public void llenar(String nombre, String edad, String sexo){
        listAnimales.add(new Animal(nombre,edad,sexo) {
            @Override
            public int promedioVida() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }*/
    
    public void llenar(Animal animal){
        listAnimales.add(animal);
    }
    
    public String mostrar(){
        String stringAnimal="";
        for (Animal animal : listAnimales) {
            stringAnimal=stringAnimal+animal.toString();
        }
        return stringAnimal;
    }

    public List getListAnimales() {
        return listAnimales;
    }

    public void setListAnimales(List<Animal> listAnimales) {
        this.listAnimales = listAnimales;
    }

    
    
    
    
}
