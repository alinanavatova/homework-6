package com.company;

public class Boss extends GameEntity {
    private String weapon;

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String typeOfWeapon, String nameOfWeapon) {
        this.weapon = nameOfWeapon;
    }

    public String printInfo(){
        return super.printInfo() + "  weapon - " + this.weapon;
    }

}
