import java.util.Random;
import java.util.Scanner;

public class DadosRPG {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Olá! Seja bem vindo ao programa de rolagem de dados!\n" +
                "Aqui nós poderemos rolar os dados de 4, 6, 8, 10, 12, 20 e 100 faces!");

        String die = "";
        while (!die.equals("x")) {

            System.out.println("Por favor, escolha o dado: ");
            System.out.println("d4\nd6\nd8\nd10\nd12\nd20\nd100");
            die = input.next();

                switch (die) {
                    case "d4" -> fourSidedDie();
                    case "d6" -> sixSidedDie();
                    case "d8" -> eightSidedDie();
                    case "d10" -> tenSidedDie();
                    case "d12" -> twelveSidedDie();
                    case "d20" -> twentySidedDie();
                    case "d100" -> oneHundredSidedDie();
                    }
        }
    }


    static void fourSidedDie () {

        Random rollDice = new Random();
        int roll = rollDice.nextInt(4) + 1;
        System.out.println("O resultado da rolagem foi " + roll);
    }

    static void sixSidedDie () {

        Random rollDice = new Random();
        int roll = rollDice.nextInt(6) + 1;
        System.out.println("O resultado da rolagem foi " + roll);
    }

    static void eightSidedDie () {

        Random rollDice = new Random();
        int roll = rollDice.nextInt(8) + 1;
        System.out.println("O resultado da rolagem foi " + roll);
    }

    static void tenSidedDie () {

        Random rollDice = new Random();
        int roll = rollDice.nextInt(10) + 1;
        System.out.println("O resultado da rolagem foi " + roll);
    }

    static void twelveSidedDie () {

        Random rollDice = new Random();
        int roll = rollDice.nextInt(12) + 1;
        System.out.println("O resultado da rolagem foi " + roll);
    }

    static void twentySidedDie () {

        Random rollDice = new Random();
        int roll = rollDice.nextInt(20) + 1;
        System.out.println("O resultado da rolagem foi " + roll);
    }

    static void oneHundredSidedDie () {

        Random rollDice = new Random();
        int roll = rollDice.nextInt(100) + 1;
        System.out.println("O resultado da rolagem foi " + roll);
    }
}
