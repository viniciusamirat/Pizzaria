/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.helper;

import model.Pedido;
import view.Resumo;

/**
 *
 * @author Casa
 */
public class HelperResumo {
    
    private final Resumo view;

    public HelperResumo(Resumo view) {
        this.view = view;
    }

    public void preencherPizzas(Pedido pedido) {
        
        String pizzas = "<html>";
        
        for (String pizza : pedido.getPizzas()){
            
            if (pizza != null){
                pizzas += "*" + pizza + "<br>";
            }
            
        }
        
        pizzas += "</html>";
        
        view.getLblPizzas().setText(pizzas);
        
    }

    public void preencherInformacoes(Pedido pedido) {
        
        String informacoes = "<html>";
        
        informacoes += "Nome: " + pedido.getCliente().getNome() + "<br>";
        informacoes += "Telefone: " + pedido.getCliente().getTelefone() + "<br>";
        informacoes += "Bairro: " + pedido.getCliente().getBairro() + "<br>";
        informacoes += "Rua: " + pedido.getCliente().getRua() + "<br>";
        informacoes += "Número: " + pedido.getCliente().getNumeroResidencia() + "<br>";
        
        informacoes += "</html>";
        
        view.getLblInformacoes().setText(informacoes);
        
    }

    public void preencherPagamento(Pedido pedido) {
        
        String pagamento = "<html>";
        
        pagamento += "Forma de pagamento: " + pedido.getPagamento().getFormaDePagamento() + "<br>";
        pagamento += "Precisa de troco: " + pedido.getPagamento().isPrecisaDeTroco() + "<br>";
        pagamento += "Troco pra quanto: " + pedido.getPagamento().getTrocoPraQuanto() + "<br><br>";
        
        pagamento += "Total a pagar: " + pedido.getPreco() + "<br>";
        pagamento += "total de troco: " + pedido.getTroco();
        
        pagamento += "</html>";
        
        view.getLblPagamento().setText(pagamento);
    }
    
    
}
