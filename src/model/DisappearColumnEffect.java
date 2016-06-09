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
public class DisappearColumnEffect extends Effect {

    /**
     * Supprime une colonne
     * @param line
     * @param column
     * @param game
     */
    @Override
    public void playEffect(int line, int column, Game game) {

        int tile_id = game.getBoard().getTileIJ(line, column).getStatus();
        
        for (int i=0;i<game.getBoard().getHeight();i++){
            game.getBoard().getTileIJ(i,column).setStatus(-1);
        }
            
    }
}
