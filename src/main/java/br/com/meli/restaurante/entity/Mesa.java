package br.com.meli.restaurante.entity;

import java.util.List;

public class Mesa {
    private long id;
    private double valorTotal;
    private List<Pedido> pedidos;

    public Mesa(long id, double valorTotal, List<Pedido> pedidos) {
        this.id = id;
        this.valorTotal = valorTotal;
        this.pedidos = pedidos;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public void setPedido(Pedido p) {
        pedidos.add(p);
    }


}
