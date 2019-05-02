package Lesson4;

public interface Entry <T>{
    T getValue();

    Entry<T> getNext();

    void setNext(Entry<T> nextElement);
}
