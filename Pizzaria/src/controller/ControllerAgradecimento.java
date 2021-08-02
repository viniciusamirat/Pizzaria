/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import view.Agradecimento;

/**
 *
 * @author Casa
 */
public class ControllerAgradecimento {
    
    private final Agradecimento agradecimento;

    public ControllerAgradecimento(Agradecimento agradecimento) {
        this.agradecimento = agradecimento;
    }

    public void navegarParaMenu() {
        
        this.agradecimento.setVisible(false);
    }
    
}
