package com.company;

public class Parrot {


    private String name;
    private byte weight;
    private int speed;
    private int damage;
    private boolean fly;
    private boolean talk;
    private byte age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getWeight() {
        if (this.weight < 0) {
            System.err.print("Отрицательное (неправельное) значение: ");
        }
        return weight;
    }

    public void setWeight(byte weight) {
        if (weight < 0) {
            System.err.println("Вы указали не верное значение, исправьте: " + weight );
        } else {
            this.weight = weight;
        }
    }

    public int getSpeed() {
        if (this.speed < 0) {
            System.err.print("Отрицательное (неправельное) значение: ");
        }
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed < 0) {
            System.err.println("Вы указали не верное значение, исправьте: " + speed );
        } else {
            this.speed = speed;
        }
    }

    public int getDamage() {
        if (this.damage < 0) {
            System.err.print("Отрицательное (неправельное) значение: ");
        }
        return damage;
    }

    public void setDamage(int damage) {
        if (damage < 0) {
            System.err.println("Вы указали не верное значение, исправьте: " + damage );
        } else {
            this.damage = damage;
        }
    }
    public boolean isFly() {
        return fly;
    }

    public void setFly(boolean fly) {
        this.fly = fly;
    }

    public boolean isTalk() {
        return talk;
    }

    public void setTalk(boolean talk) {
        this.talk = talk;
    }

    public byte getAge() {
        if (this.age < 0) {
            System.err.print("Отрицательное (неправельное) значение: ");
        }
        return age;
    }

    public void setAge(byte age) {
        if (age < 0) {
            System.err.println("Вы указали не верное значение, исправьте: " + age );
        } else {
            this.age = age;
        }
    }

    public void showInfo() {
        System.out.println("Name of the parrot: " + name);
        System.out.println("Age of parrot: " + age);
        System.out.println("Weight of the parrot: " + weight);
        System.out.println("How much speed it up to km/h: " + speed);
        System.out.println("How much damage it has: " + damage);
        System.out.println("Can it talk: " + talk);
        System.out.println("Can it fly: " + fly);
    }




}
