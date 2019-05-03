package Lesson4.linkedlist;

import java.util.Iterator;

public interface Entry <T> extends Iterator<T> {
    T getValue();

    Entry<T> getNext();

    void setNext(Entry<T> nextElement);
}
