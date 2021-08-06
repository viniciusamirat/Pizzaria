/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.helper;

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
    
    
}
