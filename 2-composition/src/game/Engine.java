package game;

import io.Console;
import io.Keyboard;
import java.util.ArrayList;
import java.util.List;

// ici , Cette classe gère la logique principale de l'application
public class Engine {
    private Console console; // Objet pour afficher des messages
    private Keyboard keyboard; // Objet pour lire les entrées utilisateur
    private List<Integer> numbers; // Liste pour stocker les nombres

    // le Constructeur qui initialise les objets Console, Keyboard et la liste de nombres
    public Engine() {
        this.console = new Console();
        this.keyboard = new Keyboard();
        this.numbers = new ArrayList<>();
    }

    // ici cest la Méthode principale pour démarrer l'application
    public void start() {
        console.print("Entrez le nombre de valeurs à traiter : ");
        int count = keyboard.getInt(); // Lire le nombre de valeurs à entrer

        // cest la Boucle pour lire chaque valeur et l'ajouter à la liste
        for (int i = 0; i < count; i++) {
            console.print("Entrez un nombre : ");
            int number = keyboard.getInt();
            numbers.add(number);
        }

        // il Calcule et afficher la moyenne des nombres
        double average = calculateAverage(numbers);
        console.print("La moyenne des nombres est : " + average);
    }

    // Méthode pour calculer la moyenne d'une liste de nombres
    private double calculateAverage(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        // Retourne NaN si la liste est vide, sinon retourne la moyenne
        return numbers.isEmpty() ? Double.NaN : (double) sum / numbers.size();
    }
}
