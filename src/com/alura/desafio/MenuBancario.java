package com.alura.desafio;
import java.util.Scanner;

public class MenuBancario {

    private double saldoRetirado, saldoNuevoRetirado;
    private double saldoIngresado, saldoNuevoIngresado;
    private int opciones = 0;
    private String principalMenu;
    private String consultaDeDatos;
    private String respuesta;
//***************************************************************
    public int pregunta(MenuBancario respuesta){
        Scanner respuesta = new Scanner(System.in);
        System.out.println("""
                \n*********************************************
                \nEs usted un cliente nuevo? (Si/No)
                """);
        if (respuesta == respuesta.equals('si')){
            System.out.println("\nIngrese su nombre: ");
            nombreNuevoCliente = ingresoDeDatos.nextLine();
            System.out.println("\nIngrese su tipo de cuenta: ");
            cuentaNuevoCliente = ingresoDeDatos.nextLine();
            System.out.println("\nIngrese su saldo disponible:");
            saldoNuevoCliente = ingresoDeDatos.nextDouble();

            System.out.printf(consultaNuevosDatos, nombreNuevoCliente, cuentaNuevoCliente, saldoNuevoCliente);
        }
    }

//***************************************************************
    public void menu(){
     System.out.println("""
            *********************************************
            **Escriba el numero de la operacion deseada**
            1 - Consultar saldo
            2 - Retirar
            3 - Depositar
            9 - Salir
            """);
    }
//***************************************************************
//    public int menuPrincipal(MenuBancario opcion){
//        while (opciones != 9){
//            System.out.println('\n' + principalMenu);
//            opciones = ingresoDeOpciones.nextInt();
//            if (opciones == 1) {
//                //MUESTRA EL SALDO
//                System.out.println("\nSu saldo actualizado es de: $ " + saldoNuevoCliente + '\n');
//
//        }
//
//    }

}
