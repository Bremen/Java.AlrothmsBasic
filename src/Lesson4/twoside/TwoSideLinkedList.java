package Lesson4.twoside;

import Lesson4.linkedlist.LinkedList;

public interface TwoSideLinkedList<E> extends LinkedList<E> {

    void insertLeft(E value);
    void insertRight(E value);

    E removeLeft();
}
