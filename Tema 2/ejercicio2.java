import java.util.Scanner;
public class ejercicio2{
    public static void main(String[] args) {
        int a=0;
        int b=0;
        int c=0;

        System.out.println("Introduce la variable A: ");
        Scanner sa=new Scanner(System.in);
        System.out.println("Introduce la variable B: ");
        Scanner sb=new Scanner(System.in);
        b=sb.nextInt();
        c=a;
        a=b;
        b=c;
        System.out.println("La variable A se ha cambiada por la B = " + a);
        System.out.println("La variable B se ha cambiada por la A = " + b);
    }
}