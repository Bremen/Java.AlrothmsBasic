package Lesson3.stack;

public interface Stack<E> {

    void push(E value);

    E pop();

    E peek();

    boolean isEmpty();
    boolean isFull();

    int getSize();


}