package day2;

public class QueueSDA {

    private final int capacity;
    private final String[] kolejka;
    private int tail;
    private int head;
    private int size;

    public QueueSDA(int capacity) {
        this.kolejka = new String[capacity];
        this.capacity = capacity;
        this.size = 0;
        this.head = 0;
        this.tail = 0;
    }

    public int getMaxSize() {
        return capacity;
    }


    public void push(String x) {

        if(isFull()){
            throw new QueueIsFullException();
        }

        this.kolejka[this.head] = x;
        this.head++;
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

    public String pop() {

        if (isEmpty()) {
            throw new NoItemsInQueueException();
        }
        String returnedObject = this.kolejka[this.tail];
        this.kolejka[this.tail] = null;
        this.tail++;
        this.size--;
        return returnedObject;
    }
}

