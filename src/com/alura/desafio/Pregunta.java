package com.alura.desafio;
import com.alura.desafio.NewClient;
import java.util.Scanner;
import javax.swing.*;

public class Pregunta extends MenuBancario {

    private int seleccion;


    public int setSeleccion(int seleccion) {
        seleccion = JOptionPane.showConfirmDialog(null, "¿Es usted cliente nuevo?", "Confirmacion", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (seleccion == JOptionPane.YES_OPTION){
            return ;


        }
    }

    public int getSeleccion(){
        return  seleccion;
    }
}