/*
    tower of hanoi
 */
public class Main3 {
    public static void main(String[] args) {
        System.out.println("Tower of Hanoi");
        move(10, 'A', 'C', 'B');
    }

    static void move(int noOfDisc, char from, char to, char inter) {
        if (noOfDisc == 1) System.out.println("Moving disc " + noOfDisc + " from " + from + " to " + to);
        else {
            move(noOfDisc - 1, from, inter, to);
            System.out.println("Moving disc " + noOfDisc + " from " + from + " to " + to);
            move(noOfDisc - 1, inter, to, from);
        }
    }
}
