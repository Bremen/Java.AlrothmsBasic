package Lesson5.homework.packtask;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MaxPricePackTask {
    private static final int loadСapacity = 5;

    public static void main(String[] args) {
        List<PackItem> items = new LinkedList<>();

        items.add(new PackItem("Книга",   1, 600));
        items.add(new PackItem("Бинокль", 2, 5000));
        items.add(new PackItem("Аптечка", 4, 1500));
        items.add(new PackItem("Ноутбук", 2, 40000));
        items.add(new PackItem("Котелок", 1, 500));

        List<PackItem> bestPackCombination = new LinkedList<>();

        findMaxPricePackCombination(items, bestPackCombination);

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(Arrays.toString(bestPackCombination.toArray())
                + " totalPrice: " + packPrice(bestPackCombination)
                + " totalWeight: " + packWeight(bestPackCombination));
    }

    private static void findMaxPricePackCombination(List<PackItem> items, List<PackItem> bestPackCombination) {
        if (packPrice(items) <= packPrice(bestPackCombination)) {
            return;
        }

        System.out.println(Arrays.toString(items.toArray())
                + " totalPrice: " + packPrice(items)
                + " totalWeight: " + packWeight(items));

        if (ifConditionRepack(items, bestPackCombination)) return;

        for (int i = 0; i < items.size(); i++) {
            if (items.size() > 1) {
                PackItem bufItem = items.remove(i);
                findMaxPricePackCombination(items, bestPackCombination);
                items.add(i,bufItem);
            }
            else {
                ifConditionRepack(items, bestPackCombination);
            }
        }
    }

    private static boolean ifConditionRepack(List<PackItem> items, List<PackItem> bestPackCombination) {
        if (packWeight(items) <= loadСapacity && packPrice(items) > packPrice(bestPackCombination)) {
            bestPackCombination.clear();
            bestPackCombination.addAll(items);

            return true;
        }
        return false;
    }

    private static void enumerateSets(List<PackItem> items) {
        System.out.println(Arrays.toString(items.toArray()));

        for (int i = 0; i < items.size(); i++) {
            PackItem bufItem = items.remove(i);

            if (items.size() > 1) {
                enumerateSets(items);
            }
            else if (items.size() == 1){
                System.out.println(Arrays.toString(items.toArray()));
            }

            items.add(i,bufItem);
        }
    }

    private static int packWeight(List<PackItem> items) {
        int totalWeight = 0;
        for (PackItem item : items) {
            totalWeight += item.weight;
        }

        return totalWeight;
    }

    private static int packPrice(List<PackItem> items) {
        int totalPrice = 0;
        for (PackItem item : items) {
            totalPrice += item.price;
        }

        return totalPrice;
    }
}