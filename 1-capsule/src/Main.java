public class Main {
    public static void main(String[] args) {
        System.out.println("1 - Capsule vers un autre monde");
        AverageManager avgManager = new AverageManager();
        avgManager.addNombre(20);
        avgManager.addNombre(42);
        avgManager.addNombre(10);
        avgManager.displayAverage();
    }
}
