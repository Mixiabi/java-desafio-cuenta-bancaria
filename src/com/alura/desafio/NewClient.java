package com.alura.desafio;

public class NewClient extends MenuBancario{
    private String nombreNuevoCliente;
    private String cuentaNuevoCliente;
    private double saldoNuevoCliente;

//*********************************************
    public String getNombreNuevoCliente() {
        return nombreNuevoCliente;
    }

    public void setNombreNuevoCliente(String nombreNuevoCliente) {
        this.nombreNuevoCliente = nombreNuevoCliente;
    }
//*********************************************
    public String getCuentaNuevoCliente() {
        return cuentaNuevoCliente;
    }

    public void setCuentaNuevoCliente(String cuentaNuevoCliente) {
        this.cuentaNuevoCliente = cuentaNuevoCliente;
    }
//*********************************************
    public double getSaldoNuevoCliente() {
        return saldoNuevoCliente;
    }

    public void setSaldoNuevoCliente(double saldoNuevoCliente) {
        this.saldoNuevoCliente = saldoNuevoCliente;
    }
    public void consultaNuevosDatos(){
        System.out.printf("""
            *********************************************
            \nNombre del Cliente: %s
            Tipo de cuenta: %s
            Saldo Disponible: $ %1.2f
            """,getNombreNuevoCliente(), getCuentaNuevoCliente(),  getSaldoNuevoCliente());
    }
}
