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
public class vehiculoGeneral extends absVehiculo implements direccion{
    
    private String nombre; 
    private int ctdPasajeros;
    private int mxmVelocidad = 60;
    private int tpCombustible;
    private int tpVehiculo;
    
    private static int contadorGasolina;
    
    private static int contadorInstancias;
    
    //constructor
    public vehiculoGeneral(String nombre, int ctdPasajeros, int tpCombustible, boolean vuelta, int tpVehiculo){
        
        this.nombre = nombre;
        this.ctdPasajeros = ctdPasajeros;
        this.tpCombustible = tpCombustible;
        this.tpVehiculo = tpVehiculo;

        contadorInstancias++;
        
    }
    //fin constructor
    
    public void decirTpVehiculo(){        
        System.out.println("es : " + this.nombre);
    }

    @Override
    public void tipoCombustible() {      
                
        switch(getTpCombustible()){
                case 1:
                    System.out.println("el vehiculo usa combustible tipo DIESEL");
                break;
                case 2:
                    System.out.println("el vehiculo usa combustible tipo GASOLINA");
                break;
                default:
                    System.out.println("el vehiculo usa combustible tipo GASOLINA");
                break;
        }
    }
    
    @Override
    public void cantidadDeGalonesGasolina() {
        if(contadorGasolina<=0){
            System.out.println("ya no hay combustible");
        }else{
            System.out.println("el vehiculo tiene "+contadorGasolina+" galones de combustible");
        }
        contadorGasolina-=5;
    }

    @Override
    public void cantidadPasajeros() {
        System.out.println("el vehiculo tiene "+getCtdPasajeros()+" pasajeros ");
    }

    @Override
    public void velocidadMaxima() {
        switch(getTpVehiculo()){
            case 1:
                System.out.println("velocidad maxima es :"+getMxmVelocidad());
            break;
            case 2:
                System.out.println("velocidad maxima es :"+getMxmVelocidad());
            break;
            case 3:
                System.out.println("el vehiculo es de carreras :"+(getMxmVelocidad()*3));
            break;
            default:
                System.out.println("velocidad maxima es :"+getMxmVelocidad());
            break;
        }
    }
    
    @Override
    public void derecha() {
        System.out.println("el vehiculo giro a la derecha");
    }

    @Override
    public void izquierda() {
        System.out.println("el vehiculo giro a la izquiera");          
    }

    public int getTpVehiculo() {
        return tpVehiculo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCtdPasajeros() {
        return ctdPasajeros;
    }

    public void setCtdPasajeros(int ctdPasajeros) {
        this.ctdPasajeros = ctdPasajeros;
    }

    public int getMxmVelocidad() {
        return mxmVelocidad;
    }

    public void setMxmVelocidad(int mxmVelocidad) {
        this.mxmVelocidad = mxmVelocidad;
    }

    public int getTpCombustible() {
        return tpCombustible;
    }

    public void setTpCombustible(int tpCombustible) {
        this.tpCombustible = tpCombustible;
    }

    public static int getContadorGasolina() {
        return contadorGasolina;
    }

    public static void setContadorGasolina(int contadorGasolina) {
        vehiculoGeneral.contadorGasolina = contadorGasolina;
    }       
}
