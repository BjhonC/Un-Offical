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
        return handCard.getColor().equals(pileCard.getColor())|| handCard.getValue().equals(pileCard.getValue());   
    }
    
}
