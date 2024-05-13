package com.alura.desafio;

import javax.swing.*;

public class NewClient extends MenuBancario{
    private String nombreNuevoCliente;
    private String cuentaNuevoCliente;
    private double saldoNuevoCliente;

    public String setNombrenuevoCliente(String nombreNuevoCliente) {
        nombreNuevoCliente = JOptionPane.showInputDialog(null,"Ingrese su nombre","Informacion",JOptionPane.QUESTION_MESSAGE);
        return nombreNuevoCliente;
    }

    public String getNombreNuevoCliente() {
        return nombreNuevoCliente;
    }


//    private String cuentaNuevoCliente;
//    private double saldoNuevoCliente;

//*********************************************

//*********************************************
//    public String getCuentaNuevoCliente() {
//        return cuentaNuevoCliente;
//    }
//*********************************************
//    public double getSaldoNuevoCliente() {
//        return saldoNuevoCliente;
//    }

    public void consultaNuevosDatos(){
        System.out.printf("""
            *********************************************
            \nNombre del Cliente: %s
            """,nombreNuevoCliente);
    }
}
//
//    Tipo de cuenta: %s
//    Saldo Disponible: $ %1.2f
