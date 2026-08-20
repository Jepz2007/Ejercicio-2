import java.util.Scanner;
public class Menu {
    public static void menu( Mascota mascotaActual){

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do{
        System.out.println();
        System.out.println("1: Crear nueva mascota");
        System.out.println("2: Registrar nuevo control de peso");
        System.out.println("3: Consultar historial de peso");
        System.out.println("4: Consultar un control de peso");
        System.out.println("5: Modificar un control de peso");
        System.out.println("6: Promedio de peso");
        System.out.println("7: Mostrar peso mayor y menor");
        System.out.println("8: Consultar disponibilidad de controles");
        System.out.println("9: Salir");
        System.out.println();
        
        System.out.println("¿Qué desea realizar?");
        opcion = scanner.nextInt();

         if (opcion < 1 || opcion > 9) {
            System.out.println("Opción inválida. Elija del 1 al 9.");
        } else {

        switch (opcion){
            case 1:
                mascotaActual.nuevaMascota(scanner);
                break;
            case 2:
                mascotaActual.registrarControl(scanner);
                break;
            case 3:
                mascotaActual.consultarHistorial();
                break;
            case 4:
                mascotaActual.consultarControl(scanner);
                break;
            case 5:
                mascotaActual.modificarPeso(scanner);
                break;
            case 6:
                mascotaActual.calcularPromedio();
                break;
            case 7:
                mascotaActual.mayorMenor();
                break;
            case 8:
                mascotaActual.controlesDisponibles();
                break;
            case 9:
                System.out.println("Regrese pronto");
                break;
        }
    }

    }while (opcion != 9);

    }
}
