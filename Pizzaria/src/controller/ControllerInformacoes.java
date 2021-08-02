/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import view.CardapioPedido;
import view.Informacoes;

/**
 *
 * @author Casa
 */
public class ControllerInformacoes {
    
    private final Informacoes informacoes;

    public ControllerInformacoes(Informacoes informacoes) {
        this.informacoes = informacoes;
    }

    public void voltarParaCardapioPedido() {
        this.informacoes.setVisible(false);
        
        CardapioPedido cardapioPedido = new CardapioPedido();
        cardapioPedido.setVisible(true);
    }
    
}
