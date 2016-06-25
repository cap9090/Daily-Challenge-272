/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scrabble;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author CAP
 */
public class Scrabble {

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String[] args) {
        System.out.println("Using the English language...");
        System.out.println("How many tiles do you want?");
        Scanner s = new Scanner(System.in);
        int count = 0;
        try{
             count  = s.nextInt();
             
        } catch(NoSuchElementException e){
        } 
        
        System.out.println("Grabbing " + count + " tiles...");
        
        Language l = new English();
        
        InputGenerator inputGenerator = new InputGenerator(count, l);
        
        String input = inputGenerator.generateInput();
        
        System.out.println("You grabbed the following");
        System.out.println(input);
        
        TileManufacturer tileManufacturer = new TileManufacturer(l);
        Tile [] inPlayTiles = tileManufacturer.generateTiles();
        Tile [] yourTiles = tileManufacturer.generatePlayerTiles();
        
        InputChecker inputChecker = new InputChecker(input,inPlayTiles, yourTiles);
        
        String success = inputChecker.checkAndDistribute();
        if(!success.equals("Valid input")){
            System.out.println(success);;
            System.exit(2);
        }
        
        ArrayList<Tile []> allTiles = new ArrayList<>();
        allTiles.add(yourTiles);
        allTiles.add(inPlayTiles);
        
        Displayer displayer = new Displayer(allTiles);
        displayer.displayDistributionAndScores();
     
                
    }
    
}
