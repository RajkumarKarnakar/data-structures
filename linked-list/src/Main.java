public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.insert("Rajkumar");
//        list.insertFirst("Karnakar");
        System.out.println(list.find("Rajkumar"));
        list.remove("Rajkumar");
        System.out.println(list.printList());


    }
}