/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import view.Informacoes;
import view.Resumo;

/**
 *
 * @author Casa
 */
public class ControllerResumo {
    
    private final Resumo resumo;

    public ControllerResumo(Resumo resumo) {
        this.resumo = resumo;
    }

    public void voltarParaInformacoes() {
        this.resumo.setVisible(false);
        
        Informacoes informacoes = new Informacoes();
        informacoes.setVisible(true);
    }
    
    
}
