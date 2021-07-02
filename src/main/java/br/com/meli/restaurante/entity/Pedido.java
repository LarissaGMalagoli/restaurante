package br.com.meli.restaurante.entity;

import java.util.List;

public class Pedido {
    private long id;
    private double valorTotal;
    private int mesaID;
    private List<Prato> pratos;

    public Pedido(long id, double valorTotal, List<Prato> pratos, int mesa) {
        this.id = id;
        this.valorTotal = valorTotal;
        this.pratos = pratos;
        this.mesaID = mesa;
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

    public List<Prato> getPratos() {
        return pratos;
    }

    public void setPratos(List<Prato> pratos) {
        this.pratos = pratos;
    }

    public void setPrato(Prato p) {
        pratos.add(p);
    }

    public int getMesaID() {
        return mesaID;
    }

    public void setMesaID(int mesaID) {
        this.mesaID = mesaID;
    }
}

