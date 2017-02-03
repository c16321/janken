/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author c16321
 */
 public class Cp extends Janken{
    private int hand;
    
    Cp(int hand){
        this.hand = hand;
    }
    
    @Override
    int getHand(){ return hand; }
    
    @Override
    void pon(){
        int result = hand % 3;
        if(result == 0)
            System.out.println("cp:グー");
        else if(result == 1)
            System.out.println("cp:チョキ");
        else
            System.out.println("cp:パー");
    }
}
