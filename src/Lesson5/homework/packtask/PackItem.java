package Lesson5.homework.packtask;

public class PackItem {
    String name;
    Integer price;
    Integer weight;

    public PackItem(String name, Integer weight, Integer price) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "[" + name + " " + weight + " " + price + "]";
    }
}
