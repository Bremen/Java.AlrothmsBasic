package Lesson3.dequeue;

import Lesson3.queue.QueueImpl;
import Lesson3.queue.QueueOverloadException;

public class DequeueImp<E> extends QueueImpl<E> implements Dequeue<E> {
    public DequeueImp(int maxSize) {
        super(maxSize);
    }

    @Override
    public void insertFront(E value) {
        if (isFull()) {
            throw QueueOverloadException.queueIsFull();
        }

        if (front == DEFAULT_FRONT) {
            front = data.length;
        }
        data[--front] = value;
        size++;
    }

    @Override
    public void insertRear(E value) {
        super.insert(value);
    }

    @Override
    public E deleteFront() {
        return super.remove();
    }

    @Override
    public E deleteRear() {
        if (isEmpty()) {
            throw QueueOverloadException.queueIsEmpty();
        }

        if (rear == DEFAULT_REAR) {
            rear = data.length - 1;
        }
        E removedValue = data[rear--];
        size--;
        return removedValue;
    }

    @Override
    public E getFront() {
        if (isEmpty()) {
            throw QueueOverloadException.queueIsEmpty();
        }
        return super.peek();
    }

    @Override
    public E getRear() {
        if (isEmpty()) {
            throw QueueOverloadException.queueIsEmpty();
        }
        return data[rear];
    }
}
