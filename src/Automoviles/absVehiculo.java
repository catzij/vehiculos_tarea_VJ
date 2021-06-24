/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Automoviles;

/**
 *
 * @author catzi
 */
public abstract class absVehiculo {
    
    private static int contadorCombustible;
    private final int velocidadMaxima = 60;
    
    public abstract void tipoCombustible();
    
    public abstract void cantidadDeGalonesGasolina();
    
    public abstract void cantidadPasajeros();
    
    public abstract void velocidadMaxima();
    
}
