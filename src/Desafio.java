public class Desafio {
    public static void main(String[] args){
        String nombreCliente = "Tony Stark";
        String tipoDeCuenta = "Corriente";
        Double saldo = 1599.99;

        String consultaDeDatos = """
                *******************************
                
                Nombre del Cliente: %s
                Tipo de cuenta: %s
                Saldo Disponible: $ %1.2f
                """;
        System.out.printf(consultaDeDatos,nombreCliente,tipoDeCuenta,saldo);

        String principalMenu = """
                **Escriba el numero de la operacion deseada**
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;
        System.out.println(principalMenu);
    }
}