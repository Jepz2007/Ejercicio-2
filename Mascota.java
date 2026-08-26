import java.util.Scanner;

public class Mascota {
    private String nombre;
    private Especie especie;
    private int edad;
    private float controlPeso[] = new float[10];
    private int cantidadPesos = 0;

    // Constructor
    public Mascota(String nombre, Especie especie, int edad){
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }
    // Métodos 

    public void nuevaMascota(Scanner scanner){

        System.out.println("=== Registrar nueva mascota ===");
        System.out.println();

        scanner.nextLine();

        System.out.print("Ingrese el nombre: ");
        nombre = scanner.nextLine();

        System.out.print("Ingrese la especie: ");
        String especieTexto = scanner.nextLine();

        System.out.print("Ingrese la edad: ");
        edad = scanner.nextInt();

        especie = Especie.valueOf(especieTexto.toUpperCase());

        controlPeso = new float[10];
        cantidadPesos = 0;

        System.out.println("Nueva mascota registrada correctamente.");

    }

    public void registrarControl(Scanner scanner){

        System.out.println("=== Registrar control ===");
        System.out.println();
        System.out.print("Ingrese el peso de la mascota: ");
        float peso = scanner.nextFloat();

        controlPeso[cantidadPesos] = peso;
        cantidadPesos++;
    }

    public void consultarHistorial(){
        System.out.println("=== Historial de peso ===");
        System.out.println();
                
        if(cantidadPesos == 0){
            System.out.println("No hay controles registrados.");
        } else {
            for(int i = 0; i < cantidadPesos; i++){
                System.out.println("Consulta " + (i + 1) + ": " + controlPeso[i] + " kg");
            }
        }         
    }

    public void consultarControl(Scanner scanner){

        System.out.println("=== Consultar control ===");
        System.out.println();

        System.out.print("Ingrese el numero de consulta: ");
        int consulta = scanner.nextInt();

        if(consulta >= 1 && consulta <= cantidadPesos){
            System.out.println("Peso: " + controlPeso[consulta - 1] + " kg");
        } else {
            System.out.println("La consulta no existe.");
        }
    }

    public void modificarPeso(Scanner scanner){

        System.out.println("=== Modificar control ===");
        System.out.println();

        System.out.print("Ingrese el numero de control: ");
        int control = scanner.nextInt();

        if(control >= 1 && control <= cantidadPesos){
            System.out.print("Ingrese el nuevo peso: ");
            float nuevoPeso = scanner.nextFloat();

            if(nuevoPeso > 0){
                controlPeso[control - 1] = nuevoPeso;
                System.out.println("Peso modificado correctamente.");
            } else {
                System.out.println("El peso debe ser mayor a 0.");
            }
        } else {
            System.out.println("El control no existe.");
        }
    }

    public void calcularPromedio(){

        System.out.println("=== Calcular promedio ===");
        System.out.println();
        float suma = 0;
        for (int i = 0; i < cantidadPesos; i++){
            suma += controlPeso[i];
        }
        float promedio = suma /cantidadPesos;

        System.out.println("El promedio de los pesos actuales es de: "+ promedio+"kg");
    }

    public void mayorMenor(){

        System.out.println("=== Peso mayor y menor registrados ===");
        System.out.println();

        float mayor = controlPeso[0];
        float menor = controlPeso[0];

        if (cantidadPesos == 0){
            System.out.println("No hay registros");
            return;
        }

        for (int i = 0; i < cantidadPesos; i++){
            
            if (controlPeso[i] > mayor){
                mayor = controlPeso[i];
            }
            if (controlPeso[i] < menor){
                menor =controlPeso[i];
            }
        }
        System.out.println("El mayor peso registrado es: "+mayor);
        System.out.println("El menor peso registrado es: "+menor);

    }
    public void controlesDisponibles(){
        System.out.println("=== Controles disponibles ===");

        int disponibles = controlPeso.length - cantidadPesos;

        System.out.println("Existen "+ disponibles+ " controles vacíos");

    }  
}