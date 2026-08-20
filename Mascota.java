import java.util.Scanner;

public class Mascota {
    public String nombre;
    public Especie especie;
    public int edad;
    public float controlPeso[] = new float[10];
    public int cantidadPesos = 0;

    // Constructor
    public Mascota(String nombre, Especie especie, int edad){
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }
    // Métodos 

    public void nuevaMascota(){

    }

    public void registrarControl(Scanner scanner){

        System.out.print("Ingrese el peso de la mascota: ");
        float peso = scanner.nextFloat();

        controlPeso[cantidadPesos] = peso;
        cantidadPesos++;
    }

    public void consultarHistorial(){
        System.out.println("Historial de consultas: ");
        
        if(cantidadPesos == 0){
            System.out.println("No hay controles registrados.");
        } else {
            for(int i = 0; i < cantidadPesos; i++){
                System.out.println("Consulta " + (i + 1) + ": " + controlPeso[i] + " kg");
            }
        }         
    }

    public void consultarControl(Scanner scanner){

        System.out.print("Ingrese el numero de consulta: ");
        int consulta = scanner.nextInt();

        if(consulta >= 1 && consulta <= cantidadPesos){
            System.out.println("Peso: " + controlPeso[consulta - 1] + " kg");
        } else {
            System.out.println("La consulta no existe.");
        }
    }

    public void modificarPeso(Scanner scanner){

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

        double suma = 0;
        for (int i = 0; i < cantidadPesos; i++){
            suma += controlPeso[i];
        }
        double promedio = suma /cantidadPesos;

        System.out.println("El promedio de los pesos actuales es de: "+ promedio+"kg");
    }

    public void mayorMenor(){

    }
    public void controlesDisponibles(){

    }
    public void salir(){

    }

    
}