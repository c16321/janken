/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author c16321
 */
import java.util.Scanner;
import java.util.Random;

public class JankenTester {
    
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        Random rnd = new Random();
        int cp, plyr;
        
        cp = rnd.nextInt(9)+1;

        System.out.print("じゃんけん...[グー/0  チョキ/1  パー/2]>>>");
        plyr = stdIn.nextInt();
        
        Janken Player = new Player(plyr);
        Janken Cp = new Cp(cp);
        
        Player.pon();
        Cp.pon();
        
        if(Player.getHand() == Cp.getHand()%3)
            System.out.println("引き分け。");
        else if(Cp.getHand()%3 == Player.getHand()-1 || Cp.getHand()%3 == Player.getHand()+2 )
            System.out.println("負け");
        else 
            System.out.println("勝ち。");
        
    }
    
}

