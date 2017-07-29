
public class CountryNameTester
{
   public static void main(String[] args)
   {
       CountryNames tester = new CountryNames();
       System.out.println(tester.getCompleteName("Albanie"));
       System.out.println("Expected: l'Albanie");
       System.out.println(tester.getCompleteName("Estonie"));
       System.out.println("Expected: l'Estonie");
       System.out.println(tester.getCompleteName("Inde"));
       System.out.println("Expected: l'Inde");
       System.out.println(tester.getCompleteName("Oman"));
       System.out.println("Expected: l'Oman");
       System.out.println(tester.getCompleteName("Uruguay"));
       System.out.println("Expected: l'Uruguay");
       System.out.println(tester.getCompleteName("Bolivie"));
       System.out.println("Expected: la Bolivie");
       System.out.println(tester.getCompleteName("États-Unis"));
       System.out.println("Expected: les États-Unis");
       System.out.println(tester.getCompleteName("Belgique"));
       System.out.println("Expected: la Belgique");
       System.out.println(tester.getCompleteName("Norvège"));
       System.out.println("Expected: la Norvège");
       System.out.println(tester.getCompleteName("Mexique"));
       System.out.println("Expected: le Mexique");
       System.out.println(tester.getCompleteName("Zaire"));
       System.out.println("Expected: le Zaire");
       System.out.println(tester.getCompleteName("Bolivie"));
       System.out.println("Expected: Bolivie");
       System.out.println(tester.getCompleteName("Costa Rica"));
       System.out.println("Expected: le Costa Rica");
       System.out.println(tester.getCompleteName("Cameroun"));
       System.out.println("Expected: le Cameroun");
   }
}
