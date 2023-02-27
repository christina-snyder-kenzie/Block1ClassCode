package org.example;
import java.util.*;

public class MonopolyGame {
    private ArrayList<Player> players;
    private int currPlayerIndex;

    public MonopolyGame(){
        players = new ArrayList<Player>();
        currPlayerIndex = 0;

        players.add(new Player("Christina", "MoneyBags"));
        players.add(new Player("Michael", "Battleship"));
        players.add(new Player("Colin", "Car"));
        players.add(new Player("Kim", "Dog"));
    }

    public void play(){
        while (!hasAWinner()){
            takeATurn();
        }
    }

    public boolean hasAWinner(){
        /*hasAWinner()
if the number of losers = player count - 1, we have a winner

count the number of losers
basket
loop
if statement
update the basket

return numLosers >= players.size() - 1;
*/
        int basket = 0;
        for (Player currPlayer : players){
            if (currPlayer.getHasLost()){
                basket++;
            }
        }

        return basket >= players.size() - 1;
    }

    public void takeATurn(){

//Become the active player
        Player activePlayer = players.get(currPlayerIndex);
//Roll dice
        int result = activePlayer.rollDice();
//Update the position (move the piece)
        int newPosition = activePlayer.getPosition() + result;
        //we gotta wraparound our straight, flat board
        //when we wrap, we pass go
        while (newPosition > Bank.getInstance().getNumProperties()){
            //pass go
            activePlayer.passGo();
            //wraparound
            newPosition -= Bank.getInstance().getNumProperties();
        }
        activePlayer.setPosition(newPosition);
//See where we landed
        Property landed = Bank.getInstance().getProperty(newPosition);
//Ask: Is it owned?
        if (landed.isOwned()) {
//Yes->PayRent (to the owner, if it's not me?)
            //how much do we pay?
            activePlayer.payRentTo(landed.getOwner(), landed.calcRent());
        } else {
//No->Purchase
            //purchase from bank...
            //we haven't coded that yet...
            // (we need a purchase in the bank...)
        }
//(Purchase Houses/Hotels for our properties (upgrade))
//Advance the current player
        currPlayerIndex++;
        currPlayerIndex %= players.size(); //wraparound if needed
    }
}
