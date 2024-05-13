package com.alura.desafio;
import com.alura.desafio.ClientDefault;

import java.util.Scanner;

public class MenuBancario {

    private double saldoRetirado, saldoNuevoRetirado;
    private double saldoIngresado, saldoNuevoIngresado;
    private int opciones = 0;
    private String principalMenu;
    private String consultaDeDatos;

    Scanner ingresoDeOpciones = new Scanner(System.in);
    Scanner ingresoDeDatos = new Scanner(System.in);
    public void menuPrincipal(){
        System.out.println("""
                *********************************************
                **Escriba el numero de la operacion deseada**
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """);
    }

//        System.out.printf("""
//            *********************************************
//            \nNombre del Cliente: %s
//            Tipo de cuenta: %s
//            Saldo Disponible: $ %1.2f
//            """,);

    public void consultaDatos(){
        System.out.printf("""
            *********************************************
            \nNombre del Cliente: %s
            Tipo de cuenta: %s
            Saldo Disponible: $ %1.2f
            """,
    }
//    public void consultaDatos(){

    }

}
