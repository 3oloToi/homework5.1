package com.company;

public class Hero {
    private String superr;
    private int damage;
    private int health;

    public Hero(int damage, int health) {
        this.damage = damage;
        this.health = health;
    }

    public Hero(String superr, int damage, int health) {
        this.superr = superr;
        this.damage = damage;
        this.health = health;
    }

    public String getSuperr() {
        return superr;
    }

    public void setSuperr(String superr) {
        this.superr = superr;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
