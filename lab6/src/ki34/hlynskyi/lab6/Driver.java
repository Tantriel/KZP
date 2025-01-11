package ki34.hlynskyi.lab6;

/**
 * Driver class implements main method for Box class possibilities demonstration
 *
 * @author Vladyslav Hlynskyi
 * @version 1.0
 */
public class Driver {

    public static void main(String[] args) {
        Box<? super Thing> box = new Box<Thing>();
        box.add(new Book(150));
        box.add(new Clothes(80));
        box.add(new Book(180));
        box.add(new Clothes());
        box.add(new Book());
        box.add(new Clothes(30));
        box.weight();
        box.remove(0);
        box.weight();
        Thing thing = box.findMin();
        System.out.println("The lightest thing is: ");
        thing.print();
    }
}

