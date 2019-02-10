package com.minios;

import java.util.Random;

public class U1 extends Rocket {

    private static double rocketU1Counter;
    private final double maxWeight = 8000;
    private static final double cost = 100000000;
    private final double weight = 10000;
    private double chanceLaunched;
    private double chanceLanded;
    private double explosionRange = 0.05;
    private  double crashRange = 0.01;

    /**
     * Constructor of U1.
     */
    public U1() {
        this(0);
    }

    /**
     * Constructor of U1.
     * @param lastWeight .
     */
    public U1(int lastWeight) {
        setMaxWeight(maxWeight);
        setCost(cost);
        setWeight(weight);
        setWeight(lastWeight);

        rocketU1Counter++;
        System.out.println("------------------------------------");
    }

    /**
     * Gets Rocket UI counter.
     * @return - double value.
     */
    public static double getRocketU1Counter() {
        return rocketU1Counter;
    }

    /**
     * Sets Rocket Ui counter.
     * @param rocketU1Counter
     */
    public static void setRocketU1Counter(double rocketU1Counter) {
        U1.rocketU1Counter = rocketU1Counter;
    }

    /**
     * Verifies if launch U1.
     * @return True if Launch U1, False otherwise.
     */
    @Override
    public boolean launch() {
        System.out.println("\nLAUNCHING...");
        Random randomNumber = new Random();
        double rand = randomNumber.nextDouble();
        chanceLaunched = explosionRange * getWeightCarried() / getMaxWeight();

        System.out.println("Cargo: " + getWeightCarried());
        if (chanceLaunched >= rand) {
            System.out.println("U1 EXPLODED!!!");
            System.out.println("...Sending another rocket because it exploded...");
            return false;
        } else {
            System.out.println("U1 launched successfully!");
            return true;
        }
    }

    /**
     * Verifies if land, False otherwise.
     * @return True if Land U1, False otherwise.
     */
    @Override
    public boolean land() {
        System.out.println("\nLANDING...");
        Random randomNumber = new Random();
        double rand = randomNumber.nextDouble();
        chanceLanded = crashRange *  getWeightCarried()/ getMaxWeight();

        if (chanceLanded >= rand) {
            System.out.println("U1 CRASHED!!!");
            System.out.println("...Sending another rocket because it crashed...");
            return false;
        } else {
            System.out.println("U1 landed successfully!");
            return true;
        }
    }

    /**
     * Gets getMaxWeight.
     * @return double value.
     */
    @Override
    public double getMaxWeight() {
        return maxWeight;
    }

    /**
     * Gets Cost value.
     * @return double value.
     */
    @Override
    public double getCost() {
        return cost;
    }

    /**
     * Gets Weight value.
     * @return double value.
     */
    @Override
    public double getWeight() {
        return weight;
    }
}
