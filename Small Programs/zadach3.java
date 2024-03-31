import java.util.Scanner;
public class zadach3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите 3 координаты первой точки");
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        int z1 = scan.nextInt();
        System.out.println("Введите 3 координаты второй точки");
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();
        int z2 = scan.nextInt();

        float res = (float) Math.sqrt((Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) + Math.pow(z2 - z1, 2))); 
        System.out.println("Расстояние между точками = " + res);
    }
}
