package com.company;

public class GameEntity {
    private int health;
    private int damage;
    private String superpower;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getSuperpower() {
        return superpower;
    }

    public void setSuperpower(String superpower) {
        this.superpower = superpower;
    }

    public String printInfo(){
        return "health - " + this.health + "  damage - " + this.damage + "  superpower - " + this.superpower;
    }
}
