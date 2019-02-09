package mision_to_mars;

public class Rocket implements Spaceship {

    private double cost;
    private double weight;
    private double weightCarried;
    private double maxWeight;

    public void setCost(double cost) {
        this.cost = cost;
    }

    /**
     * Sets Weight value.
     * @param weight - double value.
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void setWeightCarried(double weightCarried) {
        this.weightCarried = weightCarried;
    }

    public double getCost() {
        return cost;
    }

    public double getWeight() {
        return weight;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public double getWeightCarried() {
        return weightCarried;
    }

    /**
     * This method will verify if it's possible to launch a rocket
     *
     * @return boolean
     */
    @Override
    public boolean launch() {

        return true;
    }

    /**
     * This method will verify if it's possible to land a rocket
     *
     * @return boolean
     */
    @Override
    public boolean land()
    {
        return true;
    }

    /**
     * This method will verify if it's possible to carry an item
     * in a rocket
     *
     * @param item
     * @return boolean
     */
    @Override
    public boolean canCarry(Item item) {
        if (maxWeight >= (maxWeight + item.getWeight())) {

            return true;
        } else {
            System.out.println("Can't carry item: " + item.getName() + "\tWeight: " + item.getWeight());
            return false;
        }
    }

    /**
     * This method will add an item in a rocket
     *
     * @param item
     */
    @Override
    public void carry(Item item) {
        System.out.println("Carrying item: " + item.getName() + "\tWeight: " + item.getWeight());
        weightCarried += item.getWeight();
    }
}
