package mision_to_mars;

/***
 * Handle the Rocket information.
 *
 * @author Marco Mendez.
 * @version 1.0
 * @since Saturday 09, 2019.
 */
public class Rocket implements Spaceship {

    private double cost;
    private double weight;
    private double weightCarried;
    private double maxWeight;

    /**
     * Sets Cost value.
     *
     * @param cost - double value.
     */
    public void setCost(double cost) {
        this.cost = cost;
    }

    /**
     * Sets Weight value.
     *
     * @param weight - double value.
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * Sets Max Weight value.
     *
     * @param maxWeight - double value.
     */
    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    /**
     * Sets Weight carried.
     *
     * @param weightCarried - double value.
     */
    public void setWeightCarried(double weightCarried) {
        this.weightCarried = weightCarried;
    }

    /**
     * Gets Max Weight value.
     *
     * @return
     */
    public double getMaxWeight() {
        return maxWeight;
    }

    /**
     * Gets Weight carried.
     *
     * @return double value.
     */
    public double getWeightCarried() {
        return weightCarried;
    }

    /**
     * Verifies if it's possible to launch a rocket.
     *
     * @return boolean,
     */
    @Override
    public boolean launch() {
        return true;
    }

    /**
     * Verifies if it's possible to land a rocket.
     *
     * @return boolean
     */
    @Override
    public boolean land() {
        return true;
    }

    /**
     * Verifies if it's possible to carry an item
     * in a rocket.
     *
     * @param item - contain name and weight values.
     * @return True if possible to carry an item, false otherwise.
     */
    @Override
    public boolean canCarry(Item item) {
        if (maxWeight >= (weightCarried + item.getWeight())) {
            return true;
        } else {
            System.out.println(String.format("Can't carry item: %s \tWeight: %s",
                    item.getName(), item.getWeight()));
            return false;
        }
    }
}
