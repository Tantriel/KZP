/**
 * lab 6 package
 */
package ki34.hlynskyi.lab6;

/**
 * Class Book implements book
 *
 * @author Vladyslav Hlynskyi
 * @version 1.0
 */
public class Book implements Thing {

    /**
     * Constructor
     *
     * @param weight
     */
    public Book(int weight) {
        this.weight = weight;
    }

    /**
     * Constructor
     */
    public Book() {
        this.weight = 200;
    }

    private int weight;

    /**
     * Method prints info about thing
     */
    @Override
    public void print() {
        System.out.println("Type of thing: book");
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