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
    private String[] pizza;
    private Pagamento pagamento;
    private float preco;
    private float troco;
    
    public void calcularTroco(){
        if (pagamento.isPrecisaDeTroco()){
            float trocoCalculado = pagamento.getTrocoPraQuanto() - this.preco;
            setTroco(trocoCalculado);
}
    }

    public String[] getPizza() {
        return pizza;
    }

    public void setPizza(String[] pizza) {
        this.pizza = pizza;
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
