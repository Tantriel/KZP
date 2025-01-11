/**
 * lab 3 package
 */
package ki34.hlynskyi.lab3;

import java.io.FileNotFoundException;

/**
 * Class VideoCamera implements videocamera
 *
 * @author Vladyslav Hlynskyi
 * @version 1.0
 */
public class VideoCamera extends Camera implements Video {

    /**
     * Constructor
     * @throws FileNotFoundException
     */
    VideoCamera() throws FileNotFoundException {
        super();
    }

    /**
     * Constructor
     *
     * @param lens
     * @param memory
     * @param battery
     * @throws FileNotFoundException
     */
    VideoCamera(int lens, int memory, int battery) throws FileNotFoundException {
        super(lens, memory, battery);
    }

    /**
     * Constructor
     *
     * @param memory
     * @param battery
     * @throws FileNotFoundException
     */
    VideoCamera(int memory, int battery) throws FileNotFoundException {
        super(memory, battery);
    }

    /**
     * Method implements start recording a sound
     */
    public void startRecordSound() {
        System.out.println("Sound recording is started");
        super.fout.println("Sound recording is started");
    }

    /**
     * Method implements stop recording a sound
     */
    public void stopRecordSound() {
        System.out.println("Sound recording is stoped");
        super.fout.println("Sound recording is stoped");
    }

    /**
     * Method implements taking a video
     */
    @Override
    public void takeVideo(int duration, int fps) {
        System.out.println("Video recording is started");
        super.fout.println("Video recording is started");
        startRecordSound();
        for(int i = 0; i <= duration * fps; i++) {
            super.takePhoto();
        }
        System.out.println("Video recording is stoped");
        super.fout.println("Video recording is stoped");
        stopRecordSound();
    }
}