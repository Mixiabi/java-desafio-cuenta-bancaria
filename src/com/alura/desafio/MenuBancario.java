package com.alura.desafio;

public class MenuBancario {

    String principalMenu;
    String consultaDeDatos;

    public String getPrincipalMenu() {
        return ;
    }

    public String getConsultaDeDatos() {
        return ;
    }

    public void menuPrincipal(){
        System.out.printf("""
                *********************************************
                **Escriba el numero de la operacion deseada**
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """);
    }

    public void consultaDatos(){
        System.out.printf("""
                *********************************************
                \nNombre del Cliente: %s
                Tipo de cuenta: %s
                Saldo Disponible: $ %1.2f
                """);
    }

}
