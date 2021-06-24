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
public class Carretera {
    
    private final int CANTIDAD = 20;
    private final vehiculoGeneral nuevoVehiculo[];

    public Carretera() {
        nuevoVehiculo = new vehiculoGeneral[CANTIDAD];
        
    }
    
    public void inicializarVehiculos(){
        
        for (int i = 0; i < nuevoVehiculo.length ; i++) {
            int random = (int)(Math.random()*2);
            switch(random){
                case 0:
                    nuevoVehiculo[i] = new vehiculoCarga("vehiculo CARGA ["+vehiculoCarga.getContadorInstancias()+"]",0,100,false,1);
                break;
                case 1:
                    nuevoVehiculo[i] = new vehiculoCamioneta("vehiculo CAMIONETA ["+vehiculoCamioneta.getcontadorInstancias()+"]",100,100,false,1);
                break;
                case 2:
                    nuevoVehiculo[i] = new vehiculoCarrera("vehiculo CARRERA ["+vehiculoCarrera.getcontadorInstancias()+"]",0,100,false,1);
                break;                
            }
        }        
    }    
        
    public void presentarVehiculos(vehiculoGeneral vehiculo[]){
        
        if (vehiculo.length > 0) {
            for (int i = 0; i < vehiculo.length ; i++) {
                String tmp = "nada";
                if (vehiculo[i] instanceof vehiculoCarrera) {
                    tmp = "vehiculo de CARRERA";
                }
                if (vehiculo[i] instanceof vehiculoCarga) {
                    tmp = "vehiculo de CARGA";
                }
                if (vehiculo[i] instanceof vehiculoCamioneta) {
                    tmp = "vehiculo de CAMIONETA";                
                } 
                System.out.print(""+tmp+" >>> ");
                vehiculo[i].decirTpVehiculo();
                
            }
        }else{
            System.out.println("no hay carros");
        }
    }
    
    public void aCarretera(){
        
        this.inicializarVehiculos();
        
        this.presentarVehiculos(nuevoVehiculo);
    }
}
