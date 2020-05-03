package app;

import java.util.Scanner;

public class Jokenpo {

    public static User user = new User();
    public static Computer computer = new Computer();

    /*
     * Stone (0) wins, scissor (1) lose 
     * Scissor (1) wins, paper (2) lose
     * Paper (2) wins, stone lose (0)
    */

    public static String PlayJokenpo() {
        Scanner scanner = new Scanner(System.in);
        char userPlayAgain;

        do {
            System.out.println("Starting game!!\n 0 - Stone\n 1 - Scissors\n 2 - Paper");

            System.out.print("Your choice: ");
            int choiceUser = scanner.nextInt();

            int choiceComputer = computer.GenerateRandomNumber();
            System.out.println("Computer choice: " + choiceComputer);

            switch (choiceUser)
            {
                // Stone
                case 0:
                    if (choiceComputer == 1) {
                        System.out.println(user.GetName() + " win. Stone wins!");
                        user.CounterVictories();
                    } else if (choiceComputer == 2) {
                        System.out.println("Computer win. Paper wins! Stone lose!");
                        computer.CounterVictories();
                    } else
                        System.out.println("Tie. Nobody wins!");
                    break;

                // Scissor
                case 1:
                    if (choiceComputer == 0) {
                        System.out.println("Computer win. Stone wins! Scissor lose!");
                        computer.CounterVictories();
                    } else if (choiceComputer == 2) {
                        System.out.println(user.GetName() + " win. Scissor wins!");
                        user.CounterVictories();
                    } else
                        System.out.println("Tie. Nobody wins!");
                    break;

                // Paper
                case 2:
                    if (choiceComputer == 0) {
                        System.out.printf(user.GetName() + " win. Paper wins!");
                        user.CounterVictories();
                    } else if (choiceComputer == 1) {
                        System.out.println("Computer win. Scissor wins! Paper lose!");
                        computer.CounterVictories();
                    } else
                        System.out.println("Tie. Nobody wins!");
                    break;

                default:
                    System.out.println("No option choosed. No has winner!");
                    break;
            }

            System.out.println("Do you want play again? Y/N");
            userPlayAgain = scanner.next().charAt(0);

        } while (userPlayAgain == 'Y' || userPlayAgain == 'y');

        scanner.close();

        return "";
    }
}
