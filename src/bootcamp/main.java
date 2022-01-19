package bootcamp;
import java.util.Scanner;

public class main {
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);

        System.out.print("ingresa un nombre: ");
        String nombre = teclado.next();

        System.out.print("ingresa la fecha de hoy: ");
        int fecha = teclado.nextInt();

        System.out.print("¿Es soleado por ahi?: ");
        boolean comprobar = teclado.nextBoolean();

        System.out.println("Hola " + nombre + ", como estas?");
        System.out.println("la fecha de hoy es: " + fecha);
        System.out.println("Es soleado?: " + comprobar);

    }
}
