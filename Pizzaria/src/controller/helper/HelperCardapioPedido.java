/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.helper;

import view.CardapioPedido;

/**
 *
 * @author Casa
 */
public class HelperCardapioPedido {
    
    private final CardapioPedido view;

    public HelperCardapioPedido(CardapioPedido view) {
        this.view = view;
    }

    public void somarCampoTotal(double preco) {
        
        double precoDoCampo = 0.0;
        
        if (!view.getTxtTotal().getText().equals("")){
            precoDoCampo = Double.parseDouble(view.getTxtTotal().getText());
        }
        
        double precoSomado = precoDoCampo + preco;
        
        view.getTxtTotal().setText(precoSomado + "");
    }

    public void subtrairCampoTotal(double preco) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
