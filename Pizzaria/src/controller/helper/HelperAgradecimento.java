/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.helper;

import view.Agradecimento;

/**
 *
 * @author Casa
 */
public class HelperAgradecimento {
    
    private final Agradecimento view;

    public HelperAgradecimento(Agradecimento view) {
        this.view = view;
    }

    public void mostrarTempo(int tempoEmMinutos) {
        
        view.getLblTituloTempo().setText("em " + tempoEmMinutos + " minutos");
        
                
    }
    
    
    
}
