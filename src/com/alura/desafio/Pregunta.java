//**********        PRIMER MENU PARA EL MENU BANCARIO

//       if(getSeleccion() == JOptionPane.YES_OPTION) {
//                NewClient clienteNuevo = new NewClient();
//                clienteNuevo.preguntaClienteNuevo();
//                clienteNuevo.mostrarMenuBancarioNewClient();
//
//        } else if (getSeleccion() == JOptionPane.NO_OPTION) {
//            ClientDefault clienteRecurrente = new ClientDefault();
//            clienteRecurrente.mostrarMenuBancarioClient();
//
//        } else {
//            JOptionPane.showMessageDialog(null,
//                    "Gracias por usar nuestro servicios", "Finalizacion",
//                    JOptionPane.INFORMATION_MESSAGE);


//**********        PRIMER MENU PARA EL NUEVO CLIENTE

//**        Object menu = JOptionPane.showInputDialog(null,
//                "Selecciona la operacion deseada", "Menu",
//                JOptionPane.INFORMATION_MESSAGE, null,
//                opcionesMenuBancarioNewClient, opcionesMenuBancarioNewClient[0]);


//    if (menu == opcionesMenuBancarioNewClient[0]) {
//        JOptionPane.showMessageDialog(null,
//                mostrarDatosCompletos(), "Consulta de Datos",
//                JOptionPane.INFORMATION_MESSAGE);
//    } else if (menu == opcionesMenuBancarioNewClient[1]) {
//        setSaldoNuevoIngresado(Double.parseDouble(JOptionPane.showInputDialog("Cuanto desea depositar?")));
//        nuevoDeposito();
//        mostrarMenuBancarioNewClient();
//    } else if (menu == opcionesMenuBancarioNewClient[2]) {
//        setSaldoNuevoRetirado(Double.parseDouble(JOptionPane.showInputDialog("Cuanto desea retirar?")));
//        if (getSaldoNuevoRetirado() > getSaldoNuevoCliente()) {
//            JOptionPane.showMessageDialog(null,
//                    "Saldo insuficiente", "Consulta de Datos",
//                    JOptionPane.INFORMATION_MESSAGE);
//            mostrarMenuBancarioNewClient();
//        }else {
//            nuevoRetiro();
//            mostrarMenuBancarioNewClient();
//        }


//**********        PRIMER MENU PARA EL CLIENTE RECURRENTE

//        Object menu = JOptionPane.showInputDialog(null,
//                "Selecciona la operacion deseada", "Menu",
//                JOptionPane.INFORMATION_MESSAGE,null ,
//                opcionesMenuBancarioClient, opcionesMenuBancarioClient[0]);
//    } else if (menu == opcionesMenuBancarioClient[1]) {


//                if (menu == opcionesMenuBancarioClient[0]) {
//                    JOptionPane.showMessageDialog(null,
//                            consultaClient(), "Consulta de Datos",
//                            JOptionPane.INFORMATION_MESSAGE);
//
//                } else if (menu == opcionesMenuBancarioClient[1]) {
//                    setSaldoIngresado(Double.parseDouble(JOptionPane.showInputDialog("Cuanto desea depositar?")));
//                    deposito();
//                    mostrarMenuBancarioClient();
//
//                } else if (menu == opcionesMenuBancarioClient[2]) {
//                    setSaldoRetirado(Double.parseDouble(JOptionPane.showInputDialog("Cuanto desea retirar?")));
//                    if (getSaldoRetirado() > getSaldoCliente()) {
//                        JOptionPane.showMessageDialog(null,
//                                "Saldo insuficiente", "Consulta de Datos",
//                                JOptionPane.INFORMATION_MESSAGE);
//                        mostrarMenuBancarioClient();
//                    } else {
//                        retiro();
//                        mostrarMenuBancarioClient();
//                    }
//                } else {
//                    JOptionPane.showMessageDialog(null,
//                            "Gracias por usar nuestro servicios", "Finalizacion",
//                            JOptionPane.INFORMATION_MESSAGE);
//                }