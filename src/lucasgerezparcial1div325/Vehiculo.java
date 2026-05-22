package lucasgerezparcial1div325;

public abstract class Vehiculo{
    //----------------------------------------------------
    private String patente;
    private String marca;
    private int capacidadPasajeros;
    private int anioFabricacion;

    //----------------------------------------------------
    public Vehiculo(String patente, String marca, int capacidadPasajeros, int anioFabricacion) {
        this.patente = patente;
        this.marca = marca;
        this.capacidadPasajeros = capacidadPasajeros;
        this.anioFabricacion = anioFabricacion;
    }
    
    //----------------------------------------------------

    public String getPatente() {
        return patente;
    }

    public String getMarca() {
        return marca;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }
    
    //----------------------------------------------------
    
    public String mostrarVehiculo(){
        return "patente: " + this.patente + ", marca: " + this.marca + ", capacidad de Pasajeros: " + this.capacidadPasajeros + ", Anio De Fabricacion: " + this.anioFabricacion + ",";
    }

    
    
    
    
}
