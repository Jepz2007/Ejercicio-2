import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Crear mascota ===");

        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la especie: ");
        String especieTexto = scanner.nextLine();

        System.out.print("Ingrese la edad: ");
        int edad = scanner.nextInt();

        // crear mascota
        Mascota mascotaActual = new Mascota(
            nombre,
            Especie.valueOf(especieTexto.toUpperCase()),
            edad
        );

        // Abrir menú
        Menu.menu(mascotaActual);
    }
}