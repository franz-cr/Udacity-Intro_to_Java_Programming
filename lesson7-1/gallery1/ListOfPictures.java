// BlueJ project: lesson7/gallery1

// BlueJ project: lesson7/gallery1

import java.util.ArrayList;

public class ListOfPictures
{
    public static void main(String[] args)
    {
        int originPoint = 0;
        
        ArrayList<Picture> gallery = new ArrayList<Picture>();
        gallery.add(new Picture("degas1.jpg"));
        gallery.add(new Picture("gaugin1.jpg"));
        gallery.add(new Picture("monet1.jpg"));
        gallery.add(new Picture("monet2.jpg"));
        gallery.add(new Picture("renoir1.jpg"));

        for (int i = 0; i < gallery.size(); i++)
        {
            Picture pic = gallery.get(i);
            pic.translate(originPoint, 0);
            pic.draw();
            //int width = pic.getWidth();
            originPoint += pic.getWidth() + 10;
        }
    }
}
