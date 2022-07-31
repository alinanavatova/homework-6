package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(600);
        boss.setDamage(70);
        boss.setSuperpower("magic");
        boss.setWeapon("steel arms", "sword");

        System.out.println(boss.getHealth() + " " + boss.getDamage() + " " + boss.getSuperpower() + " " + boss.getWeapon());

        System.out.println(boss.printInfo());

        Skeleton skeleton1 = new Skeleton();
        skeleton1.setNumberOfArrows(10);
        skeleton1.setHealth(150);
        skeleton1.setDamage(20);
        skeleton1.setWeapon("throwing weapon", "bow");

        System.out.println(skeleton1.printInfo());

        Skeleton skeleton2 = new Skeleton();
        skeleton2.setNumberOfArrows(15);
        skeleton2.setHealth(100);
        skeleton2.setDamage(25);
        skeleton2.setWeapon("throwing weapon", "bow");

        System.out.println(skeleton2.printInfo());
    }
}
