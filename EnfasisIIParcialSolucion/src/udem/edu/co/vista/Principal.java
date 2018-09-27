/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co.vista;

/**
 *
 * @author s204e13
 */
public class Principal {
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Manager manager = new Manager();
        manager.llenar();
        System.out.println(manager.mostrar());
    }

    public Principal() {
    }

    
    
    
}
