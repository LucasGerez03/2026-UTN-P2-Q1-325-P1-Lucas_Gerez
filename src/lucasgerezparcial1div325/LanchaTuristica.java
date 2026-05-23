
package lucasgerezparcial1div325;


public class LanchaTuristica extends Vehiculo {
    //-------------------------------------------------------------
    Motor tipoMotor;

    //-------------------------------------------------------------
    public LanchaTuristica(Motor tipoMotor, String patente, String marca, int capacidadPasajeros, int anioFabricacion) {
        super(patente, marca, capacidadPasajeros, anioFabricacion);
        this.tipoMotor = tipoMotor;
    }
    
    //-------------------------------------------------------------

    @Override
    public String mostrarVehiculo() {
        return "*Lancha Turistica, " + super.mostrarVehiculo() + "tipo De Motor: " + this.tipoMotor; 
    }
    
    public void realizarServicioTuristicoLancha(){
        System.out.println("*Realizando Servicio turistico de Lancha con patente " + getPatente() + " y tipo de motor" + this.tipoMotor);
    }
}
