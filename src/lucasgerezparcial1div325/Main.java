
package lucasgerezparcial1div325;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        //----------------------------------------------
        Scanner sc = new Scanner(System.in);
        
        //----------------------------------------------
        ColectivoTuristico c1 = new ColectivoTuristico(1, "ASD333", "ford", 4, 2003);
        LanchaTuristica l1 = new LanchaTuristica(Motor.NAFTA, "912NBL", "ferrari", 6, 1999);
        VanEjecutiva v1 = new VanEjecutiva(true, "1GOD2", "mercedez", 8, 2026);
        
        //----------------------------------------------
        EmpresaTurismo empresa = new EmpresaTurismo();
        empresa.agregarVehiculo(c1); //metodo sobrecargado agregarVehiculo(Vehiculo v)
        empresa.agregarVehiculo(l1);
        empresa.agregarVehiculo(v1);
        
        
        //----------------------------------------------
        Menu menu = new Menu(sc, empresa);
        
        //----------------------------------------------
        //INICIANDO CON LA EJECUCION DEL PROGRAMA
        
        menu.iniciar();
        
        
        
        
        
        
        
        
        
        
    }
    
}
