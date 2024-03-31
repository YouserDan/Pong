import java.util.Scanner;


public class zadacha4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число А и В: ");
        int numberA = scan.nextInt();
        int numberB = scan.nextInt();
        int res = (int) Math.pow(numberA, numberB) ;
        System.out.println(res);
    }
}
