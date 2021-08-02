/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import view.Cardapio;

/**
 *
 * @author Casa
 */
public class ControllerCardapio {
    
    private final Cardapio cardapio;

    public ControllerCardapio(Cardapio cardapio) {
        this.cardapio = cardapio;
    }

    
    public void voltarParaMenu() {
        this.cardapio.setVisible(false);
    }
    
}
