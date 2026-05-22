package lucasgerezparcial1div325;

import java.util.Scanner;

public class Menu {

    //---------------------------------------------------------
    //atributos
    private Scanner sc;
    private EmpresaTurismo empresa;

    //---------------------------------------------------------
    //Constructor
    public Menu(Scanner sc, EmpresaTurismo empresa) {
        this.sc = sc;
        this.empresa = empresa;
    }

    //---------------------------------------------------------
    //metodos de clase y estaticos
    public static int leerEnteros(String mensaje, Scanner scanner) {
        while (true) {
            System.out.println(mensaje);
            try {
                int v = Integer.parseInt(scanner.nextLine());
                return v;
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un numero valido: ");
            }
        }
    }

    public static double leerDoubles(String mensaje, Scanner scanner) {
        while (true) {
            System.out.println(mensaje);
            try {
                double v = Double.parseDouble(scanner.nextLine());
                return v;
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un numero valido: ");
            }
        }
    }

    public static String leerTexto(String mensaje, Scanner scanner) {
        String texto = "";
        while (texto.trim().isEmpty()) {
            System.out.print(mensaje);
            texto = scanner.nextLine();
            if (texto.trim().isEmpty()) {
                System.out.println("El campo no puede estar vacío.");
            }
        }
        return texto.trim();
    }

    public void iniciar() {
        
        System.out.println("--------- INICIANDO PROGRAMA DE VEHICULOS ---------");
        boolean activo = true;
        while (activo) {
            System.out.println("\n************ Menu de Vehiculos ************");
            System.out.println("1.Agregar vehiculo");
            System.out.println("2.Mostrar todos los vehiculos");
            System.out.println("3.Realizar servicios turisticos");
            System.out.println("4.Buscar vehiculo por patente");
            System.out.println("5.Mostrar vehiculos con capacidad mayor a un valor ingresado");
            System.out.println("6.Mostrar vehiculos ordenados por anio de fabricacion descendente");
            System.out.println("7.Mostrar vehiculos ordenados por capacidad de pasajeros descendente");
            System.out.println("8.Salir");

            int opcion = leerEnteros("Seleccione una opcion del menu: ", sc);
            switch (opcion) {
                case 1:
                    this.empresa.agregarVehiculo(sc);

                    break;
                case 2:
                    this.empresa.mostrarVehiculos();

                    break;
                case 3:
                    this.empresa.realizarServicioTuristico();

                    break;
                case 4:
                    this.empresa.buscarVehiculoPorPatente(sc);

                    break;
                case 5:
                    this.empresa.mostrarVehiculosConCapacidadMayor(sc);

                    break;
                case 6:
                    this.empresa.mostrarVehiculosPorAñoDeFabricacionDesc();
                    
                    break;
                case 7:
                    this.empresa.mostrarVehiculosPorCapacidadDePasajDesc();
                    
                    break;
                case 8:
                    System.out.println("--------- PROGRAMA DE VEHICULOS FINALIZADO ---------");
                    System.out.println("alumno: Lucas Gaston Gerez");
                    return;
                default:
                    System.out.println("opcion invalida");
                    continue;
            }
        }
    }

}
