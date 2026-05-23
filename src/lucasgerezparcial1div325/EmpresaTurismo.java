package lucasgerezparcial1div325;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class EmpresaTurismo {

    private ArrayList<Vehiculo> vehiculos;

    //---------------------------------------------------
    public EmpresaTurismo() {
        this.vehiculos = new ArrayList<>();
    }

    //---------------------------------------------------
    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }
    
    //
    public void agregarVehiculo(Vehiculo v){
        this.vehiculos.add(v);
    }
    
    //---------------------------------------------------
    //opt 1
    public void agregarVehiculo(Scanner scanner) {
        System.out.println("Seleccione el tipo de Vehiculo: ");
        System.out.println("1_Colectivo Turistico");
        System.out.println("2_Van Ejecutiva");
        System.out.println("3_Lanchas turisticas");
        
        Vehiculo v1 = null;
        
        int opt = Menu.leerEnteros("Ingrese un numero (1-3): ", scanner);

        if (opt < 1 || opt > 3) {
            System.out.println("Tipo de Opcion invalida (1-3).");
            return;
        }
        ////---------------------------------------------------
        String patente = Menu.leerTexto("Ingrese una patente: ", scanner);

        if (patente.trim().isEmpty()) {
            System.out.println("XXX ERROR XXX : Patente VACIA");
            return;
        }
        ////---------------------------------------------------
        String marca = Menu.leerTexto("Ingrese una marca:", scanner);
        
        if (marca.trim().isEmpty()) {
            System.out.println("XXX ERROR XXX : Marca VACIA");
            return;
        }
        
        ////---------------------------------------------------
        int capacidadPasajeros = Menu.leerEnteros("Ingrese la capacidad de pasajeros", scanner);
        if (capacidadPasajeros <= 0) {
            System.out.println("XXX ERROR XXX : Capacidad de pasajeros 0 o nula");
            return;
        }
        ////---------------------------------------------------
        int anioFabricacion = Menu.leerEnteros("Ingrese un anio de fabricacion: ", scanner);

        if (anioFabricacion < 1990 || anioFabricacion > 2026) {
            System.out.println("XXX ERROR XXX : Año de Fabriacion invalido, rango: (1990 - 2026)");
            return;
        }
        ////---------------------------------------------------
        switch (opt) {
            case 1:
                int cantidadPisos = Menu.leerEnteros("Ingrese una cantidad de pisos (1-2)", scanner);
                while(cantidadPisos < 1 || cantidadPisos > 2 ){
                    cantidadPisos = Menu.leerEnteros("Cantidad de pisos Incorrecta, porfavor elija 1 o 2.", scanner);
                }
                
                v1 = new ColectivoTuristico(cantidadPisos, patente, marca, capacidadPasajeros, anioFabricacion);
                break;

            case 2:
                System.out.println("Van ejecutiva con Aire acondicionado?");
                System.out.println("1_Si");
                System.out.println("2_No");
                int aire = Menu.leerEnteros("Ingrese una opcion (1-2)", scanner);
                while(aire < 1 || aire > 2  ){
                    aire = Menu.leerEnteros("Ingrese una opcion VALIDA (1-2)", scanner);
                }
                
                boolean AireAcondicionado; 
                
                if (aire == 1){
                    AireAcondicionado = true;
                }else{
                    AireAcondicionado = false;
                }
                
                v1 = new VanEjecutiva(AireAcondicionado, patente, marca, capacidadPasajeros, anioFabricacion);  
                
                break;

            case 3:
                System.out.println("Tipo de motor para Van Ejecutiva: ");
                System.out.println("1_NAFTA");
                System.out.println("2_DIESEL");
                System.out.println("2_ELECTRICO");
                
                int motorOpt = Menu.leerEnteros("Ingrese una opcion (1-3)", scanner);
                
                if (motorOpt < 1 || motorOpt > 3){
                    motorOpt = Menu.leerEnteros("Ingrese una opcion Valida (1-3)", scanner);
                }
                
                Motor tipoMotor;
                
                if (motorOpt == 1) {
                    tipoMotor = Motor.NAFTA;
                }else if(motorOpt == 2){
                    tipoMotor = Motor.DIESEL;
                }else{
                    tipoMotor = Motor.ELECTRICO;
                }
                
                v1 = new LanchaTuristica(tipoMotor, patente, marca, capacidadPasajeros, anioFabricacion);
                
                break;
            default:
                throw new AssertionError();
        }
        
        if(v1 != null){
            this.vehiculos.add(v1);
        }else{
            System.out.println("XXX ADVERTENCIA XXX : Vehiculo invalido");
        }
        

    }
    
    //---------------------------------------------------------------
    //opt2
    public void mostrarVehiculos(){
        System.out.println("\n------------MOSTRANDO VEHICULOS ------------\n");
        for(Vehiculo v : this.vehiculos){
            System.out.println(v.mostrarVehiculo());
        }
        System.out.println("\n------------FIN DE DEMOSTRACION DE VEHICULOS ------------\n");
    }
    
    
    //AUXILIAR
    private void mostrarVehiculos(ArrayList<Vehiculo> vehicls){ //mostrar vehiculos de un Array de vehiculos
        System.out.println("\n------------MOSTRANDO VEHICULOS ------------\n"); // utilizada en la opcion 6 y 7 del menu
        for(Vehiculo v : vehicls){
            System.out.println(v.mostrarVehiculo());
        }
        System.out.println("\n------------FIN DE DEMOSTRACION DE VEHICULOS ------------\n");
    }
    
    //---------------------------------------------------------------
    //opt3
    
    public void realizarServicioTuristico(){
        LanchaTuristica l1 = null;
        ColectivoTuristico c1 = null;
        System.out.println("-------- Realizando Servicio Turistico --------");
        
        if(this.vehiculos.isEmpty()){
            System.out.println("-------- ADVERTENCIA, NO HAY VEHICULOS PARA SERVICIO TURISTICO --------");
        }
                
        for(Vehiculo v : this.vehiculos){
            if (v instanceof LanchaTuristica) {
                l1 = (LanchaTuristica) v;
                l1.realizarServicioTuristicoLancha();
                
            }else if (v instanceof ColectivoTuristico){
                c1 = (ColectivoTuristico) v;
                c1.realizarServicioTuristicoColectivo();
                
            }
        }
        
        System.out.println("-------- Fin de Servicios turisticos --------");
    }
    
    
    //---------------------------------------------------------------
    //opt4
    
    public void buscarVehiculoPorPatente(Scanner scanner){
        String patente = Menu.leerTexto("Ingrese la patente a buscar: ", scanner);
        
        while (patente.trim().isEmpty()){
            patente = Menu.leerTexto("XXX ERROR XXX: Patente Vacia, Ingrese una patente valida a buscar: ", scanner);
        }
        
        for(Vehiculo v : this.vehiculos){
            if(v.getPatente().equalsIgnoreCase(patente.trim())){
                System.out.println("+PATENTE "+ patente +" ENCONTRADA: ");
                System.out.println("+Vehiculo perteneciente: ");
                System.out.println(v.mostrarVehiculo());
                return;
            }
        }
        
    }
    
    
    //---------------------------------------------------------------
    //opt5
    public void mostrarVehiculosConCapacidadMayor(Scanner scanner){
        int num = Menu.leerEnteros("Ingrese un numero de Capacidad: ", scanner);
    
        while (num <= 0 ) {
            num = Menu.leerEnteros("Ingrese un numero de Capacidad Valido: ", scanner);
        }
        
        for (Vehiculo v : this.vehiculos){
            if(v.getCapacidadPasajeros() > num){ //capacidad mayor, NO mayor igual
                System.out.println(v.mostrarVehiculo()); 
            }
        }
    }
    
    //---------------------------------------------------------------
    //opt6
    
    public void mostrarVehiculosPorAñoDeFabricacionDesc(){
        ArrayList<Vehiculo> vehcls = new ArrayList<Vehiculo>(getVehiculos());
        
        Collections.sort(vehcls, new Comparator<Vehiculo>() {
            @Override
            public int compare(Vehiculo v1, Vehiculo v2) {
                
                return Integer.compare(v2.getAnioFabricacion(), v1.getAnioFabricacion());
            }
        });
        System.out.println("********** Vehiculos Por Anio de Fabricacion **********");
        mostrarVehiculos(vehcls);
            
    }
    
    
    //---------------------------------------------------------------
    //opt7
    
    public void mostrarVehiculosPorCapacidadDePasajDesc(){
        ArrayList<Vehiculo> vehcls = new ArrayList<Vehiculo>(getVehiculos());
        
        Collections.sort(vehcls, new Comparator<Vehiculo>() {
            @Override
            public int compare(Vehiculo v1, Vehiculo v2) {
                
                return Integer.compare(v2.getCapacidadPasajeros(), v1.getCapacidadPasajeros());
            }
        });
        System.out.println("********** Vehiculos Por Capacidad De Pasajeros **********");
        mostrarVehiculos(vehcls);
            
    }
    
}
