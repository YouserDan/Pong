import java.util.Scanner;

public class zadacha1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        int firstNumber = scan.nextInt();
        
        for(int i = 1; i <= firstNumber; i++){
            
            if(i % 2 == 0) {
                
                System.out.println(i);
            }
            
        }
    }
}