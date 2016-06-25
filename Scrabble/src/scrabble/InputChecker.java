/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scrabble;

/**
 *
 * @author test
 */
public class InputChecker {
    
    private String input;
    private Tile [] inPlayTiles, yourTiles;

    public InputChecker(String input, Tile [] inPlayTiles, Tile[] yourTiles) {
        this.input = input;
        this.inPlayTiles = inPlayTiles;
        this.yourTiles = yourTiles;
        
        
    }
    
    
   public String checkAndDistribute(){
       
       char c = 0;
       int index = 0;
       for (int i = 0 ; i < input.length(); i ++){
           c = input.charAt(i);
           boolean flag = true;
           for ( int j = 0; j < inPlayTiles.length && flag; j++){
               
               if(inPlayTiles[j].getLetter() == c && inPlayTiles[j].getFreq() == 0){
                    return "Invalid input. More " + Character.toUpperCase(c) + "'s have been taken from the bag than possible.";
               }
               
               if(inPlayTiles[j].getLetter() == c && inPlayTiles[j].getFreq() > 0){
                   inPlayTiles[j].setFreq((byte)(inPlayTiles[j].getFreq()-1));
                   yourTiles[j].setFreq((byte)(yourTiles[j].getFreq() + 1));
                   flag = false;
               }
               
               
           }
       }
       
        return "Valid input";
      }
    
    
}
