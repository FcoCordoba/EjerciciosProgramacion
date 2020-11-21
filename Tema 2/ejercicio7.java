import java.util.Scanner;

public class ejercicio7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double z=0, x=23, y=9;
       //Entiendo que debemos darle nosotros el valor a calcular ya predifinido

        z = (1 +((x*x) / y)) / ((x*x*x) / (1+y));

        System.out.println("El valor de z sera: " +z);
    }
}