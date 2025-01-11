/**
 * lab 6 package
 */
package ki34.hlynskyi.lab6;

/**
 * Interface Thing describes rules for thing type
 *
 * @author Vladyslav Hlynskyi
 * @version 1.0
 */
interface Thing {

    /**
     * Method prints info about thing
     */
    public void print();

    /**
     * Method returns thing's weight
     */
    public int getWeight();

    /**
     * Method compares current Thing with another Thing
     *
     * @param Data
     */
    public int compareTo(Thing d);
}
