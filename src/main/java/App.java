public class App {

    private static int stock = 100;

    public static void addStock(int quantity) {
        stock += quantity;
    }

    public static void removeStock(int quantity) {
        if(quantity > stock) {
            throw new IllegalArgumentException("Insufficient stock!");
        }
        stock -= quantity;
    }

    public static int getStock() {
        return stock;
    }
}