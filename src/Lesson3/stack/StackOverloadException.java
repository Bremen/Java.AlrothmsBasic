package Lesson3.stack;

public class StackOverloadException extends IndexOutOfBoundsException {

    public StackOverloadException() {
        super("Invalid index for stack");
    }
}