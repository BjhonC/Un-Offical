/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unoBacked;

/**
 *
 * @author bjhon
 */
public class Rules {
    
    
    public  boolean canPlay(Card handCard, Card pileCard){
        if(handCard.getColor()==Color.BLACK){
            return true;
        }
        if(handCard.getColor()==pileCard.getColor()|| handCard.getValue()==pileCard.getValue()){
            return  true;
        }
        return false;   
    }
    
}
