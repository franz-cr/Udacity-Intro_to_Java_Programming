package ps8.hw8a.final_files;


/**
 * Write a description of class PictureUtil here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PictureUtil
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class PictureUtil
     */
    public PictureUtil()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * Takes a picture and flips it from left to right
     *
     * @param   the original picture
     * @return  the manipulated picture
     */
    public static Picture grayAndFlipLeftToRight(Picture pic) {
        // STEP 01: just return a grayscale version of the original picture.
        // put your code here
        // TODO get a gray scale version
        int[][] grayPicture = pic.getGrayLevels();
        
        int[][] flippedPicture = new int[grayPicture.length][grayPicture[0].length];
        
        for (int y = 0; y < flippedPicture.length; y++) {
            for (int x = 0; x < flippedPicture[0].length; x++)
                flippedPicture[y][(flippedPicture[0].length - 1) - x] = grayPicture[y][x];
        }
        
        return new Picture(flippedPicture);
    }
    
    /**
     * Takes a picture and rotates it 90 degrees clockwise
     *
     * @param   the original picture
     * @return  the manipulated picture
     */    
    public static Picture grayAndRotate90(Picture pic) {
        int[][] grayPicture = pic.getGrayLevels();
        
        int[][] rotatedPicture = new int[grayPicture[0].length][grayPicture.length];
        
        for (int y = 0; y < grayPicture.length; y++) {
            for (int x = 0; x < grayPicture[0].length; x++)
                rotatedPicture[x][grayPicture.length - 1 - y] = grayPicture[y][x];
        
        // for (int y = 0; y < rotatedPicture.length; y++) {
            // for (int x = 0; x < rotatedPicture[0].length; x++)
                // rotatedPicture[x][rotatedPicture[0].length - 1 - y] = grayPicture[y][x];
        }
        
        return new Picture(rotatedPicture);
    }
}
