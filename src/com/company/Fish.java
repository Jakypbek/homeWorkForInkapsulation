package com.company;

public class Fish {

    private String name;
    private String breed;
    private int damage;
    private byte HP;
    private int speed;
    private boolean fly;
    private boolean scary;



    public boolean isScary() {
        return scary;
    }

    public void setScary(boolean scary) {
        this.scary = scary;
    }

    public boolean isFly() {
        return fly;
    }

    public void setFly(boolean fly) {
        this.fly = fly;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getDamage() {
        if (this.damage < 0) {
            System.err.print("Отрицательное (неправельное) значение урона для рыбы");
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

    public byte getHP() {
        if (this.HP < 0) {
            System.err.print("Отрицательное значение кол-ва жизни для рыбы: ");
        }
        return HP;
    }

    public void setHP(byte HP) {
        if (HP < 0) {
            System.err.println("Вы указали не верное значение кол-ва жизни, исправьте: " + HP );
        } else {
            this.HP = HP;
        }
    }

    public int getSpeed() {
        if (this.speed < 0) {
            System.err.print("Отрицательное значение скорости для рыбы: ");
        }
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed < 0) {
            System.err.println("Вы указали не верное значение скорости, исправьте: " + HP );
        } else {
            this.speed = speed;
        }
    }

    public void showInfo() {
        System.out.println("Name of the fish: " + name);
        System.out.println("Breed of the fish: " + breed);
        System.out.println("How much damage it has: " + damage);
        System.out.println("How much HP it has: " + HP);
        System.out.println("How much speed it up to km/h: " + speed);
        System.out.println("Can it fly: " + fly);
        System.out.println("Is it scary: " + scary);
    }


}
