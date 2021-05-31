import java.io.IOException;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws IOException {
        Deque deque = new Deque(6);
        System.out.println(deque.insertLeft(1));
        System.out.println(deque.insertLeft(2));
        System.out.println(deque.insertLeft(3));
        System.out.println(deque.insertRight(6));
        System.out.println(deque.insertRight(5));
        System.out.println(deque.insertRight(4));
        System.out.println(deque.insertRight(9));
        System.out.println(deque.removeLeft());
        System.out.println(deque.removeRight());


    }
}
