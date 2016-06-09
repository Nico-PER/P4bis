/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author p1501719
 */
public class DisappearEffect extends Effect {

    /**
     * Cree une case vide tout le temps
     * @param line
     * @param column
     * @param game
     */
    @Override
    public void playEffect(int line, int column, Game game) {

        int tile_id = game.getBoard().getTileIJ(line, column).getStatus();
        
            tile_id = -1;
        game.getBoard().getTileIJ(line, column).setStatus(tile_id);
    }


    
}
