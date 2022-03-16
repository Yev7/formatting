public class formatting {
    public static void main(String[] args) {

        String productName = "Mug";
        int qty = 20;
        float price = 5.0f;
        float total = qty * price;
        String s = String.format("%-15s %5s %10s\n", "Item", "Qty", "Price");
        String s1 = String.format("%-15s %5s %10s\n", "----", "---", "-----");
        String output = s + s1;
        System.out.println(output);
        String line = String.format("%-15s %5d %10.2f\n", productName, qty, price);
        System.out.println(line);
        String grandTotal = String.format("%-15s %5s %10.2f\n", "Total", " ", total);
        System.out.println(grandTotal);



    }
}
