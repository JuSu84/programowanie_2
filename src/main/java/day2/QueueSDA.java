package day2;

public class QueueSDA <T>{



    private final int capacity;
    private final T[] kolejka;
    private int tail;
    private int head;
    private int size;

    public QueueSDA(int capacity) {
        this.kolejka = (T[]) new Object[capacity];
        this.capacity = capacity;
        this.size = 0;
        this.head = 0;
        this.tail = 0;
    }

    public int getMaxSize() {
        return capacity;
    }


    public void push(T x) {

        if (isFull()) {
            throw new QueueIsFullException();
        }

        this.kolejka[this.head] = x;
        this.head = (this.head + 1) % this.capacity;
        this.size++;
    }

    public boolean isFull() {
        return this.capacity == this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int getSize() {
        return size;
    }

    public T pop() {

        if (isEmpty()) {
            throw new NoItemsInQueueException();
        }
        T returnedObject = this.kolejka[this.tail];
        this.kolejka[this.tail] = null;
        this.tail = (this.tail + 1) % this.capacity;
        this.size--;
        return returnedObject;
    }

    public T peek() {
        return this.kolejka[this.tail];
    }

    public String print() {
        String elements = "[ ";
        for (int i = this.tail; i < this.size; i++) {
            elements += this.kolejka[i];
            if (i + 1 != this.size)
                elements += ", ";
            }

        elements += " ]";
        return String.format("size: %d, elements: %s", this.size, elements);
    }
}

