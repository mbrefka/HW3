import java.util.Scanner;
public class BabylonianRoot
{
  private float squareRoot;
  private float guess;
  private float original;
  private float outcome;
  private float last;
  private float answer;
  
  public static void main(String [] args) 
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("What would you like the square root of?");
    float squareRoot = keyboard.nextFloat();
    System.out.println("What do you guess the square root is?");
    float guess= keyboard.nextFloat();
  }
  
  public static float sqrt(float squareRoot)
  {
    last = original;
    original = (1/2)*(guess + (squareRoot/guess));
    
    if (last == outcome) {
      return last;
    }
    else {
      return (1/2)*(last + (squareRoot/last));
    }
    System.out.println(sqrt(4)); 
  }
}
  
  
  
  
  /*
    System.out.println(squareRoot);
    System.out.println(guess);
  */
  
  
