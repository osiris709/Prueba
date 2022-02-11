
import java.util.Scanner;

public class Nombre {
    
    public static void main(String args[]){
  
    Scanner leer = new Scanner(System.in);
    String nombre;
    
    System.out.println("Cual es tu nombre?");
    nombre = leer.nextLine();
    
    System.out.println("Bienvenido esto es una actualizacion" + nombre);
    }
}