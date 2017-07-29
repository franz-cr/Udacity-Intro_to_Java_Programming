// Bluej project: lesson6/dim

public class Dim
{
    public static void main(String[] args) {
        Picture mary = new Picture("queen-mary.png");
        
        for (int i = 0; i < mary.pixels(); i = i + 5)
            mary.setColorAt(i, Color.BLACK);
            
        mary.draw();
        // TODO iterate over the pixels in the image turning every 5th one to Color.BLACK
        // your code here.
    }
}
