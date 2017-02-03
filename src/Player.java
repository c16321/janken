/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author c16321
 */

public class Player extends Janken{
    private int hand;
    
    Player(int hand){
        this.hand = hand;
    }
    
    @Override
    int getHand(){ return hand; }
    
    @Override
    void pon(){
        switch(hand+1){
            case 1: System.out.println("Player:グー"); break;
            case 2: System.out.println("Player:チョキ"); break;
            case 3: System.out.println("Player:パー"); break;
        }
    }
    
    
}