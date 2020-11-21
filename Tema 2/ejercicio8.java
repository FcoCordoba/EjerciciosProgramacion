public class ejercicio8 {

    public static void main(String[] args){
        int a=12, b=8, c=6;
        a=c;
        c +=b;
        a = b + c;
        a++;
        b++;
        System.out.println(b++);
        System.out.println(a++);
        c = a++ + ++b;
        System.out.println(a +""+ b +""+ c);
    }
}