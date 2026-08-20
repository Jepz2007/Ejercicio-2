import java.util.Scanner;
public class Menu {
    public static void menu( Mascota mascotaActual){

        Scanner scanner = new Scanner(System.in);

        System.out.println("1: Crear nueva mascota");
        System.out.println("2: Registrar nuevo control de peso");
        System.out.println("3: Consultar historial de peso");
        System.out.println("4: Consultar un control de peso");
        System.out.println("5: Modificar un control de peso");
        System.out.println("6: Promedio de peso");
        System.out.println("7: Mostrar peso mayor y menor");
        System.out.println("8: Consultar disponibilidad de controles");
        System.out.println("9: Salir");
        
        System.out.println("¿Qué desea realizar?");
        int opcion = scanner.nextInt();

        switch (opcion){
            case 1:
        // 
            case 2:
                mascotaActual.registrarControl();
            case 3:
                mascotaActual.consultarHistorial();
            case 4:
                mascotaActual.consultarControl();
            case 5:
                mascotaActual.modificarPeso();
            case 6:
                mascotaActual.calcularPromedio();
            case 7:
                mascotaActual.mayorMenor();
            case 8:
                mascotaActual.controlesDisponibles();
            case 9:
                mascotaActual.salir();
        }

    }
}
