package org.example;

import org.example.Grafico.Login;

import javax.swing.*;

public class App 
{
public static void main(String[] args){

    SwingUtilities.invokeLater(new Runnable() {
        @Override
        public void run() {
            JFrame login = new Login();
            login.pack();
            login.setLocationRelativeTo(null);
            login.setSize(500,250);
            login.setVisible(true);
        }
    });

}
}
