// Write code that prints a table of all the possible times a digital
// clock can show. The clock only shows hours and minutes. 
// print the table this way : 
// 1:00 2:00 3:00 4:00 5:00 6:00 7:00 8:00 9:00 10:00 11:00 12:00 
// 1:01 2:01 3:01 4:01 5:01 6:01 7:01 8:01 9:01 10:01 11:01 12:01 
// 1:02 2:02 3:02 4:02 5:02 6:02 7:02 8:02 9:02 10:02 11:02 12:02 
// 1:03 2:03 3:03 4:03 5:03 6:03 7:03 8:03 9:03 10:03 11:03 12:03 
// 1:04 2:04 3:04 4:04 5:04 6:04 7:04 8:04 9:04 10:04 11:04 12:04 
// 1:05 2:05 3:05 4:05 5:05 6:05 7:05 8:05 9:05 10:05 11:05 12:05 
// ...
// 1:59 2:59 3:59 4:59 5:59 6:59 7:59 8:59 9:59 10:59 11:59 12:59 
public class ClockTimes
{
    public static void main(String[] args)
    {
        // Local Variables
        
        // PROCESS:
        // Write a nested for loop that counts up the hours and the minutes
        // Hint: you can use %02d in format strings to print a "zero-padded" number. 
        
        // Crear la línea horizontal de horas primero:
        for (int minuto = 0; minuto < 60; minuto++) {
            for (int hora = 1; hora < 13; hora++) {
                System.out.printf("%d:%02d ", hora, minuto);
            }
            System.out.print("\n");
        }
    }
}

/*
// Local variables
        final int WIDTH = 30;
        final int ROWS = 16;
        final int COLUMNS = 16;
        final int BLUE_INCREMENT = (int)(255 / ROWS);
        final int GREEN_INCREMENT = (int)(255 / COLUMNS);

        // Process:
        
        for (int i = 0; i < ROWS; i++)
        {
            for (int j = 0; j < COLUMNS; j++)
            {
                int x = j * WIDTH;
                int y = i * WIDTH;
                Rectangle rect = new Rectangle(x, y,
                                               WIDTH - 1, WIDTH - 1);
                //int blue = i * BLUE_INCREMENT;
                //int green = j * GREEN_INCREMENT;
                int blue = i * 255 / (ROWS - 1);
                int green = j * 255 / (COLUMNS - 1);
                Color fillColor = new Color(0, green, blue);
                rect.setColor(fillColor);
                rect.fill();
            }
        }
 */