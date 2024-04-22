import java.util.*;
public class Desafio {
    public static void main(String[] args){

//        Scanner ingresoDeDatos = new Scanner(System.in);
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
            System.out.println();

            if (opciones == 1){
                //MUESTRA EL SALDO
                System.out.println("Su saldo actual es de: $ " + saldo + '\n');

            } else if (opciones == 2) {
                //SALDO RETIRADO Y ALTERADO
                System.out.println("Cuanto dinero retirara?" + '\n');
                saldoRetirado = ingresoDeOpciones.nextDouble();
                double restoSaldo = saldo - saldoRetirado;
                System.out.println('\n' + "Tu nuevo saldo es de: $ " + restoSaldo + '\n');

            } else if (opciones == 3) {

                if (){
                    // RESTO SALDO ES DIFERENTE DE 0 TRUE SE CUMPLE
                    System.out.println("Cuanto dinero depositara?" + '\n');
                    saldoIngresado = ingresoDeOpciones.nextDouble();
                    double aumentoSaldo = saldo + saldoIngresado;
                    System.out.println("Tu nuevo saldo es de: $ " + aumentoSaldo + '\n');
                }else{
                    //SINO TOMA EL RESTO SALDO COMO SALDO ACTUAL Y LO SUMA A A NUEVO SALDO
                }






                System.out.println("Cuanto dinero depositara?" + '\n');
                saldoIngresado = ingresoDeOpciones.nextDouble();
                double aumentoSaldo = saldo + saldoIngresado;
                System.out.println("Tu nuevo saldo es de: $ " + aumentoSaldo + '\n');

            }else {
                System.out.println("Finalizacion el programa. Gracias por usar nuestros servicios");
            }


        }
    }
}
