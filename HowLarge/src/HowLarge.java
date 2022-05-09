import java.util.Scanner;
import java.util.ArrayList;

public class HowLarge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> itemList = new ArrayList<>();
        System.out.println("Please enter any words. Enter no word to quit.");
        while (true){
            String input = scanner.nextLine();
            if(input.isEmpty()) {
                break;
            } else {
                itemList.add(input);
            }
        }
        System.out.println("The total amount of items in the list was: " + itemList.size());
    }
}
