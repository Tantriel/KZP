/**
 * lab 3 package
 */
package ki34.hlynskyi.lab3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Class Camera implements camera
 *
 * @author Vladyslav Hlynskyi

 * @version 1.0
 */
public abstract class Camera {

    /**
     * Constructor
     * @throws FileNotFoundException
     */
    public Camera() throws FileNotFoundException {
        lens = new Lens();
        memory = new Memory();
        battery = new Battery();

        fout = new PrintWriter(new File("Log.txt"));
    }

    /**
     * Constructor
     *
     * @param lens
     * @param memory
     * @param battery
     * @throws FileNotFoundException
     */
    public Camera(int lens, int memory, int battery) throws FileNotFoundException {
        this.lens = new Lens(lens);
        this.memory = new Memory(memory);
        this.battery = new Battery(battery);

        fout = new PrintWriter(new File("Log.txt"));
    }

    /**
     * Constructor
     *
     * @param memory
     * @param battery
     * @throws FileNotFoundException
     */
    public Camera(int memory, int battery) throws FileNotFoundException {
        this.memory = new Memory(memory);
        this.battery = new Battery(battery);

        fout = new PrintWriter(new File("Log.txt"));
    }

    private Lens lens;
    private Memory memory;
    private Battery battery;
    protected PrintWriter fout;

    /**
     * Method implements taking a photo
     */
    public void takePhoto() {
        if (battery.plusPhoto() && memory.plusPhoto()) {
            System.out.println("Photo is successfully taken");
            fout.println("Photo is successfully taken");
        }
    }

    /**
     * Method implements deleting a photo
     */
    public void deletePhoto() {
        memory.minusPhoto();
    }

    /**
     * Method implements zoom in
     */
    public void zoomIn() {
        lens.zoomIn();
    }

    /**
     * Method implements zoom out
     */
    public void zoomOut() {
        lens.zoomOut();
    }

    /**
     * Method checks how much photos you still can take
     */
    public void checkMemory() {
        System.out.println("You can take " + memory.howMuchPhotos() + " photos before your memory will full");
        fout.println("You can take " + memory.howMuchPhotos() + " photos before your memory will full");
    }

    /**
     * Method implements battery charging
     */
    public void chargeBattery() {
        battery.charge();
    }

    /**
     * Method releases used recourses
     */
    public void dispose() {
        fout.close();
    }

    /**
     * @return the lens
     */
    public Lens getLens() {
        return lens;
    }

    /**
     * @param lens the lens to set
     */
    public void setLens(Lens lens) {
        this.lens = lens;
    }

    /**
     * @return the memory
     */
    public Memory getMemory() {
        return memory;
    }

    /**
     * @param memory the memory to set
     */
    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    /**
     * @return the battery
     */
    public Battery getBattery() {
        return battery;
    }

    /**
     * @param battery the battery to set
     */
    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    class Lens {

        /**
         * Constructor
         */
        public Lens() {
            this.maxZoom = 10;
        }

        /**
         * Constructor
         *
         * @param maxZoom
         */
        public Lens(int maxZoom) {
            this.maxZoom = maxZoom;
        }

        private int zoom;

        private int maxZoom;

        /**
         * Method implements zoom in
         */
        public void zoomIn() {
            if (zoom < maxZoom)
                zoom++;
            System.out.println("Zoom now is: " + zoom + " from: " + maxZoom);
            fout.println("Zoom now is: " + zoom + " from: " + maxZoom);
        }

        /**
         * Method implements zoom out
         */
        public void zoomOut() {
            if (zoom > 0)
                zoom--;
            System.out.println("Zoom now is: " + zoom + " from: " + maxZoom);
            fout.println("Zoom now is: " + zoom + " from: " + maxZoom);
        }
    }

    class Memory {

        /**
         * Constructor
         */
        public Memory() {
            memCapacity = 1000;
        }

        /**
         * Constructor
         *
         * @param memCapacity
         */
        public Memory(int memCapacity) {
            this.memCapacity = memCapacity;
        }

        private int photos = 0;

        // in mb, not gb!
        private int memCapacity;

        /**
         * Method returns how much photos you can still do
         *
         * @return photos
         */
        public int howMuchPhotos() {
            return memCapacity / 4 - photos;
        }

        /**
         * Method implements adding photos to memory
         */
        public boolean plusPhoto() {
            if (photos < howMuchPhotos()) {
                photos++;
                return true;
            } else {
                System.out.println("Not enough memory to take photo");
                fout.println("Not enough memory to take photo");
                return false;
            }
        }

        /**
         * Method implements deleting photos from memory
         */
        public void minusPhoto() {
            if (photos > 0) {
                photos--;
                System.out.println("Photo is deleted");
                fout.println("Photo is deleted");
            } else {
                System.out.println("No photos to delete");
                fout.println("No photos to delete");
            }
        }
    }

    class Battery {

        /**
         * Constructor
         */
        public Battery() {
            maxCharge = 100;
            charge = maxCharge;
        }

        /**
         * Constructor
         *
         * @param maxCharge
         */
        public Battery(int maxCharge) {
            this.maxCharge = maxCharge;
            charge = maxCharge;
        }

        private int charge;
        private int maxCharge;

        /**
         * Method implements battery charging
         */
        public void charge() {
            charge = maxCharge;
            System.out.println("Battery is charged");
            fout.println("Battery is charged");
        }

        /**
         * Method implements uncharging the battery during taking a photo
         */
        public boolean plusPhoto() {
            if (charge > 0) {
                charge--;
                return true;
            } else {
                System.out.println("Not enough battery power. Please, charge battery.");
                fout.println("Not enough battery power. Please, charge battery.");
                return false;
            }
        }
    }
}
