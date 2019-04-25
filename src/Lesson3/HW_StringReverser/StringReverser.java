/**
 * 2. Создать программу, которая переворачивает вводимые строки (читает справа налево).
 */
package Lesson3.HW_StringReverser;

import Lesson3.stack.Stack;
import Lesson3.stack.StackImpl;

public class StringReverser {
    private static Stack<Character> data;

    static String reverse(String input) {
        data = new StackImpl<>(input.length());
        for (int i = 0; i < input.length(); i++) {
            data.push(input.charAt(i));
        }

        StringBuilder reverseString = new StringBuilder(data.getSize());
        while (!data.isEmpty()){
            reverseString.append(data.pop());
        }

        return reverseString.toString();
    }
}
