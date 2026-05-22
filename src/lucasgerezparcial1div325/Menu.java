
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
        boolean activo = true;
        while (activo) {
            System.out.println("\nMenu de gestion de expediciones espaciales ");
            System.out.println("1. Agregar Equipo");
            System.out.println("2. Mostrar todos los equipos");
            System.out.println("3. Preparar EQUIPOS");
            System.out.println("4. Filtrar Equipamiento Por Nivel De Uso");
            System.out.println("5. Salir");

            int opcion = leerEnteros("Seleccione: ", sc);
            switch (opcion) {
                case 1:
                    //this.empresa.agregarEquipo(sc);
                    break;
                case 2:
                    //this.empresa.mostrarEquipos();
                    break;
                case 3:
                    //this.empresa.prepararEquipos();
                    break;
                case 4:
                    /*NivelUso n1 = this.empresa.seleccionarNivelUso(sc);
                    if(n1 == null){
                        System.out.println("XXX ERROR XXX : Opcion incorrecta ");
                        break;
                    }
                    this.empresa.filtrarPorNivelUso(n1);
                    */
                    break;
                case 5:
                    //System.out.println("------ PROGRAMA FINALIZADO ------");
                    return;
                default :
                    //System.out.println("opcion invalida");
                    continue;
            }
        }
    }

}