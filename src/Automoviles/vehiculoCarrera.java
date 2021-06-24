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
public class vehiculoCarrera extends vehiculoGeneral{
    
    private static int contadorInstancias;
    
    public vehiculoCarrera(String nombre, int ctdPasajeros, int tpCombustible, boolean vuelta, int tpVehiculo) {
        super(nombre, ctdPasajeros, tpCombustible, vuelta, tpVehiculo);
        
        contadorInstancias++;
    }
    
    public static int getcontadorInstancias(){
        return contadorInstancias;
    }
    
    @Override
    public void decirTpVehiculo(){
        System.out.println("vehiculo tipo "+getNombre());
    }
    
}
