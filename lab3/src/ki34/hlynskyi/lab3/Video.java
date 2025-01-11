/**
 * lab 3 package
 */
package ki34.hlynskyi.lab3;


/**
 * Interface Video describes taking a video
 *
 * @author Vladyslav Hlynskyi
 * @version 1.0
 */
public abstract interface Video {

    /**
     * Method describes taking a video
     *
     * @param duration
     * @param fps
     */
    public void takeVideo(int duration, int fps);

    /**
     * Method describes start recording a sound
     */
    public void startRecordSound();

    /**
     * Method describes stop recording a sound
     */
    public void stopRecordSound();
}