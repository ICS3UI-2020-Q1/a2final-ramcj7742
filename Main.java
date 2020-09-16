import java.util.Scanner;

/**
 * determines price of pizza based on size and tax
 * @author Jaden Ramcharan
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create scanner for user input
    Scanner input = new Scanner(System.in);

    // gets size of pizza from user
    System.out.println("What is the size of the pizza (in cm):");
    int pizza = input.nextInt();

    //determine and initializes labour and oven cost for pizza
    final double labour = 0.75;
    final double oven = 0.99;

    // determine and initializes variable for price of a one cm diameter pizza
    double pizzaSub = pizza * 0.5 + oven + labour;

    // determine and initializes tax add on
    final double tax = 0.13;

    // determine price of tax add on
    double pizzaTax = pizzaSub * tax;

    // determine total cost
    double pizzaTot = pizzaSub + pizzaTax;

    //Displays subtotal to user
    System.out.println("Subtotal: " + pizzaSub);

    //Displays tax add on to user
    System.out.println("Taxes: " + pizzaTax);

    //Displays total to user
    System.out.println("Total: " + pizzaTot);

    //determines final message depending on pizza size
    if (pizza < 20) {
      System.out.println("We are going to make you a cute little pizza!");
    } else if (pizza < 40) {
      System.out.println("This will be delicious!");
    } else if (pizza > 40) {
      System.out.println("Whoa, big pizza! You might need a truck to get this home!");
    }
    
    
  }
}
