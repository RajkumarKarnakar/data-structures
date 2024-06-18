import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        boolean start = true;
        int option = 0;
        String input = "";
        Scanner sc = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>(); // Use Java's built-in LinkedList
        while (start) {

            System.out.println("Choose the option \n1. Add\n2. Add at front\n3. Remove\n4. Find\n5. Print all\ncurrent data elements are: " + list.size());
            option = sc.nextInt();
            sc.nextLine(); // Consume the newline character
            switch (option) {
                case 1:
                    System.out.println("Enter element to add:");
                    input = sc.nextLine();
                    list.insert(input); // Use insert method
                    System.out.println("Done");
                    break;
                case 2:
                    System.out.println("Enter element to add at front:");
                    input = sc.nextLine();
                    list.insertFirst(input); // Use insertFirst method
                    System.out.println("Done");
                    break;
                case 3:
                    System.out.println("Enter element to remove:");
                    input = sc.nextLine();
                    System.out.println(list.remove(input) ? "Removed" : "Not available"); // Use remove method
                    break;
                case 4:
                    System.out.println("Enter element to find:");
                    input = sc.nextLine();
                    System.out.println(list.find(input)); //use find method
                    break;
                case 5:
                    System.out.println(list.printList());
                    break;
                case 9:
                    System.out.println("Exited");
                    start = false;
                    break;
                default:
                    System.out.println("Wrong input");
                    break;

            }
        }
        sc.close(); // Close the scanner
    }
}
