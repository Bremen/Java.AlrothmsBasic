package Lesson5.homework;

/***
 * Класс для возведения числа в целую степень
 */

class Exponentiation {
    /**
     *
     * @param number - число для возведения в степень
     * @param exponent - показатель степени
     * @return - результат возведения числа в степень
     */
    static double power(double number, int exponent) {
        switch (exponent) {
            case 0:
                return 1;
            case 1:
                return number;
            default:
                if (exponent > 0) {
                    return number * power(number, --exponent);
                }
                else {
                    return 1.0/number * power(number, ++exponent);
                }
        }
    }

    public static void main(String[] args) {
        printExponentiation(2, 3);
        printExponentiation(2, -3);
        printExponentiation(0, 0);
        printExponentiation(1, 10);
        printExponentiation(10, -2);
    }

    private static void printExponentiation(double number, int exponent) {
        System.out.println("number: " + number + " exponent: " + exponent + " result: " + power(number, exponent));
    }
}