package mision_to_mars;

import java.util.Random;

public class U2 extends Rocket {

    private static double rocketU2Counter;
    private final double maxWeight = 8000;
    private static final double cost = 100000000;
    private final double weight = 10000;
    private double chanceLaunched;
    private double chanceLanded;
    private double explosionRange = 0.04;
    private  double crashRange = 0.08;

    /**
     * Constructor of U2.
     */
    public U2() {
        this(0);
    }

    /**
     * Constructor of U2.
     * @param lastWeight
     */
    public U2(int lastWeight) {
        setMaxWeight(maxWeight);
        setCost(cost);
        setWeight(weight);
        setWeight(lastWeight);

        rocketU2Counter++;
        System.out.println("------------------------------------");
    }

    /**
     * Gets RocketU2 Counter.
     * @return U2 Counter.
     */
    public static double getRocketU2Counter() {
        return rocketU2Counter;
    }

    /**
     * Sets RocketU2 Counter.
     * @param rocketU2Counter - counter value.
     */
    public static void setRocketU2Counter(double rocketU2Counter) {
        U2.rocketU2Counter = rocketU2Counter;
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
            System.out.println("U2 EXPLODED!!!");
            System.out.println("...Sending another rocket because it exploded...");
            return false;
        } else {
            System.out.println("U2 launched successfully!");
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
            System.out.println("U2 CRASHED!!!");
            System.out.println("...Sending another rocket because it crashed...");
            return false;
        } else {
            System.out.println("U2 landed successfully!");
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
