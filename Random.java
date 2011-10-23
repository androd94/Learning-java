import java.util.*;

public class Random 
{
  public static void main (String [] args) 
  {
        int num1, num2, num3, num4;
        
        num1 = (int) (Math.random()*6 +1);
        num2 = (int) (Math.random()*100 +1);
        num3 = (int) (Math.random()*75 +50);
        num4 = (int) (Math.random()*100 - 25);
      
        System.out.println("Random number between 1 and 6: "+num1);
        System.out.println("Random number between 1 and 100: "+num2);
        System.out.println("Random number between 50 and 125: "+num3);
        System.out.println("Random number between -25 and 75: "+num4);
  }
}