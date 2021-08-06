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
    private String[] pizzas = new String[9];
    private Pagamento pagamento;
    private float preco;
    private float troco;
    private int tempoEmMinutos;
    
    public void calcularTroco(){
        
        float trocoCalculado = pagamento.getTrocoPraQuanto() - this.preco;
        setTroco(trocoCalculado);
    }

    public int getTempoEmMinutos() {
        return tempoEmMinutos;
    }

    public void setTempoEmMinutos(int tempoEmMinutos) {
        this.tempoEmMinutos = tempoEmMinutos;
    }

    public String[] getPizzas() {
        return pizzas;
    }

    public void setPizzas(String[] pizza) {
        this.pizzas = pizza;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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
