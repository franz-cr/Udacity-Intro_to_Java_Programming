
/**
 * Write a description of class RectanglesQuiz here.
 *
 * @author (Franz J. Ulrich)
 * @version (1)
 */
public class RectanglesQuiz
{
    // instance variables - replace the example below with your own
    public static void main(String[] args) {
            //Variables para capturar el punto de origen del rectángulo superior
            int intLowerX, intLowerY, intLowerOriginX = 60, intLowerOriginY = 90;
            
            //Instanciar rectángulo superior
            Rectangle upperRectangle = new Rectangle(intLowerOriginX, intLowerOriginY, 20, 30);
            
            //Definir el origen del rectángulo inferior.
            //Este origen debe ser la esquina inferior derecha del rectángulo superior
            intLowerX = upperRectangle.getX() + upperRectangle.getWidth();
            intLowerY = upperRectangle.getY() + upperRectangle.getHeight();
            
            //Instanciar el rectángulo inferior
            Rectangle lowerRectangle = new Rectangle(intLowerX, intLowerY, 20, 30);
            upperRectangle.draw();
            lowerRectangle.draw();
    }
}
