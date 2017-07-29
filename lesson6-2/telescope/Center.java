// BlueJ project: lesson6/telescope

// Your task is to color all pixels black that are outside the
// telescope circle. The center and radius of the circle are
// given below.

// For each point, find out the distance to the center and
// check if it is larger than the radius.

public class Center
{
    /*
     * Declarar variables con los datos fundamentales:
     *  1) Crear y cargar la foto.
     *  2) Dibujar la foto.
     *  3) Calcular el radio y el centro geométrico de la foto.
     *  4) Recorrer los píxeles de la foto.
     *  5) Para cada píxel, calcular la distancia al centro geométrico.
     *  6) Evaluar si ese píxel está dentro del radio.
     *  7) Cambiar color del píxel a negro si está fuera de cículo.
     *      - setColorAt(int x, int y, Color color)
     *  8) Continuar con el siguiente píxel.
     */
    public static void main(String[] args)
    {
        Picture pic = new Picture();
        pic.load("queen-mary.png");
        pic.draw();

        int deltaX = 0, deltaY = 0;
        double centerX = pic.getWidth() / 2;
        double centerY = pic.getHeight() / 2;
        double radius = pic.getHeight() / 4;
        
        for (int x = 0; x < pic.getWidth(); x++)
        {
            for (int y = 0; y < pic.getHeight(); y++)
            {
                
                double distance = radiusToPixel((centerX - x), (centerY - y));
                if (distance > radius)
                {
                    pic.setColorAt(x, y, Color.BLACK);
                }
            }
        } 
    }
    
    public int catetoCalc(int pixel) {
        
        return 0;
    }
    
    public static double radiusToPixel(double catetoX, double catetoY) {
        /*
         * Seudocódigo:
         * Recibe las distancias absolutas en x,y del punto central.
         * Estas distancias son los catetos de un triángulo equilátero.
         * Calcula, por pitágoras, la distancia usando los catetos recibifos
         */
        
        return (Math.sqrt((Math.pow(catetoX,2)) + (Math.pow(catetoY,2))));
    }
}

// Hint: The distance between two points (x1, y1) and (x2, y2) is
// Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2))