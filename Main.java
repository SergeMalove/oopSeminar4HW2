package oopSeminar4HW2;

public class Main {
    public static void main(String[] args) {
        Box<Fruit> fruitBox = getFruitBox();
        printBox(fruitBox);
    }

    static Box<Fruit> getFruitBox() {
        Box<Fruit> fruitBox = new Box<>();
        fruitBox.put(new Apple());
        fruitBox.put(new Orange());
        fruitBox.put(new Apple());
        return fruitBox;
    }

    static void printBox(Box<? extends Fruit> box) {
        Fruit item = box.get();
        System.out.println("Содержимое коробки: " + item.toString());
    }
}
