package com.alura.desafio;
import javax.swing.*;

public class ClientDefault extends MenuBancario {

    @Override
    public void retiro() {
        super.retiro();
    }

    @Override
    public void deposito() {
        super.deposito();
    }

    @Override
    public void preguntaPrincipal() {
        super.preguntaPrincipal();
    }

    public String consultaClient() {
        return String.format("""
                Informacion Completa: \n
                Nombre: %s
                Tipo de Cuenta: %s
                Saldo disponible: S/ %.2f
                """, getNombreCliente(), getTipoDeCuenta(), getSaldoCliente());
    }


    public void mostrarMenuBancarioClient() {

        Object[] opcionesMenuBancarioClient = {"Realizar Consulta", "Deposito", "Retiro", "Salir"};

        int menu = JOptionPane.showOptionDialog(null,"Selecciones la operacion deseada",
                    "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, opcionesMenuBancarioClient, opcionesMenuBancarioClient[0]);

        if (menu == 0) {
            JOptionPane.showMessageDialog(null,
                    consultaClient(), "Consulta de Datos",
                    JOptionPane.INFORMATION_MESSAGE);
            mostrarMenuBancarioClient();
        } else if (menu == 1) {
            setSaldoIngresado(Double.parseDouble(JOptionPane.showInputDialog("Cuanto desea depositar?")));
            deposito();
            mostrarMenuBancarioClient();
        } else if (menu == 2){
            setSaldoRetirado(Double.parseDouble(JOptionPane.showInputDialog("Cuanto desea retirar?")));
            if (getSaldoRetirado() > getSaldoCliente()) {
                JOptionPane.showMessageDialog(null,
                        "Saldo insuficiente", "Consulta de Datos",
                        JOptionPane.INFORMATION_MESSAGE);
                mostrarMenuBancarioClient();
            } else {
                retiro();
                mostrarMenuBancarioClient();
            }
        }else {
            JOptionPane.showMessageDialog(null,
                    "Gracias por usar nuestro servicios", "Finalizacion",
                    JOptionPane.INFORMATION_MESSAGE);
            preguntaPrincipal();
        }
    }
}