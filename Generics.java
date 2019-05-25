import java.util.ArrayList;

public class Generics<H extends Object> {


// Первое задание
    public void changePlaces(H[] arr) {
        H temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }

// Второе задание
    private void arr2ArrListConverter(H[] arr) {
        ArrayList<H> arrList = new ArrayList<>();
        for (H o : arr) {
            arrList.add(o);
        }
    }
}

// Третье задание
abstract class Fruit {
    abstract float getFruitWeight();
}

class Orange extends Fruit {
    public float getFruitWeight() {
        return 1.5f;
    }
}

class Apple extends Fruit {
    public float getFruitWeight() {
        return 1.0f;
    }
}

class Box<T extends Fruit> {

    private ArrayList<T> arrList;


    public Box() {
        arrList = new ArrayList<>();

    }

    public float getWeight() {
        return arrList.size() == 0 ? 0 : arrList.size() * arrList.get(0).getFruitWeight();
    }

    public boolean compare(Box<? extends Fruit> anotherBox) {
        return this.getWeight() == anotherBox.getWeight();
    }


    public void addFruit(T fruit2Add) {
        arrList.add(fruit2Add);
    }

    public void replace(Box<T> anotherBox) {
        anotherBox.arrList.addAll(this.arrList);
        this.arrList.clear();
    }
}



