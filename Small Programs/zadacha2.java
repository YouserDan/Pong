import java.util.Scanner;
public class zadacha2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        int firstNumber = scan.nextInt();
        String str = Integer.toString(firstNumber);
        int leng = str.length();

        if( leng < 3){
            System.out.println("Третьего символа нет");
            
        }
        else{
            char res = str.charAt(2);
            System.out.println(res);
        }
        
    }
}
