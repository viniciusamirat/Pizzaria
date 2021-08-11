/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import controller.helper.HelperResumo;
import model.Pedido;
import view.Agradecimento;
import view.Informacoes;
import view.Resumo;

/**
 *
 * @author Casa
 */
public class ControllerResumo {
    
    private final Resumo resumo;
    private final HelperResumo helper;
    
    private Pedido pedido = new Pedido();

    public ControllerResumo(Resumo resumo) {
        this.resumo = resumo;
        this.helper = new HelperResumo(resumo);
    }

    public void voltarParaInformacoes() {
        
        Informacoes informacoes = new Informacoes();
        informacoes.setarPedido(this.pedido);
        informacoes.setVisible(true);
        
        this.resumo.setVisible(false);
    }

    public void confirmarPedido() {
        
        Agradecimento agradecimento = new Agradecimento();
        agradecimento.setarPedido(this.pedido);
        agradecimento.setVisible(true);
        
        this.resumo.setVisible(false);
    }

    public void existeInformacoes() {
        
        if (this.pedido != null){
            
            helper.preencherPizzas(this.pedido);
            helper.preencherInformacoes(this.pedido);
            helper.preencherPagamento(this.pedido);
            
        }
        
    }
    
    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
}
