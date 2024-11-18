/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unoBacked;

/**
 *
 * @author bjhon
 */
public class GamePlay {
    Player[] players;
    Player currentPlayer;
    
    public GamePlay(int num){
        players= new Player[num];
        
    }
    
    public int getTurn(){
        return currentPlayer.getPostion();
    }
    
    
}
