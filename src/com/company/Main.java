package com.company;

public class Main {

    public static void main(String[] args) {

        Fish nemo = new Fish();
        nemo.setName("Nemo");
        nemo.setBreed("Clown");
        nemo.setDamage(356);
        nemo.setFly(false);
        nemo.setHP((byte) 46);
        nemo.setScary(false);
        nemo.setSpeed(15);

        Fish marlin = new Fish();
        marlin.setName("Marlin");
        marlin.setBreed("Clown");
        marlin.setDamage(568);
        marlin.setFly(false);
        marlin.setHP((byte) 59);
        marlin.setScary(true);
        marlin.setSpeed(20);

        // System.out.println(marlin.getHP());
        // nemo.showInfo();
        // marlin.showInfo();

        Parrot blu = new Parrot();
        blu.setName("Blu");
        blu.setAge((byte) 5);
        blu.setWeight((byte) 2.9);
        blu.setSpeed(12);
        blu.setFly(false);
        blu.setTalk(true);
        blu.setDamage(640);

        Parrot jewel = new Parrot();
        jewel.setName("Jewel");
        jewel.setAge((byte) 4);
        jewel.setWeight((byte) 2.5);
        jewel.setSpeed(25);
        jewel.setFly(true);
        jewel.setTalk(false);
        jewel.setDamage(670);

        // System.out.println(jewel.getSpeed());
        // blu.showInfo();
        // jewel.showInfo();

        Dog belka = new Dog();
        belka.setName("Belka");
        belka.setOwnerName("USSR");
        belka.setAge((byte) 5);
        belka.setFly(true);
        belka.setEvil(false);
        belka.setDamage(867);

        Dog strelka = new Dog();
        strelka.setName("Strelka");
        strelka.setOwnerName("USSR");
        strelka.setAge((byte) 7);
        strelka.setFly(true);
        strelka.setEvil(false);
        strelka.setDamage(896);

        // System.out.println(strelka.getDamage());
        // belka.showInfo();
        // strelka.showInfo();

        Cat vasily = new Cat();
        vasily.setName("Vasily");
        vasily.setOwnerName("Vitaliy");
        vasily.setAge((byte) 3);
        vasily.setSpeed(19);
        vasily.setEvil(true);
        vasily.setWeapon("claws");
        vasily.setDamage(916);

        Cat danil = new Cat();
        danil.setName("Danil");
        danil.setOwnerName("Daniil");
        danil.setAge((byte) 4);
        danil.setSpeed(24);
        danil.setEvil(false);
        danil.setWeapon("sharp teeth");
        danil.setDamage(956);

        // System.out.println(vasily.getSpeed());
        // vasily.showInfo();
        // danil.showInfo();


    }
}
