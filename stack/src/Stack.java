public class Stack {
    private int[] array;
    private int count;

    public Stack() {
        array = new int[10];
        count = 0;
    }

    public void push(int data) {
        if (count == array.length) {
            // Resize the array
            int[] temp = new int[array.length * 2];
            System.arraycopy(array, 0, temp, 0, count);
            array = temp;
        }
        array[count] = data;
        count++;
    }

    public int pop() throws Exception {
        if (count == 0) {
            throw new Exception("Empty stack");
        }
        count--;
        return array[count];
    }

    public void print() {
        System.out.println("-----STACK-----");
        for (int i = 0; i < count; i++) {
            System.out.println("-> " + array[i]);
        }
        System.out.println("---------------");
    }

    public int peek() throws Exception {
        if (count == 0) {
            throw new Exception("Empty stack");
        }
        return array[count - 1];
    }
}
