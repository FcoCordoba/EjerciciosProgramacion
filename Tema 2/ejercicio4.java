import java.util.Scanner;

public class ejercicio4 {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chicos,chicas;
        System.out.println("Introduce los chicos: ");
        chicos = sc.nextInt();
        System.out.println("Introduce las chicas: ");
        chicas = sc.nextInt();
        int a = 100;
        System.out.println(chicos+chicas);

        System.out.println(chicos*a/(chicos+chicas));
        System.out.println(chicas*a/(chicos+chicas));
       
    }

}
