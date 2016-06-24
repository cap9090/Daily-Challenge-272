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
public interface Language {
    
    public int getCount();
    
    public char [] getAlphabet();
    public byte [] getFreq();
    public byte [] getValue();
    
}
