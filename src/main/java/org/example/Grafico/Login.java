package org.example.Grafico;

import javax.swing.*;

public class Login extends JFrame{
    private JPanel panelLogin;
    private JTextField txtUsuario;
    private JTextField txtPassword;
    private JLabel lblUsuario;
    private JLabel lblPassword;
    private JButton btnLogin;
    private JButton btnSalir;


    public Login(){
        super("Login");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setContentPane(panelLogin);

        btnSalir.addActionListener((event) -> System.exit(0));

        btnLogin.addActionListener(this::onLoginClick);
    }

    private void onLoginClick(java.awt.event.ActionEvent event){
        if(txtUsuario.getText().equals("Bryan")&&txtPassword.getText().equals("1234")){

            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    JFrame admin = new Administracion();
                    admin.pack();
                    admin.setLocationRelativeTo(null);
                    admin.setSize(600,600);
                    admin.setVisible(true);
                }
            });
            dispose();
        }
        else{
            JOptionPane.showMessageDialog(panelLogin,
                    "El Usuario o la Contraseña con Incorrectos",
                    "Error de credenciales",
                    JOptionPane.ERROR_MESSAGE);
        }
    }


}
