

public class Launcher {



    public static void main(String[] args) {
        Box<Apple> box4Apples  = new Box<>();
        Box<Apple> anotherbox4Apples  = new Box<>();
        Box<Orange> box4Oranges  = new Box<>();

        Apple ap1 = new Apple();
        Apple ap2 = new Apple();
        Apple ap3 = new Apple();

        Orange or1 = new Orange();
        Orange or2 = new Orange();

        box4Apples.addFruit(ap1);
        box4Apples.addFruit(ap2);
        box4Apples.addFruit(ap3);

        box4Oranges.addFruit(or1);
        box4Oranges.addFruit(or2);

        box4Apples.replace(anotherbox4Apples);

        System.out.println(anotherbox4Apples.compare(box4Oranges));

    }
}
