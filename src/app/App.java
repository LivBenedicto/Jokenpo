package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // initializer
        Scanner scanner = new Scanner(System.in);

        System.out.println("How to play:\n Enter with your choose\n" +
                " Computer choose are random\n Get the result" +
                "\n You can play how many times you want!!");

        System.out.print("Name player: ");
        String name = scanner.nextLine();
        Jokenpo.user.setName(name);

        Jokenpo.PlayJokenpo();
        System.out.println(Jokenpo.user.Historic());
        System.out.println(Jokenpo.computer.Historic());
        System.out.println("Thanks for playing with us! See u!");

        scanner.close();
    }
}