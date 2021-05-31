import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stack<E> {

    private final E[] data;
    private int size;

    public Stack(int maxSize) {
        this.data = (E[]) new Object[maxSize];
    }

    public void push(Character value) {
        data[size++] = (E) value;
    }

    public E pop() {
        E value = peek();
        data[--size] = null;
        return value;
    }

    public E peek() {
        return data[size - 1];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == data.length;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(data[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }

        sb.append("]");
        return sb.toString();
    }

    public void display() {
        System.out.println(this);
    }

    public static void main(String[] args) throws IOException {
        Stack<Character> stack = new Stack<Character>(100);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        for (int i = stack.size; i > 0; i--) {
            System.out.print(stack.pop());
        }
    }
}