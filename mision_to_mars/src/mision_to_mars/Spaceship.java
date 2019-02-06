package mision_to_mars;


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
