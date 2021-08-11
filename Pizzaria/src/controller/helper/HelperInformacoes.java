/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.helper;

import static controller.helper.FormatarPreco.formatarParaDouble;
import model.Cliente;
import model.Pagamento;
import model.Pedido;
import model.enuns.FormaDePagamento;
import view.Informacoes;

/**
 *
 * @author Casa
 */
public class HelperInformacoes {
    
    private final Informacoes view;

    public HelperInformacoes(Informacoes view) {
        this.view = view;
    }

    public void esconderPrecisaDeTroco() {
        
        view.getLblTroco().setVisible(false);
        view.getRadioSim().setVisible(false);
        view.getRadioNao().setVisible(false);
        
        view.getRadioNao().setSelected(true);
    }

    public void esconderTrocoParaQuanto() {
        
        view.getLblTrocoQuanto().setVisible(false);
        view.getTxtTroco().setVisible(false);
        
        view.getTxtTroco().setText("");
    }

    public void mostrarPrecisaDeTroco() {
        
        view.getLblTroco().setVisible(true);
        view.getRadioSim().setVisible(true);
        view.getRadioNao().setVisible(true);
    }

    public void mostrarTrocoParaQuanto() {
        
        view.getLblTrocoQuanto().setVisible(true);
        view.getTxtTroco().setVisible(true);
    }

    public Pagamento obterPagamento() {
        
        Pagamento pagamento = new Pagamento();
        
        if (view.getRadioCredito().isSelected()){
            
            pagamento.setFormaDePagamento(FormaDePagamento.CREDITO);
            pagamento.setPrecisaDeTroco(false);
            
        } else if (view.getRadioDebito().isSelected()) {
            
            pagamento.setFormaDePagamento(FormaDePagamento.DEBITO);
            pagamento.setPrecisaDeTroco(false);
        } else {
            
            pagamento.setFormaDePagamento(FormaDePagamento.DINHEIRO);
            
            if (view.getRadioSim().isSelected()){
                pagamento.setPrecisaDeTroco(true);
                pagamento.setTrocoPraQuanto(formatarParaDouble(view.getTxtTroco().getText()));
            }
            
        }
        
        return pagamento;
    }

    public Cliente obterCliente() {
        
        Cliente cliente = new Cliente();
        
        cliente.setNome(view.getTxtNome().getText());
        cliente.setTelefone(view.getTxtTelefone().getText());
        cliente.setBairro(view.getTxtBairro().getText());
        cliente.setRua(view.getTxtRua().getText());
        cliente.setNumeroResidencia(view.getTxtNumero().getText());
        
        return cliente;
        
    }

    public void preencherCliente(Pedido pedido) {
        
        view.getTxtNome().setText(pedido.getCliente().getNome());
        view.getTxtTelefone().setText(pedido.getCliente().getTelefone());
        view.getTxtBairro().setText(pedido.getCliente().getBairro());
        view.getTxtRua().setText(pedido.getCliente().getRua());
        view.getTxtNumero().setText(pedido.getCliente().getNumeroResidencia());
        
    }

    public void preencherPagamento(Pedido pedido) {
        
        switch (pedido.getPagamento().getFormaDePagamento().getVALOR()) {
            case 1:
                view.getRadioDebito().setSelected(true);
                break;
            case 2:
                view.getRadioCredito().setSelected(true);
                break;
            case 3:
                view.getRadioDinheiro().setSelected(true);
                
                if (pedido.getPagamento().isPrecisaDeTroco()){
                    
                    view.getRadioSim().setSelected(true);
                    view.getTxtTroco().setText(pedido.getPagamento().getTrocoPraQuanto() + "");
                    
                    mostrarPrecisaDeTroco();
                    mostrarTrocoParaQuanto();
                    
                }
                break;
        }
        
    }
    
    
}
