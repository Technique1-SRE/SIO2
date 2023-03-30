import java.util.Random;
import java.util.Scanner;

public class PileouFace {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int guess, result;
        String guessStr;

        System.out.println("Bienvenue au jeu du Pile ou Face !");
        System.out.println("Entrer 0 pour prendre pile ou 1 pour prendre Face.");

        result = rand.nextInt(2);

        guessStr = sc.nextLine();

        guess = Integer.parseInt(guessStr);

        if (guess == result) {
            System.out.println("Bravo ! Vous avez devine correctement.");
        } else {
            System.out.println("Desole, vous n'avez pas devine correctement.");
            System.out.println("Le resultat etait " + result + ".");
        }

        sc.close();
    }

}