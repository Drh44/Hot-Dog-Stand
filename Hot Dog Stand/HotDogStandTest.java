public class HotDogStandTest
/* This test tests the HotDogStand code and implements it in a few examples. 
Author: Dylan Hesser
version 1.00
*/
{
   public static void main(String[] args)
   {
      HotDogStand One = new HotDogStand(); 
      One.setIdNum(432);
      One.setNumSold(0);
      
      HotDogStand Two = new HotDogStand(0,6654);
      HotDogStand Three = new HotDogStand(0,66);
      
      for(int i = 1; i <= 12; i++)
         One.justSold();
         
      Two.justSold(12);
      Two.justSold(5);
      
      Three.justSold(9);
      
      System.out.printf("Total hot dogs sold in city: %d. %n", HotDogStand.getTotalSold());
      System.out.println();
      System.out.println(One.toString());
      System.out.println(Two.toString());
      System.out.println(Three.toString());
      }
      }
      