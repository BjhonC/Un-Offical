/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unoBacked;

import java.util.ArrayList;

/**
 *
 * @author bjhon
 */
public class Player {
        private ArrayList<Card> playerHand;
        private int position;
        
     public Player(int pos){
         playerHand= new ArrayList<>();
         this.position=pos;
     }
     
     public void setPosition(int pos){
         this.position=pos;
     }
     
     public int getPostion(){
         return this.position;
     }
     public ArrayList<Card> getHand(){
         return this.playerHand;
     }
     public Card giveCard(int num){
         Card placeHolder= playerHand.get(num);
        playerHand.remove(num);
        return placeHolder;
     }
     public void setCard(Card card){
         this.playerHand.add(card);
     }
}
