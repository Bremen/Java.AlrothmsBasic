package Lesson2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class SimpleSorts {
    private static final Integer CAPACITY = 1_000_0;
    private static final Random rnd = new Random();

    public static void main(String[] args) {
//        1. Создать массив большого размера (миллион элементов).
        ArrayList<Integer> initArray = new ArrayList<>(CAPACITY);

//        3. Заполнить массив случайными числами.
        long start = System.currentTimeMillis();
        for (int i = 0; i < CAPACITY; i++) {
            initArray.add(rnd.nextInt(CAPACITY));
        }
        long time = System.currentTimeMillis() - start;
        System.out.println("FillingInitArray, millis: " + time);

        ArrayList<Integer> array = new ArrayList<>(initArray);
//        4. Написать методы, реализующие рассмотренные виды сортировок, и проверить скорость выполнения каждой.
        start = System.currentTimeMillis();
        bubbleSort(array);
        time = System.currentTimeMillis() - start;
        System.out.println("BubbleSort time, millis: " + time);

        array = new ArrayList<>(initArray);
        start = System.currentTimeMillis();
        selectSort(array);
        time = System.currentTimeMillis() - start;
        System.out.println("SelectSort time, millis: " + time);

        array = new ArrayList<>(initArray);
        start = System.currentTimeMillis();
        insertSort(array);
        time = System.currentTimeMillis() - start;
        System.out.println("InsertSort time, millis: " + time);

//        System.out.println(Arrays.toString(array.toArray()));

        //    2. Написать методы удаления, добавления, поиска элемента массива.
        int index = 10;
        int element = 88;
        array = new ArrayList<>(initArray.subList(0, 20));
        System.out.println(Arrays.toString(array.toArray()));

        addElement(array, element, index); //Добавление

        System.out.println(Arrays.toString(array.toArray()));

        index = findElement(array, element); //Линейный поиск
        deleteElement(array, index); //удаление

        System.out.println(Arrays.toString(array.toArray()));
    }

    private static int findElement(ArrayList<Integer> array, int element) {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) == element) {
                return i;
            }
        }

        return -1;
    }

    private static void addElement(ArrayList<Integer> array, int element, int index) {
        array.add(0);
        for (int i = array.size() - 1; i > index; i--) {
            array.set(i, array.get(i-1));
        }
        array.set(index, element);
    }

    private static void deleteElement(ArrayList<Integer> array, int index) {
        for (int i = index; i < array.size() - 1; i++) {
            array.set(index, array.get(index+1));
        }
        array.remove(array.size() - 1);
    }

    private static void insertSort(ArrayList<Integer> arrayForSort) {
        for (int i = 0; i < arrayForSort.size(); i++) {
            int temp = arrayForSort.get(i);

            int in = i;
            while (in > 0 && arrayForSort.get(in-1) > temp) {
                arrayForSort.set(in, arrayForSort.get(in-1));
                in--;
            }

            arrayForSort.set(in, temp);
        }
    }

    private static void selectSort(ArrayList<Integer> arrayForSort) {
        for (int i = 0; i < arrayForSort.size(); i++) {
            int indexMin = i;
            for (int j = i+1; j < arrayForSort.size(); j++) {
                if (arrayForSort.get(indexMin) > arrayForSort.get(j)) {
                    indexMin = j;
                }
            }
            if (i != indexMin) {
                swap(arrayForSort, i, indexMin);
            }
        }
    }

    private static void bubbleSort(ArrayList<Integer> arrayForSort) {
        for (int i = 0; i < arrayForSort.size() - 1; i++) {
            for (int j = 0; j < arrayForSort.size() - 1 - i; j++) {
                if (arrayForSort.get(j) > arrayForSort.get(j+1)) {
                    swap(arrayForSort, j, j+1);
                }
            }
        }
    }

    private static void swap(ArrayList<Integer> array, int j, int i) {
        int temp = array.get(i);
        array.set(i, array.get(j));
        array.set(j, temp);
    }


}