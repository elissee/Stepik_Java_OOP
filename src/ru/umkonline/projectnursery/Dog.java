package ru.umkonline.projectnursery;

public class Dog {

    // поля класса
    String breed;
    String size;
    int age;
    String color;

    // конструкторы класса
    Dog() {
        this.breed = "unknown";
        this.size = "medium";
        this.age = 0;
    }

    Dog(String breed, String size, int age, String color) {
        this.breed = breed;
        this.size = size;
        this.age = age;
        if(color != null) {
            this.color = color;
        }
    }

    //методы класса
    boolean eat(float weight, String food) {
        // ...
        return true;
    }

    int sleep() {
        // ...
        return 5;
    }

    int sit() {
        // возвращает сколько дней собака находится в питомнике
        // ...
        return 42;
    }

    float run(int task) {
        // выполняем упражнение
        return 0.42f;
    }
}


/*
class ru.umkonline.projectnursery.Dog{

    private String breed;
    private String size;
    private int age;
    private float weight = 5.0f;

    ru.umkonline.projectnursery.Dog(String breed, String size, int age){
        this.breed = breed;
        this.size = size;
        this.age = age;
    }

    ru.umkonline.projectnursery.Dog(String breed, String size, int age, float weight){
        this.breed = breed;
        this.size = size;
        this.age = age;
        this.weight = weight;
    }

    void getInfo(){
        System.out.println("breed:" + breed + ", " + "size:" + size + ", " + "age:" + age);
    }

    int eat(int carbohydrates, int proteins, int fats){
        int calories = carbohydrates * 4 + proteins * 4 + fats * 9;
        return calories;
    }

    String checkCalories(int calories) {
        float norma = (535 / 10) * weight;
        String estimation = null;
        if ((norma - calories) <= 30 && (norma - calories) >= -30) {
            estimation = "good";
        } else if ((norma - calories) > 30) {
            estimation = "bad";
        } else if ((norma - calories) < -30) {
            estimation = "overate";
        }
        return estimation;
    }
}*/
