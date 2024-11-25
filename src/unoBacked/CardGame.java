/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unoBacked;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bjhon
 */
public class CardGame {
    private List<Player> players;
    private int currentPlayerIndex;
    private int direction; 

    public CardGame(List<Player> playerNames,int firstPlayer) {
        this.players = new ArrayList<>(playerNames);
        this.currentPlayerIndex = firstPlayer;
        this.direction = 1; 
    }
    public int getcurrentPlayer(){
        return this.currentPlayerIndex;
    }
    // Method to proceed to the next player's turn
    public int nextTurn() {
        return currentPlayerIndex = (currentPlayerIndex + direction + players.size()) % players.size();
        //System.out.println("It's " + players.get(currentPlayerIndex) + "'s turn.");
    }
     public int nextTurnNoPlay() {
        return (currentPlayerIndex + direction + players.size()) % players.size();
        //System.out.println("It's " + players.get(currentPlayerIndex) + "'s turn.");
    }

    // Method to reverse the turn order
    public void playReverseCard() {
        direction *= -1;
        
    }
    
    public void playSkipcard(){
        nextTurn();
    }

    
    
}
