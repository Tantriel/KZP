/**
 * lab 3 package
 */
package ki34.hlynskyi.lab3;

import java.io.FileNotFoundException;

/**
 * CameraApp class implements main method for Camera class possibilities demonstration
 *
 * @author Vladyslav Hlynskyi
 * @version 1.0
 */
public class VideoCameraApp {

    /**
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        VideoCamera camera = new VideoCamera(2, 2000, 3000);
        camera.zoomIn();
        camera.zoomIn();
        camera.zoomOut();
        camera.checkMemory();
        camera.takeVideo(5, 30);
        camera.dispose();
    }
}

