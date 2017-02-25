import java.util.Scanner;
public class BabylonianRoot
{
    private double squareRoot; //number under the radical
    private double guess; //first guess input
    private double lastGuess; //place holder for input
    private double newGuess; //guess from babylonian output
    private double error; //allowed error
    Scanner keyboard = new Scanner(System.in);
    
    private void setRoot() {
      System.out.println("What would you like the square root of?");
      squareRoot = keyboard.nextDouble();
    }
    
    private void guessValue() {
      System.out.println("What do you guess the square root is?");
      guess= keyboard.nextDouble();
    
      System.out.println("How much error do you allow?");
      error= keyboard.nextDouble();
    }
    
    private void setGuess() //saves guess in placeholder, puts value through babylonian, saves as guess
  {
    lastGuess=guess;
    newGuess = (guess+(squareRoot/guess))/2;
    guess=newGuess;
    
  }
    
    public void sqrt() //squares guess value, subtracts squareroot. if less than error, prints output. else, runs methods again. 
  {
    if ((guess*guess-squareRoot) < error){
      System.out.println((guess+(squareRoot/guess))/2);
  }
    else {
      this.setGuess();
      this.sqrt();
    }
  }
    
  public static void main(String [] args) 
  {
    BabylonianRoot br = new BabylonianRoot();
    br.setRoot();
    br.guessValue();
    br.sqrt();
  
  }
  
}
  
  
  
  
