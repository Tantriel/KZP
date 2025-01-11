/**
 * lab 6 package
 */
package ki34.hlynskyi.lab6;

/**
 * Class Clothes implements clothes
 *
 * @author Vladyslav Hlynskyi
 * @version 1.0
 */
public class Clothes implements Thing {

    /**
     * Constructor
     *
     * @param weight
     */
    public Clothes(int weight) {
        this.weight = weight;
    }

    /**
     * Constructor
     */
    public Clothes() {
        this.weight = 50;
    }

    private int weight;

    /**
     * Method prints info about thing
     */
    @Override
    public void print() {
        System.out.println("Type of thing: clothes");
        System.out.println("Weight: " + weight + " g");
    }

    /**
     * Method returns thing's weight
     */
    @Override
    public int getWeight() {
        return weight;
    }

    /**
     * Method compares current Thing with another Thing
     */
    @Override
    public int compareTo(Thing d) {
        if (this.weight < d.getWeight())
            return -1;
        if (this.weight == d.getWeight())
            return 0;
        return 1;
    }
}
