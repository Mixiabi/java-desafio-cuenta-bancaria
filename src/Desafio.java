import java.util.*;
public class Desafio {
    public static void main(String[] args){
        Scanner ingresoDeOpciones = new Scanner(System.in);
        Scanner ingresoDeDatos = new Scanner(System.in);
//MENU PRINCIPAL
        String principalMenu = """
                *********************************************
                **Escriba el numero de la operacion deseada**
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;

//VARIABLES - CLIENTE POR DEFECTO
        String nombreCliente = "Tony Stark";
        String tipoDeCuenta = "Corriente";
        double saldo = 1599.99;

//VARIABLES DE RETIRO E INGRESO DE NUEVO Y DEFAULT CLIENTE
        double saldoRetirado, saldoNuevoRetirado;
        double saldoIngresado, saldoNuevoIngresado;
        int opciones = 0;

        String consultaDeDatos = """
                *********************************************
                \nNombre del Cliente: %s
                Tipo de cuenta: %s
                Saldo Disponible: $ %1.2f
                """;

// VARIABLES - NUEVO CLIENTE
        String nombreNuevoCliente;
        String cuentaNuevoCliente;
        double saldoNuevoCliente;

        String consultaNuevosDatos = """
                \n*********************************************
                \nNombre del Cliente: %s
                Tipo de cuenta: %s
                Saldo Disponible: $ %1.2f
                """;

//PREGUNTA SI ES CLIENTE NUEVO O NO
        String pregunta = """
                \n*********************************************
                \nEs usted un cliente nuevo? (Si/No)
                """;
        System.out.println(pregunta);
        String respuesta = ingresoDeDatos.nextLine();
        String clienteNuevo = "Si";

//CLIENTE NUEVO
        if (respuesta.equalsIgnoreCase(clienteNuevo)) {

            System.out.println("\nIngrese su nombre: ");
            nombreNuevoCliente = ingresoDeDatos.nextLine();
            System.out.println("\nIngrese su tipo de cuenta: ");
            cuentaNuevoCliente = ingresoDeDatos.nextLine();
            System.out.println("\nIngrese su saldo disponible:");
            saldoNuevoCliente = ingresoDeDatos.nextDouble();

            System.out.printf(consultaNuevosDatos, nombreNuevoCliente, cuentaNuevoCliente, saldoNuevoCliente);

            while (opciones != 9) {
                System.out.println('\n' + principalMenu);
                opciones = ingresoDeOpciones.nextInt();

                if (opciones == 1) {
                    //MUESTRA EL SALDO
                    System.out.println("\nSu saldo actualizado es de: $ " + saldoNuevoCliente + '\n');
                    //AGREGAR NUEVO RETIRO
                } else if (opciones == 2) {

                    System.out.println("\nCuanto dinero retirara?\n");
                    saldoNuevoRetirado = ingresoDeOpciones.nextDouble();
                    if (saldoNuevoCliente > saldoNuevoRetirado) {
                        saldoNuevoCliente -= saldoNuevoRetirado;
                        System.out.println('\n' + "Tu nuevo saldo es de: $ " + saldoNuevoCliente + '\n');
                    } else {
                        System.out.println("\nSaldo insuficiente\n");
                    }
                    //AGREGAR NUEVO INGRESO
                } else if (opciones == 3) {
                    System.out.println("\nCuanto dinero depositara?\n");
                    saldoNuevoIngresado = ingresoDeOpciones.nextDouble();
                    saldoNuevoCliente += saldoNuevoIngresado;
                    System.out.println("\nTu nuevo saldo es de: $ " + saldoNuevoCliente + '\n');
                } else if (opciones == 9) {
                    System.out.println("\nFinalizacion el programa. Gracias por usar nuestros servicios");
                } else {
                    System.out.println("\nOpcion no valida\n");
                }
            }

//CLIENTE DEFAULT
        } else {
            System.out.printf(consultaDeDatos+'\n', nombreCliente, tipoDeCuenta, saldo);
            while (opciones != 9) {
                System.out.println(principalMenu);
                opciones = ingresoDeOpciones.nextInt();
                if (opciones == 1) {
                    //MUESTRA EL SALDO
                    System.out.println('\n' + "Su saldo actualizado es de: $ " + saldo + '\n');
                    //AGREGAR NUEVO RETIRO
                } else if (opciones == 2) {
                    System.out.println("\nCuanto dinero retirara?\n");
                    saldoRetirado = ingresoDeOpciones.nextDouble();
                    if (saldo > saldoRetirado) {
                        saldo = saldo - saldoRetirado;
                        System.out.println('\n' + "Tu nuevo saldo es de: $ " + saldo + '\n');
                    } else {
                        System.out.println("Saldo insuficiente\n");
                    }
                    //AGREGAR NUEVO INGRESO
                } else if (opciones == 3) {
                    System.out.println("\nCuanto dinero depositara?\n");
                    saldoIngresado = ingresoDeOpciones.nextDouble();
                    saldo += saldoIngresado;
                    System.out.println("\nTu nuevo saldo es de: $ " + saldo + '\n');
                } else if (opciones == 9) {
                    System.out.println("\nFinalizacion el programa. Gracias por usar nuestros servicios");
                } else {
                    System.out.println("\nOpcion no valida\n");
                }
            }
        }
    }
}