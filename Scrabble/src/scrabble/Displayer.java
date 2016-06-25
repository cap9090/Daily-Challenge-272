/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scrabble;

import java.util.ArrayList;

/**
 *
 * @author CAP
 */


public class Displayer {
    
    
    private ArrayList<Tile []> allPlayers;
    
    public Displayer(ArrayList<Tile []> allPlayers){
        this.allPlayers = allPlayers;
    }
    
    public void displayScores(){
        
    }
    
    public void displayDistributionAndScores(){
        int maxFreq = 12; //this for english only...and thus shouldn't be here and really shoudl be encapsulated in a English object
        int count = 1;
        
        
        
        for (Tile[] tiles: allPlayers){
            int score = 0;
            System.out.println();
            if(count == allPlayers.size())
                System.out.println("INPLAY");
            else
                System.out.println("Player" + count);
            int curFreq = maxFreq;
            while (curFreq > -1){            
                boolean firstDone = false;

                for (int i = 0; i < tiles.length; i++ ){
                    if(curFreq == tiles[i].getFreq()){
                        if(!firstDone){
                            firstDone = true;
                            System.out.print("" + curFreq +": ");
                        }
                        score += tiles[i].getValue() * curFreq;
                        System.out.print("" + tiles[i].getLetter() + " ");
                    } 
                }  
                if(firstDone)
                        System.out.println();
                curFreq--;   
            } count++; System.out.println("SCORE: " + score);
        }
        
    }
    
    
}
