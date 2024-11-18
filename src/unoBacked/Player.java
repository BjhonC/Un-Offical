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
     public Card giveCard(int num){
         Card placeHolder= playerHand.get(num);
        playerHand.remove(num);
        return placeHolder;
     }
     public void setCard(Card card){
         this.playerHand.add(card);
     }
}
