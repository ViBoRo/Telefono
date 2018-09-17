package com.example.vicent.telefono;

public class Telefono {
    private Integer numero;
    private String tipo;

    public Telefono(String tipo, Integer num){
        this.numero=num;
        this.tipo=tipo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
