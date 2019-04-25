package Lesson3.dequeue;

public interface Dequeue<E> {
    void insertFront(E value);
    void insertRear(E value);

    E deleteFront();
    E deleteRear();

    E getFront();
    E getRear();

    boolean isEmpty();
    boolean isFull();

    int getSize();
}
