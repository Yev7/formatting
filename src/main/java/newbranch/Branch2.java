package newbranch;

import java.util.Scanner;

public class Branch2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("What is your name?");
        String respone = userInput.nextLine();
        System.out.println("What's your lucky number?");
        int luckyNumber = userInput.nextInt();
        System.out.println("Your name is " + respone + " :and your lucky number is " + luckyNumber  );

        String product = "Mug";
        float price = 5.0f;
        int qty = 20;
        float total = price * qty;

        System.out.printf("%-10s%-10s%-10s%-10s\n","Product","Qty","Price","Total");
        System.out.printf("%-10s%-10s%-10s%-10s\n","---","---","-----","-----");
        System.out.printf("%-10s%-10d%-10.2f%-10.2f",product, qty, price, total);
    }
}
