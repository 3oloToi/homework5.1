package com.company;

public class Main {


    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(600);
        boss.setDamage(50);
        boss.setType("fire");
        System.out.println(boss.getHealth()+" "+ boss.getDamage()+" "+boss.getType());
        Hero[] comands= createHeroes();
        for (int i = 0; i <comands.length ; i++) {
            System.out.println(comands[i].getDamage()+" "+comands[i].getHealth()+" "+comands[i].getSuperr());

        }

    }
    public static Hero[] createHeroes(){
        Hero hero= new Hero(50,200);
        Hero hero1= new Hero(20,100);
        Hero batman= new Hero("mony",350,50);
        Hero[] comands = {hero, hero1, batman};
        return comands;

    }


}

