import java.util.ArrayList;
import java.util.Scanner;

public class LastItem {
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
        System.out.println("The last item in the list is: " + itemList
                .get(itemList.size()-1));

    }
}
