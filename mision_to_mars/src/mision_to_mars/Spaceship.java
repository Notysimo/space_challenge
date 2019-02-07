package mision_to_mars;


/**
 * This interface contains methods that will be implemented
 * by Rocket class
 *
 * @author Andres Uzeda
 * @since February 6, 2019
 * @version 1.0
 */
public interface Spaceship {
    /**
     * This method will verify if it's possible to launch a rocket
     * @param percentage
     * @return boolean
     */
    boolean launch(float percentage);
    /**
     * This method will verify if it's possible to land a rocket
     * @param percentage
     * @return boolean
     */
    boolean land(float percentage);
    /**
     * This method will verify if it's possible to carry an item
     * in a rocket
     * @param item
     * @return boolean
     */
    boolean canCarry(Item item);
    /**
     * This method will add an item in a rocket
     * @param item
     */
    void carry(Item item);
}
