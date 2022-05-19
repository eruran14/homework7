package com.company;

public class Main {

    public static void main(String[] args) {
        Medic medic = new Medic();
        medic.setHealPoints(50);

        Hero[] heroes = {new Magic(), medic, new Warrior()};

        for (int i = 0; i < heroes.length; i++) {
            heroes[i].applySuperAbility();
            if (heroes[i] instanceof Medic){
                System.out.println("Medic increased his experience by 10% and healed for "
                        + ((Medic) heroes[i]).increaseExperience() + " points");
            }
        }
    }
}
