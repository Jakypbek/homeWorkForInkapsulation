package com.company;

public class Cat {

    private String name;
    private int damage;
    private String weapon;
    private int speed;
    private byte age;
    private String ownerName;
    private boolean evil;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
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

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public boolean isEvil() {
        return evil;
    }

    public void setEvil(boolean evil) {
        this.evil = evil;
    }

    public void showInfo() {
        System.out.println("Name of the cat: " + name);
        System.out.println("Name of the cat owner: " + ownerName);
        System.out.println("Age of the cat: " + age);
        System.out.println("How much speed it up to km/h: " + speed);
        System.out.println("Weapon of the cat: " + weapon);
        System.out.println("Is it evil: " + evil);
        System.out.println("How much damage it has: " + damage);

    }



}
