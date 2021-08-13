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
public class Pedido implements InterfacePedido{
    private Cliente cliente;
    private String[] pizzas = new String[9];
    private Pagamento pagamento;
    private double preco;
    private double troco;
    private int tempoEmMinutos = 0;
    
    @Override
    public void calcularTroco(){
        
        double trocoCalculado = pagamento.getTrocoPraQuanto() - this.preco;
        setTroco(trocoCalculado);
    }
    
    @Override
    public void zerarTroco() {
        
        setTroco(0f);
        
    }
    
    @Override
    public void calcularTempo(){
        
        for (String pizza : this.pizzas){
            
            if (pizza != null){
                this.tempoEmMinutos += 30;
            }
            
        }
        
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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getTroco() {
        return troco;
    }

    public void setTroco(double troco) {
        this.troco = troco;
    }

    
    
    
}
