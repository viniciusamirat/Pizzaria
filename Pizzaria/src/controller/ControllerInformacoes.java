/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import view.CardapioPedido;
import view.Informacoes;
import view.Resumo;

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
        
        CardapioPedido cardapioPedido = new CardapioPedido();
        cardapioPedido.setVisible(true);
        
        this.informacoes.setVisible(false);
    }

    public void navegarParaResumo() {
        
        Resumo resumo = new Resumo();
        resumo.setVisible(true);
        
        this.informacoes.setVisible(false);
    }
    
}
