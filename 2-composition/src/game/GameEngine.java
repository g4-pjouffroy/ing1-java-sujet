
package game;

import io.Console;
import io.Keyboard;
// Classe principale pour gérer la logique du jeu

public class GameEngine {
    private final Keyboard userInput;
    private final Console console;
    private final int targetNumber;
    // ca cest le Constructeur qui initialise les objets et génère le nombre cible

    public GameEngine() {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        this.userInput = new Keyboard();
        this.console = new Console();
        this.targetNumber = randomNumberGenerator.generate(1025);
    }
    // et ca la Méthode pour démarrer le jeu

    public void start() {
        console.print("Bienvenue au jeu de devinette !");
        boolean hasGuessedCorrectly = false;
        // jai mis une Boucle qui va tourner  jusqu'à ce que le joueur devine correctement

        while (!hasGuessedCorrectly) {
            int guess = userInput.getInt();
            // ensuite il vas Comparer le nombre deviné avec le nombre cible

            if (guess < targetNumber) {
                console.print("Le nombre à deviner est plus grand.");
            } else if (guess > targetNumber) {
                console.print("Le nombre à deviner est plus petit.");
            } else {
                console.print("Félicitations ! Vous avez deviné le nombre.");
                hasGuessedCorrectly = true;
            }
        }
    }
}
