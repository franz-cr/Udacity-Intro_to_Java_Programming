// BlueJ project: lesson7/gallery9
// Array Algorithms Find All Matches and collect them.
import java.util.ArrayList;

public class ListOfPictures
{
    public static void main(String[] args)
    {
        ArrayList<Picture> gallery = new ArrayList<Picture>();
        gallery.add(new Picture("degas1.jpg"));
        //gallery.add(new Picture("gaugin1.jpg"));
        gallery.add(new Picture("monet1.jpg"));
        gallery.add(new Picture("monet2.jpg"));
        gallery.add(new Picture("renoir1.jpg"));
        gallery.add(new Picture("seurat1.jpg"));

        ArrayList<Picture> matches = new ArrayList<Picture>();
        int leftMargin = 10;
        
        for (Picture pic : gallery)
        {
            if (pic.getHeight() > pic.getWidth()) {
                matches.add(pic);
                pic.translate(leftMargin, 0);
                leftMargin += pic.getWidth() + 10;
                pic.draw();
            }
        }
    }
}
