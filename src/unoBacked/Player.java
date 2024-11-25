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
        private String name;
     public Player(int pos, String name){
         playerHand= new ArrayList<>();
         this.position=pos;
         this.name= name;
     }
     public String getName(){
         return this.name;
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
     
     public ArrayList<String> getListString(){
         ArrayList<String> cards= new ArrayList<>();
         for(Card cardName:this.playerHand){
             cards.add(cardName.toString());
         }
         return cards;
     }
     public Card giveCard(int num){
       if (num >= 0 && num < playerHand.size()) {
        Card placeHolder = playerHand.get(num);
        playerHand.remove(num);
        return placeHolder;
    } else {
        throw new IndexOutOfBoundsException("Card index out of bounds");
    }
     }
     public void setCard(Card card){
         this.playerHand.add(card);
     }
}
