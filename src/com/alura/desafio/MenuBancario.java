package com.alura.desafio;
import javax.swing.*;

public class MenuBancario {
//                          CLIENTE

    private double saldoRetirado;
    private double saldoNuevoRetirado;
    private double saldoIngresado;
    private double saldoNuevoIngresado;

    public double getSaldoIngresado() {
        return saldoIngresado;
    }
    public void setSaldoIngresado(double saldoIngresado) {
        this.saldoIngresado = saldoIngresado;
    }
    //***************************************************************
    public double getSaldoRetirado() {
        return saldoRetirado ;
    }
    public void setSaldoRetirado(double saldoRetirado) {
        this.saldoRetirado = saldoRetirado;
    }



//**********************************************************************************
    //                  NUEVO CLIENTE

    public double getSaldoNuevoRetirado() {
        return saldoNuevoRetirado;
    }

    public void setSaldoNuevoRetirado(double saldoNuevoRetirado) {
        this.saldoNuevoRetirado = saldoNuevoRetirado;
    }
    //***************************************************************
    public double getSaldoNuevoIngresado() {
        return saldoNuevoIngresado;
    }

    public void setSaldoNuevoIngresado(double saldoNuevoIngresado) {
        this.saldoNuevoIngresado = saldoNuevoIngresado;
    }




//**************************************************************************
    private String nombreCliente = "Tony Stark";
    private  String tipoDeCuenta = "Corriente";
    private double saldoCliente = 1599.99;

    public String getNombreCliente() {
        return nombreCliente;
    }
    public String getTipoDeCuenta() {
        return tipoDeCuenta;
    }
    public double getSaldoCliente() {
        return saldoCliente;
    }
    public void deposito(){
        saldoCliente = saldoIngresado + saldoCliente;
    }
    public void retiro(){
        saldoCliente = saldoCliente - saldoRetirado;
    }

















//    private String consultaDeDatos;

    private int seleccion;
    public int getSeleccion() {
        return seleccion;
    }
    public void setSeleccion(int seleccion) {
        this.seleccion = seleccion;
    }

    public void preguntaPrincipal(){
        setSeleccion(JOptionPane.showConfirmDialog(null, "¿Es usted cliente nuevo?", "Confirmación", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE));

        if(getSeleccion() == JOptionPane.YES_OPTION) {
            NewClient clienteNuevo = new NewClient();
            clienteNuevo.preguntaClienteNuevo();
            clienteNuevo.mostrarMenuBancarioNewClient();


        } else if (getSeleccion() == JOptionPane.NO_OPTION) {
            ClientDefault clienteRecurrente = new ClientDefault();
            clienteRecurrente.mostrarMenuBancarioClient();

        } else {
            JOptionPane.showMessageDialog(null,
                    "Gracias por usar nuestro servicios", "Finalizacion",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }



//****************          MENU PARA CLIENTE NUEVO


//****************          MENU PARA CLIENTE












}