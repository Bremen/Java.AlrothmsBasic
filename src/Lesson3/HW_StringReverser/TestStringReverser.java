package Lesson3.HW_StringReverser;

public class TestStringReverser {
    public static void main(String[] args) {
        String input = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        System.out.println("InitialString: " + input);
        System.out.println("ReverseString: " + StringReverser.reverse(input));
    }
}
