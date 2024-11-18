/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unoBacked;

/**
 *
 * @author bjhon
 */
public class Card {
    private final Color cardColor;
    private final Value cardValue;
    
   public Card(Color color, Value value){
       this.cardColor=color;
       this.cardValue= value;
       
   }
   
   public Color getColor(){
       return this.cardColor;
   }
   
   public Value getValue(){
       return this.cardValue;
   }
   public String getImagePath(){
       return "/pics/Uno_Card/"+this.getColor()+"_"+this.getValue()+".png";
   }
   @Override
    public String toString() {
        
        return this.getColor() + " " + this.getValue();
    }
}
