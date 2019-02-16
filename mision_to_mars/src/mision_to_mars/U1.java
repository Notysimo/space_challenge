package mision_to_mars;

import java.util.Random;

/**
 * U1 class that extend of Rocket.
 *
 * @author Marco Mendez.
 * @version 1.0
 * @since Saturday 09, 2019.
 */
public class U1 extends Rocket {

    private final double maxWeight = 18000;
    private static final double cost = 100000000;
    private final double weight = 10000;
    private double chanceLaunched;
    private double chanceLanded;
    private double explosionRange = 0.05;
    private double crashRange = 0.01;

    /**
     * Constructor of U1.
     */
    public U1() {
        setMaxWeight(maxWeight);
        setCost(cost);
        setWeight(weight);
        System.out.println("------------------------------------");
    }

    /**
     * Verifies if launch U1.
     *
     * @return True if Launch U1, False otherwise.
     */
    @Override
    public boolean launch() {
        System.out.println("\nLAUNCHING...");
        Random randomNumber = new Random();
        double rand = randomNumber.nextDouble();
        chanceLaunched = explosionRange * getWeightCarried() / getMaxWeight();
        System.out.println(String.format("Cargo: %s", getWeightCarried()));
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
     *
     * @return True if Land U1, False otherwise.
     */
    @Override
    public boolean land() {
        System.out.println("\nLANDING...");
        Random randomNumber = new Random();
        double rand = randomNumber.nextDouble();
        chanceLanded = crashRange * getWeightCarried() / getMaxWeight();
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
     *
     * @return double value.
     */
    @Override
    public double getMaxWeight() {
        return maxWeight;
    }
}
