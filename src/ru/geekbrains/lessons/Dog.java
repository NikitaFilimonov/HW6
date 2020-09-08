package ru.geekbrains.lessons;

public class Dog extends Animal{
    public Dog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    @Override
    public void run(int runObstacleLength) {
        if (runObstacleLength <= 500) {
            System.out.printf("%s пробежал %d метров!\n", name, runObstacleLength);
        } else {
            System.out.printf("%s может пробежать только 500 метров!\n", name);
        }
    }

    @Override
    public void swim(int swimObstacleLength) {
        if (swimObstacleLength <= 10) {
            System.out.printf("%s проплыл %d метров!\n", name, swimObstacleLength);
        } else {
            System.out.printf("%s может проплыть только 10 метров!\n", name);
        }
    }
}
