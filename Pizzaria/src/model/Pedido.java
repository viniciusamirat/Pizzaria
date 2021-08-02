/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Casa
 */
public class Pedido {
    private Cliente cliente;
    private Pizza pizza;
    private Pagamento pagamento;
    private float preco;
    private float troco;
    
    public void calcularTroco(){
        if (pagamento.isPrecisaDeTroco()){
            float trocoCalculado = pagamento.getTrocoPraQuanto() - this.preco;
            setTroco(trocoCalculado);
        }
    }
    
    public float calcularPre

    public Pedido(Cliente cliente, Pizza pizza, Pagamento formaDePagamento) {
        this.cliente = cliente;
        this.pizza = pizza;
        this.pagamento = formaDePagamento;
        
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public Pagamento getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(Pagamento formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float getTroco() {
        return troco;
    }

    public void setTroco(float troco) {
        this.troco = troco;
    }
    
    
}
