package ru.geekbrains.lessons;

public class Cat extends Animal {

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    @Override
    public void run(int runObstacleLength) {
        if (runObstacleLength <= 200) {
            System.out.printf("%s пробежал %d метров!\n", name, runObstacleLength);
        } else {
            System.out.printf("%s может пробежать только 200 метров!\n", name);
        }
    }

    @Override
    public void swim(int swimObstacleLength) {
        System.out.printf("%s не умеет плавать!\n", name);
    }
}
