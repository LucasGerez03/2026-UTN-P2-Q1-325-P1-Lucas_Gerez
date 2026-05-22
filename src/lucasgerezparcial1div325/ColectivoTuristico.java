
package lucasgerezparcial1div325;


public class ColectivoTuristico extends Vehiculo {
    private int cantidadPisos;

    public ColectivoTuristico(int cantPisos, String patente, String marca, int capacidadPasajeros, int anioFabricacion) {
        super(patente, marca, capacidadPasajeros, anioFabricacion);
        this.cantidadPisos = cantPisos;
    }
    
    //-------------------------------------------------------------

    @Override
    public String mostrarVehiculo() {
        return "*Colectivo Turistico, " + super.mostrarVehiculo() + "cantidad de pisos: " + this.cantidadPisos; 
    }
    
    public void realizarServicioTuristico(){
        System.out.println("*Realizando Servicio turistico de Colectivo con patente " + getPatente() + " y con " + this.cantidadPisos + " pisos");
    }
    
}
