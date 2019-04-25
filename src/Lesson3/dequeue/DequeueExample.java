package Lesson3.dequeue;

public class DequeueExample {
    public static void main(String[] args) {
        Dequeue<Integer> dequeue = new DequeueImp<>(3);

        insertFrontIfNotFull(dequeue, 1);
        insertFrontIfNotFull(dequeue, 2);
        insertFrontIfNotFull(dequeue, 3);
        insertFrontIfNotFull(dequeue, 4);

        deleteRearIfNotEmpty(dequeue);
        deleteRearIfNotEmpty(dequeue);
        deleteRearIfNotEmpty(dequeue);
        deleteRearIfNotEmpty(dequeue);
        deleteRearIfNotEmpty(dequeue);
        deleteRearIfNotEmpty(dequeue);
        deleteRearIfNotEmpty(dequeue);
    }

    private static void deleteFrontIfNotEmpty(Dequeue<Integer> dequeue) {
        if (!dequeue.isEmpty()) {
            System.out.println(dequeue.deleteFront());
        }
    }

    private static void deleteRearIfNotEmpty(Dequeue<Integer> dequeue) {
        if (!dequeue.isEmpty()) {
            System.out.println(dequeue.deleteRear());
        }
    }

    private static void insertFrontIfNotFull(Dequeue<Integer> dequeue, int value) {
        if (!dequeue.isFull()) {
            dequeue.insertFront(value);
        }
    }

    private static void insertRearIfNotFull(Dequeue<Integer> dequeue, int value) {
        if ( !dequeue.isFull() ) {
            dequeue.insertRear(value);
        }
    }
}