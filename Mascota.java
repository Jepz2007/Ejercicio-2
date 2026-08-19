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

    public void nuevaMascota(){

    }
    public void registrarControl(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el peso de la mascota: ");
        float peso = scanner.nextFloat();

        controlPeso[cantidadPesos] = peso;
        cantidadPesos++;
    }
    public void consultarHistorial(){

    }
    public void consultarControl(){

    }
    public void modificarPeso(){

    }
    public void calcularPromedio(){

    }
    public void mayorMenor(){

    }
    public void controlesDisponibles(){

    }
    public void salir(){

    }

    
}