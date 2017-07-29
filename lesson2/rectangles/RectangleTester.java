
/**
 * Write a description of class RectangleTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RectangleTester
{
    public static void main(String[] args) {
        Rectangle box = new Rectangle(45, 90, 60, 90);
        //Ampliar el rectángulo
        box.grow(20, 20);
        
        //Mostrar los nuevos valores y el dato esperado
        System.out.println("X (actual):   " + box.getX());
        System.out.println("X (esperado): 25");
        System.out.println("Y (actual):   " + box.getY());
        System.out.println("Y (esperado): 70\n");
        System.out.println("Ancho (actual):   " + box.getWidth());
        System.out.println("Ancho (esperado): 100");
        System.out.println("Alto (actual):    " + box.getHeight());
        System.out.println("Alto (esperado):  130");
    }
}
