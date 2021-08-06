/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import controller.helper.HelperCardapioPedido;
import javax.swing.JCheckBox;
import model.Pedido;
import view.CardapioPedido;
import view.Informacoes;

/**
 *
 * @author Casa
 */
public class ControllerCardapioPedido {
    
    private final CardapioPedido cardapioPedido;
    private final HelperCardapioPedido helper;
    
    private Pedido pedido = new Pedido();
    private String pizzas[] = new String[9];
    
    public ControllerCardapioPedido(CardapioPedido cardapioPedido) {
        this.cardapioPedido = cardapioPedido;
        this.helper = new HelperCardapioPedido(cardapioPedido);
    }

    public void VoltarParaMenu() {
        this.cardapioPedido.setVisible(false);
    }

    public void navegarParaInformacoes() {
        
        this.pedido.setPreco(Float.parseFloat(helper.obterPreco()));
        
        Informacoes informacoes = new Informacoes();
        informacoes.setarPedido(pedido);
        informacoes.setVisible(true);
        
        cardapioPedido.setVisible(false);
    }

    public void clicarNaPizza(JCheckBox checkBoxPizza, double preco, int numeroDaPizza) {
        
        if (checkBoxPizza.isSelected()){
            helper.somarCampoTotal(preco);
            
            adicionarPizza(numeroDaPizza, checkBoxPizza.getText());
        } else {
            helper.subtrairCampoTotal(preco);
            
            removerPizza(numeroDaPizza);
        }
    }
    
    private void adicionarPizza(int numeroDaPizza, String nomeDaPizza){
        
        pizzas[numeroDaPizza - 1] = nomeDaPizza;
        pedido.setPizzas(pizzas);
        
    }
    
    private void removerPizza(int numeroDaPizza){
        
        pizzas[numeroDaPizza - 1] = null;
        pedido.setPizzas(pizzas);
    }

    public void existePizzasSelecionadas() {
        
        for (String pizza : pedido.getPizzas()){
            if (pizza != null){
                helper.preencherPizzasSelecionadas(this.pedido);
                break;
            }
        }
        
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    
    
}
