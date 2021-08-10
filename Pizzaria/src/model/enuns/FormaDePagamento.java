/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.enuns;

/**
 *
 * @author Casa
 */
public enum FormaDePagamento {
    DEBITO(1),
    CREDITO(2),
    DINHEIRO(3);
    
    private final int VALOR;
    
    FormaDePagamento(int valor){
        this.VALOR = valor;
    }

    public int getVALOR() {
        return VALOR;
    }
    
}
