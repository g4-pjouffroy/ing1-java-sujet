import java.util.ArrayList;
import java.util.List;

public class AverageManager {

    private final List<Integer> nombres;

    public AverageManager() {
        this.nombres = new ArrayList<>();
    }

    public void addNombre(int nombre) {
        this.nombres.add(nombre);
    }

    public double calculateAverage() {
        int sum = 0;
        for (Integer i : nombres) {
            sum += i;
        }
        return nombres.isEmpty() ? Double.NaN : (double) sum / nombres.size();
    }

    public void displayAverage() {
        double average = calculateAverage();
        String result = Double.isNaN(average) ? "Impossible, aucun nombre" : String.valueOf(average);
        System.out.println("Résultat : " + result);
    }
}
