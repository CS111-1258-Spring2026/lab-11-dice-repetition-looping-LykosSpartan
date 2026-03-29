import java.util.Random;

class Main
{
  public static void main(String[] args)
  {
    int one = 0;
    int two = 0;
    int three = 0;
    int four = 0;
    int five = 0;
    int six = 0;


    for (int i = 1; i <= 100; i++){
    // Example calling the roll() method
    int currentRoll = roll();
    System.out.println("Roll " + i + ": [" + currentRoll + "]");
    if (currentRoll == 1){
      one++;
    }
    else if (currentRoll == 2){
      two++;
    }
    else if (currentRoll == 3){
      three++;
    }
    else if (currentRoll == 4){
      four++;
    }
    else if (currentRoll == 5){
      five++;
    }
    else if (currentRoll == 6){
      six++;
    }
  }


   
    System.out.println("\nFinal Roll Counts:");
    System.out.println("[1]: " + one + " times");
    System.out.println("[2]: " + two + " times");
    System.out.println("[3]: " + three + " times");
    System.out.println("[4]: " + four + " times");
    System.out.println("[5]: " + five + " times");
    System.out.println("[6]: " + six + " times");
  }

  

  
  // Random is a class we can use to generate random numbers
  // You do not need to change anything in the method below
  // Every time you invoke the roll() method, it will generate a random int
  // between 0-5, and then we add 1, so it will return a number between 1-6, just like dice
  public static int roll()
  {
    Random dice = new Random();
    return dice.nextInt(6) + 1;
  }
}