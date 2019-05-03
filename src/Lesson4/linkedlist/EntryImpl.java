package Lesson4.linkedlist;

import java.util.Objects;

public class EntryImpl<T> implements Entry<T> {

    private final T value;
    private Entry<T> next;

    public EntryImpl(T value) {
        this.value = value;
    }

    @Override
    public T getValue() {
        return value;
    }

    @Override
    public Entry<T> getNext() {
        return next;
    }

    @Override
    public void setNext(Entry<T> nextElement) {
        this.next = nextElement;
    }

    @Override
    public String toString() {
        return "EntryImp{value = " + value + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        EntryImpl<?> entry = (EntryImpl<?>) obj;
        return Objects.equals(value, entry.value);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}
