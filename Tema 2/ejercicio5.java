import java.util.Scanner;

public class ejercicio5 {
   
    public static void main(String[] args) {
       double a = 0;
       final double cambio = 166.386;
       double conversor = 0;

       System.out.println("Ingresa los euros de los que quieras saber su valor en pesetas: ");
       Scanner sa = new Scanner(System.in);
       a = sa.nextDouble();
       conversor = a * cambio;
       System.out.println("Su valor equivale a: " + conversor + "tantas pesetas");
       
    }

}