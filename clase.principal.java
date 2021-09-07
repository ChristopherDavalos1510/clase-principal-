package clase.principal.m;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        //comenzamos pidiendo sus datos al usuario
        System.out.print("coloca el tamaño del vector y la matriz: ");
        int tam = in.nextInt();
        
        System.err.println("Ejercicio numero 1");
        //se coloca la clase Main con la subclase Matriz
        
        Matriz mt = new Matriz(tam);
        mt.matriz();//se introduce el método matriz de la clase Matriz
        
        System.err.println("\n------------------------\n"
                + "Ejercicio numero 2");
        //se coloca la clase Main con la subclase Vector
        
        Vector vt = new Vector(tam);
        vt.vector();//traemos el método vector de la clase Vector
        
    }
}
