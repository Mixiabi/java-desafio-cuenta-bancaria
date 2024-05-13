package com.alura.desafio;

public class ClientDefault extends MenuBancario{

    private String nombreCliente = "Tony Stark";
    private String tipoDeCuenta = "Corriente";
    private double saldo = 1599.99;

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getTipoDeCuenta() {
        return tipoDeCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void consultaDatos(){
        System.out.printf("""
            *********************************************
            \nNombre del Cliente: %s
            Tipo de cuenta: %s
            Saldo Disponible: $ %1.2f
            """,getNombreCliente(), getTipoDeCuenta(), getSaldo());
    }

}
