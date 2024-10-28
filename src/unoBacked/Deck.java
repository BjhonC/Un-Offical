/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unoBacked;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author bjhon
 */
public class Deck {
    private ArrayList<Card> deck;
    
    
    
    public Deck(){
        deck=new ArrayList<>();
        this.replenishDeck();
    }
    
    private void addNumbered(){
        Value[] num= Value.values();
        for (int i = 0; i < 2; i++) {
            
          for (int j = 0; j < 10; j++) {
        deck.add(new Card(Color.BLUE, num[j]));
        deck.add(new Card(Color.GREEN,num[j] ));
        deck.add(new Card(Color.YELLOW,num[j] ));
        deck.add(new Card(Color.RED, num[j]));
            }        
        }
    }
    private void addSpeacial(){
         Value[] num= Value.values();
        for (int i = 0; i < 2; i++) {
            
          for (int j = 10; j < 13; j++) {
        deck.add(new Card(Color.BLUE, num[j]));
        deck.add(new Card(Color.GREEN,num[j] ));
        deck.add(new Card(Color.YELLOW,num[j] ));
        deck.add(new Card(Color.RED, num[j]));
            }        
        }
    }
    
    private void addBlack(){
        Value[] num= Value.values();
        for (int i = 0; i < 4; i++) {
            for (int j = 14; j < 16; j++) {
            
        deck.add(new Card(Color.WILD, num[j]));
        
            }     
        }
           
    }
    private void replenishDeck(){
        this.addNumbered();
        this.addSpeacial();
        this.addBlack();
        
    }
    
    public Card getCard(){
         Random random = new Random();
         int num=random.nextInt(deck.size());
        if(this.deck.isEmpty()){
            this.replenishDeck();
        }
        Card placeHolder= deck.get(num);
        deck.remove(num);
        return placeHolder;
        
    }
}
