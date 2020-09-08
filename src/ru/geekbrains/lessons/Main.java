package ru.geekbrains.lessons;


public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", "black", 10);
        Cat cat2 = new Cat("Tom", "grey", 7);
        Dog dog1 = new Dog("Bobik", "orange", 12);
        Dog dog2 = new Dog("Sharik", "white", 3);

        cat1.run(150);
        cat1.swim(10);

        cat2.run(215);
        cat2.swim(2);

        dog1.run(480);
        dog1.swim(7);

        dog2.run(520);
        dog2.swim(15);

    }


}
