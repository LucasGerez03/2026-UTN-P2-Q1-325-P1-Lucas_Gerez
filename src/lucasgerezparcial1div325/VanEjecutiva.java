
package lucasgerezparcial1div325;


public class VanEjecutiva extends Vehiculo {
    //-------------------------------------------------------------
    private boolean aireAcondicionado;

    //-------------------------------------------------------------
    public VanEjecutiva(boolean aireAcondicionado, String patente, String marca, int capacidadPasajeros, int anioFabricacion) {
        super(patente, marca, capacidadPasajeros, anioFabricacion);
        this.aireAcondicionado = aireAcondicionado;
    }
    //-------------------------------------------------------------

    @Override
    public String mostrarVehiculo() {
        return "*Van Ejecutiva, " + super.mostrarVehiculo() + "Aire Acondicionado: " + this.aireAcondicionado; 
    }
    
    
    
    
    
}
