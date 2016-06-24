/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scrabble;

import java.util.concurrent.ThreadLocalRandom;


/**
 *
 * @author CAP
 */
public class InputGenerator {
    
    private int count;
    private Language language; 
    
    public InputGenerator(int count, Language language){
        this.count = count;
        this.language = language;
    }
    
    public String generateInput(){
        StringBuilder stb = null;
        
        for (int i = 0; i < count; i++){
            stb.append(language.getAlphabet()[ThreadLocalRandom.current().nextInt(0, language.getAlphabet().length)]);
        }
        return stb.toString();
    }
   
}
