/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 *@author Yoonho Choi 6/23/2020
 *@author Hoora Tavana 6/23/2020
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general enough to be instantiated for any Card
 * game. Students wishing to add to the code should remember to add themselves as a modifier.
 *
 * @author dancye
 */
public abstract class Card {
    //default modifier for child classes
    private Number number;
    private Suit suit;
    
    public enum Number{ace,two,three,four,five,six,seven,eight,nine,ten,jack,queen,king;
    } 
    public enum Suit{spades,hearts,diamonds,clubs;
    }
            
    

    /**
     * Students should implement this method for their specific children classes
     *
     * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
     */
    @Override
    public String toString(){
        return String.format(number+""+suit);
    }
    public Number getNumber(){
        return this.number;
    }
    public void setNumber(Number number){
        this.number=number;
    }
    public Suit getSuit() {
        return this.suit;
    }
    public void setSuit(Suit suit) {
        this.suit = suit;

    }
}
