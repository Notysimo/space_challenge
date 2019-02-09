package mision_to_mars;

import java.util.Random;

public class U1 extends Rocket {

    private static double rocketU1Counter;
    private final double maxWeight = 8000;
    private static final double cost = 100000000;
    private final double weight = 10000;
    private double chanceLaunched;
    private double chanceLanded;

    public U1() {
        this(0);
    }

    public U1(int lastWeight) {
        setMaxWeight(maxWeight);
        setCost(cost);
        setWeight(weight);
        setWeight(lastWeight);

        rocketU1Counter++;
        System.out.println("------------------------------------");
    }

    public static double getRocketU1Counter() {
        return rocketU1Counter;
    }

    public static void setRocketU1Counter(double rocketU1Counter) {
        U1.rocketU1Counter = rocketU1Counter;
    }

    public boolean launch() {
        System.out.println("\nLAUNCHING...");
        Random randomNumber = new Random();
        double rand = randomNumber.nextDouble();
        chanceLaunched = 0.05 * getWeightCarried() / getMaxWeight();

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

    public boolean land() {
        System.out.println("\nLANDING...");
        Random randomNumber = new Random();
        double rand = randomNumber.nextDouble();
        chanceLanded = 0.01 *  getWeightCarried()/ getMaxWeight();

        if (chanceLanded >= rand) {
            System.out.println("U1 CRASHED!!!");
            System.out.println("...Sending another rocket because it crashed...");
            return false;
        } else {
            System.out.println("U1 landed successfully!");
            return true;
        }
    }

    @Override
    public double getMaxWeight() {
        return maxWeight;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    public double getChanceLaunched() {
        return chanceLaunched;
    }

    public void setChanceLaunched(double chanceLaunched) {
        this.chanceLaunched = chanceLaunched;
    }

    public double getChanceLanded() {
        return chanceLanded;
    }

    public void setChanceLanded(double chanceLanded) {
        this.chanceLanded = chanceLanded;
    }
}
