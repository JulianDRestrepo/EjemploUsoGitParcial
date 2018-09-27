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
public class Perro extends Animal{
    
    private String raza;

    public Perro() {
    }

    public Perro(String nombre, String edad, String sexo, String raza) {
        super(nombre, edad, sexo);
        this.raza=raza;
    }

    @Override
    public int promedioVida() {
        int promedioVida=10;
        return promedioVida;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    
    
    
}
