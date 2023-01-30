package exercise1;
import java.util.Random;
import java.util.Scanner;

/**
 * Class that matches the value and suit of a card and if
 * it matches, prints it out with user input
 * 
 * @author Sarah Rico022 
 */
public class CardTrick {
    
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        Card [] hand = new Card[7];
        Random random = new Random();

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue(random.nextInt(1, 14));
            card.setSuit(Card.SUITS[random.nextInt(0, 4)]);
            hand[i] = card;
          //  System.out.println(hand[i].getSuit());
         //  System.out.println(hand[i].getValue());
        }
            
        System.out.print("Suit of card: ");
        String userInput = input.nextLine();
        System.out.print("Value of card: ");
        int value = input.nextInt();

        for (int n = 0; n < hand.length; n++){
            if(userInput.equals(hand[n].getSuit())){
                if(value == hand[n].getValue()){
                   printInfo(); 
                }
            }
            
        }
        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Sarah Rico Jan 2023
     */
    private static void printInfo() {
 
        
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Paul, but you can call me prof, Paul or sir");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Riding my motorcycle");

        System.outs.println();
        
    
    }

}
