package mision_to_mars;

import java.util.Random;

/**
 * U2 class that extend of Rocket.
 *
 * @author Marco Mendez.
 * @version 1.0
 * @since Saturday 09, 2019.
 */
public class U2 extends Rocket {

    private final double maxWeight = 29000;
    private static final double cost = 12000000;
    private final double weight = 18000;
    private double chanceLaunched;
    private double chanceLanded;
    private double explosionRange = 0.04;
    private double crashRange = 0.08;

    /**
     * Constructor of U2.
     */
    public U2() {
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
     *
     * @return double value.
     */
    @Override
    public double getMaxWeight() {
        return maxWeight;
    }
}
