package com.alura.desafio;

import javax.swing.*;
//public class NewClient extends Pregunta {
public class NewClient extends MenuBancario {
    private String nombreNuevoCliente;
    private String cuentaNuevoCliente;
    private double saldoNuevoCliente;

//***************************************************************
    public String getNombreNuevoCliente() {
        return nombreNuevoCliente;
    }
    public void setNombreNuevoCliente(String nombreNuevoCliente) {
        this.nombreNuevoCliente = nombreNuevoCliente;
    }
//***************************************************************
    public String getCuentaNuevoCliente() {
        return cuentaNuevoCliente;
    }
    public void setCuentaNuevoCliente(String cuentaNuevoCliente) {
        this.cuentaNuevoCliente = cuentaNuevoCliente;
    }
//***************************************************************
    public double getSaldoNuevoCliente() {
        return saldoNuevoCliente;
    }
    public void setSaldoNuevoCliente(double saldoNuevoCliente) {
        this.saldoNuevoCliente = saldoNuevoCliente;
    }

//    MenuBancario nuevaOperacion = new MenuBancario();

    public void nuevoDeposito(){
        saldoNuevoCliente = getSaldoNuevoIngresado() + saldoNuevoCliente;
    }
    public void nuevoRetiro(){
        saldoNuevoCliente = saldoNuevoCliente - getSaldoNuevoRetirado();
    }

    @Override
    public void preguntaPrincipal() {
        super.preguntaPrincipal();
    }

    //MOSTRAR SALDO COMPLETO
    public String mostrarDatosCompletos() {
        return String.format("""
                        Informacion Completa: \n
                        Nombre: %s
                        Tipo de Cuenta: %s
                        Saldo disponible: S/ %.2f
                        """,
                getNombreNuevoCliente(), getCuentaNuevoCliente(), getSaldoNuevoCliente());
    }

    public void preguntaClienteNuevo(){
        setNombreNuevoCliente(JOptionPane.showInputDialog(null,"Ingrese su nombre","Informacion",JOptionPane.QUESTION_MESSAGE));

        setCuentaNuevoCliente(JOptionPane.showInputDialog(null,"Ingrese su tipo de Cuenta","Informacion",JOptionPane.QUESTION_MESSAGE));

        setSaldoNuevoCliente(Math.round((Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese su saldo","Informacion",JOptionPane.QUESTION_MESSAGE))*100)/100));

    }

    public void mostrarMenuBancarioNewClient() {
        Object[] opcionesMenuBancarioNewClient = {"Realizar Consulta", "Deposito", "Retiro", "Salir"};

        int menu = JOptionPane.showOptionDialog(null,"Selecciones la operacion deseada",
                "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, opcionesMenuBancarioNewClient, opcionesMenuBancarioNewClient[0]);

        if (menu == 0) {
            JOptionPane.showMessageDialog(null,
                        mostrarDatosCompletos(), "Consulta de Datos",
                        JOptionPane.INFORMATION_MESSAGE);
            mostrarMenuBancarioNewClient();
        } else if (menu == 1) {
            setSaldoNuevoIngresado(Double.parseDouble(JOptionPane.showInputDialog("Cuanto desea depositar?")));
            nuevoDeposito();
            mostrarMenuBancarioNewClient();
        } else if (menu == 2) {
            setSaldoNuevoRetirado(Double.parseDouble(JOptionPane.showInputDialog("Cuanto desea retirar?")));
            if (getSaldoNuevoRetirado() > getSaldoNuevoCliente()) {
                JOptionPane.showMessageDialog(null,
                        "Saldo insuficiente", "Consulta de Datos",
                        JOptionPane.INFORMATION_MESSAGE);
                mostrarMenuBancarioNewClient();
            } else {
                nuevoRetiro();
                mostrarMenuBancarioNewClient();
            }
        }else {
            JOptionPane.showMessageDialog(null,
                    "Gracias por usar nuestro servicios", "Finalizacion",
                    JOptionPane.INFORMATION_MESSAGE);
            preguntaPrincipal();
        }
    }
}


