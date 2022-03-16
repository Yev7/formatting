public class formatting {
    public static void main(String[] args) {

        String productName = "Mug";
        int qty = 20;
        float price = 5.0f;
        float total = qty * price;
        String s = String.format("%-15s %5s %10s %15s\n" , "Item", "Qty", "Price", "Total");
        String s1 = String.format("%-15s %5s %10s %15s\n", "----", "---", "-----", "-----");
        String output = s + s1;
        System.out.println(output);
        String line = String.format("%-15s %5d %10.2f %15.2f", productName, qty, price, total);
        System.out.println(line);





    }
}