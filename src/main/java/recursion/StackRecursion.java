package recursion;

public class StackRecursion {

    int capacity;
    int array[];
    int top = -1;

    public StackRecursion(int capacity) {
        this.capacity = capacity;
        this.array = new int[capacity];

    }

    public int getHeight() {
        int count = 0;
        for (int i : array) {
            if (i != 0) {
                count++;
            }
        }
        System.out.println("Height: " + count);
        return count;
    }

    public boolean isEmpty() {
        boolean empty = true;
        for (int i : array) {
            if (i > 0) {
                empty = false;
            }
        }
        System.out.println("Is Empty: " + empty);
        return empty;
    }

    public void push(int element) {
        if (top < capacity - 1) {
            top++;
            array[top] = element;
            //printElements();
        } else {
            System.out.println("Stack overflow");
        }
    }

    public void pop() {
        if (top >= 0) {
            array[top] = 0;
            top--;
            //printElements();
        }
    }

    public int head() {
        int head = -1;
        if (top > -1) {
            head = array[top];
        }
        System.out.println("Head: " + head);
        return head;
    }

    public void display() {
        for (int i = getHeight() - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }

    public void printElements() {
        if (top >= -1) {
            System.out.println("Elements in stack: ");
            for (int i : array) {
                System.out.println(i);
            }
        }
    }

}
