package Console.POO;

import java.util.Random;


public class Die {


// Parâmetros
    private static int sides;


// Método de randomização
    Random rollDice = new Random();


// Método construtor do objeto
    Die (int sides) {
        Die.sides = sides;
    }


// Método de rolagem de dados
    void rollDice () {
        int resultado = (rollDice.nextInt(Die.sides)) + 1;
        System.out.println("-- O resultado da rolagem foi: --\n" + resultado);
    }

}