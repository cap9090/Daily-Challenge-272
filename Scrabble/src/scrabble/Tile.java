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
public class Tile {
   
    private char letter;
    private byte freq;
    private byte value;

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public byte getFreq() {
        return freq;
    }

    public void setFreq(byte freq) {
        this.freq = freq;
    }

    public byte getValue() {
        return value;
    }

    public void setValue(byte value) {
        this.value = value;
    }

    public Tile(char letter, byte freq, byte value) {
        this.letter = letter;
        this.freq = freq;
        this.value = value;
    }
    
    
    
    
    
}
