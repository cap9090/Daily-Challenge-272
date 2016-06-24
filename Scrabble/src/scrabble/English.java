/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scrabble;

/**
 *
 * @author CAP
 */
public class English implements Language{
    
    
    char [] alphabet  = {'A' , 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q','R', 'S', 'T' , 'U','V','W','X','Y','Z','_'
    };
    byte [] freq ={9, 2, 2, 4, 12, 2, 3, 2, 9 , 1, 1 ,4, 2, 6, 8, 2, 1 ,6, 4, 6, 4 , 2, 2, 1, 2, 1,2};
    byte [] value = {1, 3,3, 2,1,4,2,4,1,8,5,1,3,1,1,3, 10,1,1,1,1,4,4,8,4,10, 0};
    
   
    
    public int getCount(){
        return alphabet.length;
    }

    public char[] getAlphabet() {
        return alphabet;
    }

    public byte[] getFreq() {
        return freq;
    }

    public byte[] getValue() {
        return value;
    }
    
    
}
