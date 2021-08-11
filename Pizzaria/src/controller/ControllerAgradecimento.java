/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import controller.helper.HelperAgradecimento;
import model.Pedido;
import view.Agradecimento;

/**
 *
 * @author Casa
 */
public class ControllerAgradecimento {
    
    private final Agradecimento agradecimento;
    private final HelperAgradecimento helper;
    
    private Pedido pedido = new Pedido();

    public ControllerAgradecimento(Agradecimento agradecimento) {
        this.agradecimento = agradecimento;
        this.helper = new HelperAgradecimento(agradecimento);
    }

    public void navegarParaMenu() {
        
        this.agradecimento.setVisible(false);
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
        
        helper.mostrarTempo(this.pedido.getTempoEmMinutos());
    }
}
