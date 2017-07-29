// BlueJ project: lesson2/crate2

public class TopSecret
{
    public static void main(String[] args)
    {
        //Variables del paralelep?pedo
        int X = 20, Y = 30, Ancho = 100, Alto = 40, FdoX = 30, FdoY = -20;
        //Crea y dibuja la cara frontal del paralelep?pedo
        Rectangle face = new Rectangle(X, Y, Ancho, Alto);
        face.draw();
        
        //Crea y dibuja la cara superior
        Line AristaA = new Line(X, Y, (X + FdoX), (Y + FdoY));
        AristaA.draw();
        
        Line AristaB = new Line((X + Ancho), Y, (X + Ancho + FdoX), (Y + FdoY));
        AristaB.draw();
        
        Line AristaC = new Line((X + Ancho), (Y + Alto), (X + Ancho + FdoX), (Y + Alto + FdoY));
        AristaC.draw();
        
        Line AristaD = new Line((X + FdoX), (Y + FdoY), (X + Ancho + FdoX), (Y + FdoY));
        AristaD.draw();
        
        Line AristaE = new Line((X + Ancho + FdoX), (Y + FdoY), (X + Ancho + FdoX), (Y + Alto + FdoY));
        AristaE.draw();
        
        // TODO: Write TOP SECRET on the front face of the box.
        // The top left corner of the front face should be the
        // same as the top left corner of the text.
       Text topSecretText = new Text(X, Y, "Top Secret");
       topSecretText.setColor(new Color(255,0,255));
       topSecretText.draw();
    }
}
