import java.util.Scanner;

public class ejercicio3 {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Introduce el valor a: ");
        a = sc.nextInt();
        System.out.println("Introduce el valor b: ");
        b = sc.nextInt();

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a/b);
        System.out.println(a*b);

    }
}
