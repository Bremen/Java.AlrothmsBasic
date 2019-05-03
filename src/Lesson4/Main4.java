package Lesson4;

import Lesson4.linkedlist.LinkedList;
import Lesson4.linkedlist.SimpleLinkedListImpl;
import Lesson4.twoside.TwoSideLinkedList;
import Lesson4.twoside.TwoSideLinkedListImpl;

public class Main4 {
    public static void main(String[] args) {
//        testSimpleLinkedList();

        testTwoSideListElement();
    }

    private static void testTwoSideListElement() {
        TwoSideLinkedList<Integer> linkedList = new TwoSideLinkedListImpl<>();

        linkedList.insertLeft(2);
        linkedList.insertLeft(3);
        linkedList.insertLeft(4);
        linkedList.insertLeft(5);
        linkedList.insertRight(1);

        linkedList.display();

        linkedList.remove(3);
        linkedList.remove(33);

        linkedList.display();

        System.out.println("Find 2 - " + linkedList.find(2));
        System.out.println("Find 22 - " + linkedList.find(22));

        linkedList.remove();
        linkedList.remove();

        linkedList.display();
    }

    private static void testSimpleLinkedList() {
        LinkedList<Integer> linkedList = new SimpleLinkedListImpl<>();

        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insert(4);
        linkedList.insert(5);

        linkedList.display();

        linkedList.remove(3);
        linkedList.remove(33);

        linkedList.display();

        System.out.println("Find 2 - " + linkedList.find(2));
        System.out.println("Find 22 - " + linkedList.find(22));

        linkedList.remove();
        linkedList.remove();

        linkedList.display();
    }
}
