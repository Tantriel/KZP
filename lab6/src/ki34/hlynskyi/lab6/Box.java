/**
 * lab 6 package
 */
package ki34.hlynskyi.lab6;
import java.util.ArrayList;

/**
 * Class Box implements box
 *
 * @author Vladyslav Hlynskyi
 * @version 1.0
 */
public class Box<T extends Thing> {

    /**
     * Constructor
     */
    public Box() {
        list = new ArrayList<T>();
    }

    ArrayList<T> list;

    /**
     * Method puts thing into a box
     */
    public void add(T t) {
        list.add(t);
    }

    /**
     * Method prints info about thing
     */
    public void get(int index) {
        list.get(index).print();
    }

    /**
     * Method removes thing from box
     */
    public void remove(int index) {
        list.remove(index);
    }

    /**
     * Method prints weight of box
     */
    public void weight() {
        int sumWeight = 0;
        for (T t : list)
            sumWeight += t.getWeight();
        System.out.println("Weight of this box is: " + sumWeight + " g");
    }

    /**
     * Method returns thing with the little weight
     */
    public T findMin() {
        T min = list.get(0);
        for (T t : list)
            if (t.compareTo(min) == -1)
                min = t;
        return min;
    }
}
