public class Deque<E> {

    private static final int HEAD_DEFAULT = 0;
    private static final int TAIL_DEFAULT = -1;

    private final E[] data;
    private int size;

    private int tail;
    private int head;

    public Deque(int maxSize) {
        this.data = (E[]) new Object[maxSize];
        size = 0;
        this.head = HEAD_DEFAULT;
        this.tail = TAIL_DEFAULT;
    }

    public boolean insertLeft(E value) {
        if (isFull()) {
            return false;
        }

        if (head == HEAD_DEFAULT) {
            head = data.length;
        }

        data[--head] = value;
        size++;

        return true;
    }

    //
    public boolean insertRight(E value) {
        if (isFull()) {
            return false;
        }

        if (tail == data.length - 1) {
            tail = TAIL_DEFAULT;
        }

        data[++tail] = value;
        size++;

        return true;
    }

    //
    public E removeLeft() {
        if (isEmpty()) {
            return null;
        }

        if (head == data.length) {
            head = HEAD_DEFAULT;
        }

        E value = data[head++];
        size--;

        return value;
    }

    public E removeRight() {
        if (isEmpty()) {
            return null;
        }
        if (tail == TAIL_DEFAULT)
            tail = data.length - 1;

        size--;
        return data[tail--];
    }

    public E peekFront() {
        return data[head];
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
}
