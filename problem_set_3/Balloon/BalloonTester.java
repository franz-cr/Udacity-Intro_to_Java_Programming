
/**
 * Tests the Balloon class
 * 
 * @author KOBrien
 */
public class BalloonTester
{
   public static void main(String[] args)
   {
       Balloon balloon = new Balloon();
       
       // Add air to balloon
       balloon.addAir(100);
       System.out.println("Test 01: Volume\n==============");
       System.out.println(balloon.getVolume());
       System.out.println("Expected: 100.0\n");
       
       // Get radius from volume
       System.out.println("Test 02: Radius\n=============="); 
       System.out.println(balloon.getRadius());
       System.out.println("Expected: 2.8794119114848606\n");
       
       // Get surface from volume
       System.out.println("Test 03: Surface\n=============="); 
       System.out.println(balloon.getSurfaceArea());
       System.out.println("Expected: 104.18794157356089\n");
       
       // Add air to balloon
       balloon.addAir(100);
       System.out.println("Test 04: Volume\n==============");
       System.out.println(balloon.getVolume());
       System.out.println("Expected: 200.0\n");
       
       // Get radius from volume
       System.out.println("Test 05: Radius\n=============="); 
       System.out.println(balloon.getRadius());
       System.out.println("Expected: 3.6278316785978095\n");
       
       // Get surface from volume
       System.out.println("Test 06: Surface\n=============="); 
       System.out.println(balloon.getSurfaceArea());
       System.out.println("Expected: 165.38804805627188\n");
   }
}
