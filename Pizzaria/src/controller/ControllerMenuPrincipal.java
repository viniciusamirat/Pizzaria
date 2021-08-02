/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import view.Cardapio;
import view.CardapioPedido;
import view.MenuPrincipal;

/**
 *
 * @author Casa
 */
public class ControllerMenuPrincipal {
    private final MenuPrincipal view;
    

    public ControllerMenuPrincipal(MenuPrincipal view) {
        this.view = view;
    }

    public void navegarParaCardapio() {
        Cardapio cardapio = new Cardapio();
        cardapio.setVisible(true);
    }

    public void navegarParaCardapioPedido() {
        CardapioPedido cardapioPedido = new CardapioPedido();
        cardapioPedido.setVisible(true);
        
        
    }
    
    
    
}
