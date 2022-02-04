package com.company;

public class Dog {


    private String name;
    private String ownerName;
    private int damage;
    private boolean evil;
    private boolean fly;
    private byte age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getDamage() {
        if (this.damage < 0) {
            System.err.print("Отрицательное (неправельное) значение урона");
        }
        return damage;
    }

    public void setDamage(int damage) {
        if (damage < 0) {
            System.err.println("Вы указали не верное значение урона, исправьте: " + damage );
        } else {
            this.damage = damage;
        }
    }
    public boolean isEvil() {
        return evil;
    }

    public void setEvil(boolean evil) {
        this.evil = evil;
    }

    public boolean isFly() {
        return fly;
    }

    public void setFly(boolean fly) {
        this.fly = fly;
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
        System.out.println("Name of the dog: " + name);
        System.out.println("Name of the dogs owner: " + ownerName);
        System.out.println("Age of the dog: " + age);
        System.out.println("Can it fly: " + fly);
        System.out.println("Is it evil: " + evil);
        System.out.println("How much damage it has: " + damage);

    }






}
