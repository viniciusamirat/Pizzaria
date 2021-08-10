/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import controller.helper.HelperInformacoes;
import model.Cliente;
import model.Pagamento;
import model.Pedido;
import view.CardapioPedido;
import view.Informacoes;
import view.Resumo;

/**
 *
 * @author Casa
 */
public class ControllerInformacoes {
    
    private final Informacoes informacoes;
    private final HelperInformacoes helper;
    private Pedido pedido = new Pedido();

    public ControllerInformacoes(Informacoes informacoes) {
        this.informacoes = informacoes;
        this.helper = new HelperInformacoes(informacoes);
        
        this.pedido.setTroco(0);
    }

    public void voltarParaCardapioPedido() {
        
        CardapioPedido cardapioPedido = new CardapioPedido();
        cardapioPedido.setarPedido(this.pedido);
        cardapioPedido.setVisible(true);
        
        this.informacoes.setVisible(false);
    }

    public void navegarParaResumo() {
        
        Pagamento pagamento = new Pagamento();
        pagamento = helper.obterPagamento();
        this.pedido.setPagamento(pagamento);
        
        if (pedido.getPagamento().isPrecisaDeTroco()){
            this.pedido.calcularTroco();
        }
        
        Cliente cliente = new Cliente();
        cliente = helper.obterCliente();
        this.pedido.setCliente(cliente);
        
        Resumo resumo = new Resumo();
        resumo.setarPedido(this.pedido);
        resumo.setVisible(true);
        
        this.informacoes.setVisible(false);
    }

    public void esconderCamposTroco() {
        
        helper.esconderPrecisaDeTroco();
        helper.esconderTrocoParaQuanto();
    }

    public void pagar() {
        
        if (informacoes.getRadioDinheiro().isSelected()){
            helper.mostrarPrecisaDeTroco();
        } else {
            helper.esconderPrecisaDeTroco();
            helper.esconderTrocoParaQuanto();
        }
    }

    public void precisaDeTroco() {
        
        if (informacoes.getRadioSim().isSelected()){
            helper.mostrarTrocoParaQuanto();
        } else {
            helper.esconderTrocoParaQuanto();
        }
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public void existeInformacoes() {
        
        if ((this.pedido.getCliente() != null) && (this.pedido.getPagamento() != null)){
            
            helper.preencherCliente(this.pedido);
            helper.preencherPagamento(this.pedido);
            
        }
        
    }
    
    
}
