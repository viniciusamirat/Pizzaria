/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.enuns.FormaDePagamento;

/**
 *
 * @author Casa
 */
public class Pagamento {
    private FormaDePagamento formaDePagamento;
    private boolean precisaDeTroco;
    private double trocoPraQuanto;

    public FormaDePagamento getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(FormaDePagamento formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public boolean isPrecisaDeTroco() {
        return precisaDeTroco;
    }

    public void setPrecisaDeTroco(boolean precisaDeTroco) {
        this.precisaDeTroco = precisaDeTroco;
    }

    public double getTrocoPraQuanto() {
        return trocoPraQuanto;
    }

    public void setTrocoPraQuanto(double trocoPraQuanto) {
        this.trocoPraQuanto = trocoPraQuanto;
    }
    
}
