import java.util.Scanner;


class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Калькулятор ");
        System.out.println("Введите первое число: ");
        Scanner scan = new Scanner(System.in);
        int user_input_number_1 = scan.nextInt();
        System.out.println("Введите операцию: ");
        String operation = scan.next();
        System.out.println("Введите второе число: ");
        int user_input_number_2 = scan.nextInt();
        
        if (operation.equals("+")){
            int result = user_input_number_1 + user_input_number_2;
            System.out.println("Результат: "+ user_input_number_1 + " " + operation + " " + user_input_number_2 + " " + '=' + " " + result);
            
        }
        else if (operation.equals("-")){
            int result = user_input_number_1 - user_input_number_2;
            System.out.println("Результат: "+ user_input_number_1 + " " + operation + " " + user_input_number_2 + " " + '=' + " " + result);
        }
        
    }
}