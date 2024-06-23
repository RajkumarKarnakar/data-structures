public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        try {
            stack.push(10);
            stack.push(11);
            stack.push(12);
            stack.push(13);
            stack.push(14);
            stack.push(15);
            stack.push(16);
            stack.push(17);
            stack.push(18);
            stack.push(19);
            stack.push(20);
            stack.pop();
            System.out.println(stack.peek());
            stack.pop();
            System.out.println(stack.peek());
            stack.print();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            ;
        }
    }
}