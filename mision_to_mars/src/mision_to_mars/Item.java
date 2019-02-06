package mision_to_mars;

/**
 * This class consists of an item that will be carried in a rocket.
 * This class contains methods that let you modified access to
 * attributes of this class.
 *
 * @author Andres Uzeda
 * @since February 6, 2019
 * @version 1.0
 */
public class Item {

    private String name;
    private double weight;

    public Item(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    /**
     * This method returns the name of an item
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This method returns the weight of an item
     * @return weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * This method adds a name in an item
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method adds a weight in an item
     * @param weight
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }
}
