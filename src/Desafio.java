import java.util.*;
public class Desafio {
    public static void main(String[] args){




        Scanner ingresoDeOpciones = new Scanner(System.in);

        String nombreCliente = "Tony Stark";
        String tipoDeCuenta = "Corriente";
        double saldo = 1599.99;

        double saldoRetirado;
        double saldoIngresado;
        int opciones = 0;

        String consultaDeDatos = """
                *******************************
                
                Nombre del Cliente: %s
                Tipo de cuenta: %s
                Saldo Disponible: $ %1.2f
                
                """;
        System.out.printf(consultaDeDatos,nombreCliente,tipoDeCuenta,saldo);

        String principalMenu = """
                *********************************************
                
                **Escriba el numero de la operacion deseada**
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;

        while (opciones !=9){
            System.out.println(principalMenu);
            opciones = ingresoDeOpciones.nextInt();

            if (opciones == 1){
                //MUESTRA EL SALDO

                System.out.println('\n' + "Su saldo actualizado es de: $ " + saldo + '\n');

            } else if (opciones == 2) {

                System.out.println("\nCuanto dinero retirara?\n");
                saldoRetirado = ingresoDeOpciones.nextDouble();

                if (saldo > saldoRetirado){
                    saldo = saldo - saldoRetirado;
                    System.out.println('\n' + "Tu nuevo saldo es de: $ " + saldo + '\n');

                }else {
                    System.out.println("Saldo insuficiente\n");
                }

            } else if (opciones == 3) {
                System.out.println("\nCuanto dinero depositara?\n");
                saldoIngresado = ingresoDeOpciones.nextDouble();

                saldo = saldo + saldoIngresado;
                System.out.println("\nTu nuevo saldo es de: $ " + saldo + '\n');
            } else if (opciones == 9) {
                System.out.println("\nFinalizacion el programa. Gracias por usar nuestros servicios");
            }else {
                System.out.println("\nOpcion no valida\n");
            }
        }



//      PARA INGRESAR NUEVO CLIENTE

        Scanner ingresoDeDatos = new Scanner(System.in);

        String nombreNuevoCliente;
        String cuentaNuevoCliente;
        double saldoNuevoCliente;

        String consultaNuevosDatos = """
                \nNombre del Cliente: %s
                Tipo de cuenta: %s
                Saldo Disponible: $ %1.2f
                """;

        System.out.println("Es usted un cliente nuevo? (Si/No)");
        String pregunta = ingresoDeDatos.nextLine();
        String clienteNuevo = "Si";

        if (pregunta.equalsIgnoreCase(clienteNuevo)){

            System.out.println("\nIngrese su nombre: ");
            nombreNuevoCliente = ingresoDeDatos.nextLine();
            System.out.println("\nIngrese su tipo de cuenta: ");
            cuentaNuevoCliente = ingresoDeDatos.nextLine();
            System.out.println("\nIngrese su saldo disponible:");
            saldoNuevoCliente = ingresoDeDatos.nextDouble();

            System.out.printf(consultaNuevosDatos,nombreNuevoCliente,cuentaNuevoCliente,saldoNuevoCliente);

        }else {
            System.out.println("programa finalizado");


        }
    }
}
