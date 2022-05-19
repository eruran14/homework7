package com.company;

public class Medic extends Hero{
    private int healPoints;

    @Override
    public void applySuperAbility() {
        System.out.println("Medic used Holy Force!");
    }

    public int getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(int healPoints) {
        this.healPoints = healPoints;
    }

    public int increaseExperience(){
        return (int)(healPoints + (healPoints * 0.1));
    };
}
