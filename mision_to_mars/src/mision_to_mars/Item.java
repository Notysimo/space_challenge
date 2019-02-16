package mision_to_mars;

/**
 * This class consists of an item that will be carried in a rocket.
 * This class contains methods that let you modified access to
 * attributes of this class.
 *
 * @author Andres Uzeda.
 * @version 1.0
 * @since February 6, 2019.
 */
public class Item {

    private String name;
    private double weight;

    /**
     * Constructor of Item.
     *
     * @param name
     * @param weight
     */
    public Item(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    /**
     * This method returns the name of an item.
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This method returns the weight of an item.
     *
     * @return weight
     */
    public double getWeight() {
        return weight;
    }
}
