public class Main {
    public static void main(String[] args) {
        System.out.println("1 - Capsule vers un autre monde");
        AverageManager avgManager = new AverageManager();
        avgManager.nombres.add(20);
        avgManager.nombres.add(42);
        avgManager.nombres.add(10);
        avgManager.displayAverage();
    }
}