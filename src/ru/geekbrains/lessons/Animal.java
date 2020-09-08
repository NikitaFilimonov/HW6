package ru.geekbrains.lessons;

public class Animal {
    protected String name;
    protected String color;
    protected int age;

    public int runObstacleLength;
    public int swimObstacleLength;


    public void run(int runObstacleLength) {
        System.out.printf("%s run!\n", name);

    }


    public void swim(int swimObstacleLength) {
        System.out.printf("%s swim!\n", name);

    }
}
