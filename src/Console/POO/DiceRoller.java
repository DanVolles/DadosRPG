package Console.POO;

import java.util.Scanner;

public class DiceRoller {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        // Construção dos objetos
        Die d4 = new Die(4);
        Die d6 = new Die(6);
        Die d8 = new Die(8);
        Die d10 = new Die(10);
        Die d12 = new Die(12);
        Die d20 = new Die(20);
        Die d100 = new Die(100);

        // Solicitação para rolar dados no console
        String rolagem = "";
        while (!rolagem.equalsIgnoreCase("x")) {
            System.out.println("-- Digite qual dado você gostaria de rolar! --\n" +
                    "4) D4,\n" +
                    "6) D6,\n" +
                    "8) D8,\n" +
                    "10) D10,\n" +
                    "12) D12,\n" +
                    "20) D20,\n" +
                    "100) D100,\n" +
                    "x) Sair.");

            rolagem = input.next();
                switch (rolagem) {
                    case "4" -> d4.rollDice();
                    case "6" -> d6.rollDice();
                    case "8" -> d8.rollDice();
                    case "10" -> d10.rollDice();
                    case "12" -> d12.rollDice();
                    case "20" -> d20.rollDice();
                    case "100" -> d100.rollDice();
                }
        }
    }
}
