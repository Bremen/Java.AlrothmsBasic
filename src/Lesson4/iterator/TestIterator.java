package Lesson4.iterator;

import Lesson4.linkedlist.Entry;
import Lesson4.linkedlist.LinkedList;
import Lesson4.linkedlist.SimpleLinkedListImpl;

import java.util.Iterator;
import java.util.List;

public class TestIterator {

    public static void main(String[] args) {
        int[] intArray = {1, 2, 3};

//        for (int i = 0; i < intArray.length; i++) {
//            System.out.println(intArray[i]);
//        }

        for (Integer value : intArray) {
            System.out.println(value);
        }


        System.out.println("------");

        List<Integer> arraList = List.of(1, 2, 3);
//        for (int i = 0; i < arraList.size(); i++) {
//            System.out.println(arraList.get(i));
//        }

        for (Integer value : arraList) {
            System.out.println(value);
        }

        System.out.println("------");

        java.util.LinkedList<Integer> linkedListJdk = new java.util.LinkedList<>();
        linkedListJdk.add(1);
        linkedListJdk.add(2);
        linkedListJdk.add(3);

        for (Integer value : linkedListJdk) {
            System.out.println(value);
        }

        Iterator<Integer> iterator = linkedListJdk.iterator();
        while ( iterator.hasNext() ) {
            Integer next = iterator.next();
            System.out.println(next);
        }


        System.out.println("------");

        LinkedList<Integer> linkedList = new SimpleLinkedListImpl<>();
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insert(4);
        linkedList.insert(5);
        linkedList.insert(6);

        Entry<Integer> current = linkedList.getFirst();
        while ( current != null ) {
            System.out.println(current);
            current = current.getNext();
        }

//        for (Integer value : linkedList) {
//            System.out.println(value);
//        }


        System.out.println("1:----------------------------");


        Iterator<Integer> iterator_my = linkedList.iterator();
        while ( iterator_my.hasNext() ) {
            Integer next = iterator_my.next();
            System.out.println(next);
        }

        System.out.println("2:----------------------------");

        iterator_my = linkedList.iterator();
        while ( iterator_my.hasNext() ) {
            Integer next = iterator_my.next();
            System.out.println(next);
        }
    }
}