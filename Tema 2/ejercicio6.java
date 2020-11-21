import java.util.Scanner;
public class ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1, nota2, nota3;
        System.out.println("Introduzca la nota del primer examen: ");
        nota1 = sc.nextDouble();
        System.out.println("¿Que nota buscas obtener este trimestre?: ");
        nota2 = sc.nextDouble();
        nota3 = (nota2-(0.4*nota1))/0.6;

        if (nota3>10||nota3<0){
            System.out.println("No es posible obtener esta nota: ");
        }else{

        System.out.println("Para obtener: " +nota2+ "En el trimestre debes obtener un: " +nota3);
        }
    }
}
