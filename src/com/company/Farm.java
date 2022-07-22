package com.company;

import java.util.Arrays;

public class Farm {
    private String address;
    private String ownerName;

    private Cow[] cows;
    private Sheep[] sheep;
    private Horse[] horses;

    public Farm(String address, String ownerName, Cow[] cows, Sheep[] sheeps, Horse[] horses) {
        this.address = address;
        this.ownerName = ownerName;
        this.cows = cows;
        this.sheep = sheeps;
        this.horses = horses;
    }

    @Override
    public String toString() {
        return "Address of farm is " + address +
                ", ownerName = " + ownerName +
                ", " + "\n" + "cows=" + Arrays.toString(cows) +
                ", " + "\n" + "sheep=" + Arrays.toString(sheep) +
                ", " + "\n" + "horses=" + Arrays.toString(horses);
    }
}