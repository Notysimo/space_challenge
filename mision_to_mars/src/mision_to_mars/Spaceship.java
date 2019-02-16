package mision_to_mars;

/**
 * This interface contains methods that will be implemented
 * by Rocket class,
 *
 * @author Andres Uzeda
 * @version 1.0
 * @since February 6, 2019
 */
public interface Spaceship {

    /**
     * This method will verify if it's possible to launch a rocket.
     *
     * @return boolean
     */
    boolean launch();

    /**
     * This method will verify if it's possible to land a rocket.
     *
     * @return boolean
     */
    boolean land();

    /**
     * This method will verify if it's possible to carry an item
     * in a rocket.
     *
     * @param item
     * @return boolean
     */
    boolean canCarry(Item item);
}
