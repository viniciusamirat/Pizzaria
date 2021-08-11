/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.helper;

import static controller.helper.FormatarPreco.formatarParaReais;
import static controller.helper.FormatarPreco.formatarReaisParaDouble;
import model.Pedido;
import view.CardapioPedido;

/**
 *
 * @author Casa
 */
public class HelperCardapioPedido{
    
    private final CardapioPedido view;

    public HelperCardapioPedido(CardapioPedido view) {
        this.view = view;
    }

    public void somarCampoTotal(double preco) {
        
        double precoDoCampoDouble = formatarReaisParaDouble(view.getTxtTotal().getText());
        
        double precoSomado = precoDoCampoDouble + preco;
        
        String precoSomadoEFormatado = formatarParaReais(precoSomado);
        
        view.getTxtTotal().setText(precoSomadoEFormatado);
    }

    public void subtrairCampoTotal(double preco) {
        
        double precoDoCampoDouble = formatarReaisParaDouble(view.getTxtTotal().getText());
        
        double precoSubtraido = precoDoCampoDouble - preco;
        
        String precoSubtraidoEFormatado = formatarParaReais(precoSubtraido);
        
        view.getTxtTotal().setText(precoSubtraidoEFormatado);
    }

    public void preencherPizzasSelecionadas(Pedido pedido) {
        
        String pizzas[] = pedido.getPizzas();
        
        if(pizzas[0] != null){
            view.getCheckBoxPizza1().setSelected(true);
        }
        
        if(pizzas[1] != null){
            view.getCheckBoxPizza2().setSelected(true);
        }
        
        if(pizzas[2] != null){
            view.getCheckBoxPizza3().setSelected(true);
        }
        
        if(pizzas[3] != null){
            view.getCheckBoxPizza4().setSelected(true);
        }
        
        if(pizzas[4] != null){
            view.getCheckBoxPizza5().setSelected(true);
        }
        
        if(pizzas[5] != null){
            view.getCheckBoxPizza6().setSelected(true);
        }
        
        if(pizzas[6] != null){
            view.getCheckBoxPizza7().setSelected(true);
        }
        
        if(pizzas[7] != null){
            view.getCheckBoxPizza8().setSelected(true);
        }
        
        if(pizzas[8] != null){
            view.getCheckBoxPizza9().setSelected(true);
        }
        
        
        view.getTxtTotal().setText(String.valueOf(pedido.getPreco()));
    }

    public double obterPreco() {
        
        return formatarReaisParaDouble(view.getTxtTotal().getText());
        
    }
    
    
    
}
