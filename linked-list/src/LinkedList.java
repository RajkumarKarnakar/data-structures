public class LinkedList<T> {
    private Node<T> head;
    private int size = 0;

    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }

        @Override
        public String toString() {
            return "{" + "data: " + data + '}';
        }
    }

    public int size() {
        return size;
    }

    public void insert(T data) {
        Node<T> node = new Node<>(data);
        size++;
        if (head == null) {
            head = node;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
    }

    public String printList() {
        Node<T> current = head;
        StringBuilder result = new StringBuilder("{ ");
        while (current != null) {
            result.append(current.toString());
            current = current.next;
        }
        result.append(" }");
        return result.toString();

    }

    public void insertFirst(T data) {
        Node<T> node = new Node<>(data);
        size++;
        node.next = head;
        head = node;
    }

    public boolean remove(T data) {
        //implement this method

        if (head.data == data) {
            head = head.next;
        }
        Node<T> current = head;
        Node<T> prev = head;
        while (current != null) {
            if (current.data == data) {
                prev.next = current.next;
                size--;
                return true;
            }
            prev = current;
            current = current.next;
        }
        return false;
    }

    public Node<T> find(T data) {
        Node<T> current = head;
        while (current != null) {
            if (current.data == data) {
                return current;
            }
            current = current.next;
        }
        return null;
    }
}