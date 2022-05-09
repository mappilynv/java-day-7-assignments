import java.util.ArrayList;
import java.util.Scanner;

public class FifthItem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> itemList = new ArrayList<>();
        System.out.println("Please enter at least 5 words. Enter no word to quit.");
        while (true){
            String input = scanner.nextLine();
            itemList.add(input);
            if(input.isEmpty()) {
                break;
            }
        }
        System.out.println("The fifth item in the list is: " + itemList.get(4));
    }
}
