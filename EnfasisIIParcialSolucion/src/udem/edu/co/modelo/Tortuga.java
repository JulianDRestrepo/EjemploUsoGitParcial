/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co.modelo;

/**
 *
 * @author s204e13
 */
public class Tortuga extends Animal{

    public Tortuga() {
    }

    public Tortuga(String nombre, String edad, String sexo) {
        super(nombre, edad, sexo);
    }
    
    @Override
    public int promedioVida() {
        int promedioVida=40;
        return promedioVida;
    }
    
    
    
}
