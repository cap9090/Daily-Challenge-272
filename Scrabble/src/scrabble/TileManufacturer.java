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
public class TileManufacturer {
    
    private Language language;

    public TileManufacturer(Language language) {
        this.language = language;
    }

    
    public Tile [] generateTiles(){
        Tile [] tiles = new Tile[language.getCount()];
        for (int i = 0 ; i < tiles.length; i++){
            tiles[i] = new Tile(language.getAlphabet()[i], language.getFreq()[i], language.getValue()[i]);
        }
        return tiles;
    }
    
    
    
    
   
    
}
