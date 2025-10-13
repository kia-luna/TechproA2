import java.util.Scanner;
import java.util.ArrayList;

public class shopping_list {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> shoppingList = new ArrayList<>();

        System.out.println("Enter up to 5 items you want to buy:");

        // Input up to 5 items
        for (int i = 0; i < 5; i++) {
            System.out.print("> ");
            String item = scanner.nextLine();

            if (item.isEmpty()) { 
                break; // Stops if user just presses Enter
            }
            shoppingList.add(item);
        }

        // Print shopping list
        System.out.println("\nYour shopping list:");
        for (String product : shoppingList) {
            System.out.print(product + " ");
        }

        // Count items
        System.out.println("\n\nYou entered " + shoppingList.size() + " item(s).");

        // Search feature
        System.out.print("\nSearch for an item: ");
        String searchItem = scanner.nextLine();
        
        if (shoppingList.contains(searchItem)) {
            System.out.println("✅ " + searchItem + " is in your shopping list!");
        } else {
            System.out.println("❌ " + searchItem + " is NOT in your shopping list.");
        }

        scanner.close();
    }
}
