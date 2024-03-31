import java.util.Scanner;

public class rockPaperScissors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Игра Rock Paper Scissors. Напишите по очереди ваши ходы (rock, paper, scissors):");
        System.out.println("Хотд первого: ");
        String player1 = scan.nextLine();
        System.out.println("Хотд второго: ");
        String player2 = scan.nextLine();

        if (player1 == "rock" && player2 == "rock") {
            System.out.println("Draw!");
        } else if (player1 == "rock" && player2 == "paper") {
            System.out.println("Player 2 won!");
        } else if (player1 == "rock" && player2 == "scissors") {
            System.out.println("Player 1 won!");
        } else if (player1 == "paper" && player2 == "rock") {
            System.out.println("Player 1 won!");
        } else if (player1 == "scissors" && player2 == "rock") {
            System.out.println("Player 2 won!");
        } else if (player1 == "paper" && player2 == "paper") {
            System.out.println("Draw!");
        } else if (player1 == "scissors" && player2 == "scissors") {
            System.out.println("Draw!");
        }

    }
}
