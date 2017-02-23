import java.util.Scanner;
public class BabylonianRoot
{
    private double squareRoot;
    private double guess;
    private double lastGuess;
    private double newGuess;
    private double error;
    private double answer;
    Scanner keyboard = new Scanner(System.in);
    
  private void getRoot()
  {
    System.out.println("What would you like the square root of?");
    squareRoot = keyboard.nextDouble();
    
  }
  
  private void guessValue() {
    System.out.println("What do you guess the square root is?");
    guess= keyboard.nextDouble();
    System.out.println("How much error do you allow?");
    error= keyboard.nextDouble();
  }
    
  private void setGuess()
  {
    lastGuess=guess;
    newGuess=(guess+(squareRoot/guess))/2;
    guess=newGuess;
  }
  
  public double sqrt(double squareRoot, double guess, double error) {
    if ((guess*guess)-squareRoot <= error)
      return guess;
    else 
      guess=(guess+(squareRoot/guess))/2;
      return sqrt(squareRoot, guess, error);
    
 
  }
    
  public static void main(String [] args) 
  {
    BabylonianRoot br = new BabylonianRoot();

    br.getRoot();
    
    br.guessValue();
    
    
  }
}
  
  /*
    System.out.println(squareRoot);
    System.out.println(guess);
  */
  
  
