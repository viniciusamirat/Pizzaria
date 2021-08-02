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
public class ControllerCardapioPedido {
    
    private final CardapioPedido cardapioPedido;

    public ControllerCardapioPedido(CardapioPedido cardapioPedido) {
        this.cardapioPedido = cardapioPedido;
    }

    public void VoltarParaMenu() {
        this.cardapioPedido.setVisible(false);
    }

    public void navegarParaInformacoes() {
        Informacoes informacoes = new Informacoes();
        informacoes.setVisible(true);
        
        cardapioPedido.setVisible(false);
    }
    
    
}
