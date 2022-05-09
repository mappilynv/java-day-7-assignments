import java.util.Scanner;
import java.util.ArrayList;

public class SumOfList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> itemList = new ArrayList<>();
        System.out.println("Please enter numbers. Enter 0 to quit.");
        while (true){
            int input = Integer.valueOf(scanner.nextLine());
            if(input == 0) {
                break;
            } else {
                itemList.add(input);
            }
        }
        System.out.println("Done entering integers into the list");
        System.out.println(itemList+ " were the items in the list.");
        System.out.println("The sum of that list is: "+sumMethod(itemList));
        indexOf(itemList);
    }

    public static int sumMethod(ArrayList<Integer> itemList) {
        int sum = 0;
        for(int i=0; i <= itemList.size(); i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static void indexOf(ArrayList<Integer> itemList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What number are you looking for in the list?");
        int userInput = Integer.valueOf(scanner.nextLine());
        for (int i=0; i < itemList.size(); i++) {
            int value = itemList.get(i);
            if (userInput == value) {
                System.out.println(userInput+ " is at index "+ i);
            }
        }

    }
}
