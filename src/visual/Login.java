/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual;

import controlador.ControladorAceptar;
import controlador.ControladorCancelar;
import controlador.ControladorWindowsLogin;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;


/**
 *
 * @author alumno
 */
public class Login extends JFrame {
    private JButton aceptar = new JButton("Aceptar");
    private JButton cancelar = new JButton("Cancelar");
    private JLabel lblUsuario = new JLabel("Usuario");
    private JLabel lblClave = new JLabel("Clave");
    private JTextField txtUsuario = new JTextField("");
    private JTextField txtClave = new JTextField("");
    private GridLayout contenedor =  new GridLayout(3,2);
    private ControladorWindowsLogin controladorWindowsLogin = new ControladorWindowsLogin(); 
    private ControladorAceptar controladorAceptar = new ControladorAceptar(txtUsuario, txtClave);
    private ControladorCancelar controladorCancelar = new ControladorCancelar();
    
    
    public Login(){
        this.setLayout(contenedor);
        this.agregarComponentes();
        this.setTitle("Login");
        this.setLocation(200, 200);
        this.setSize(400, 200);
        this.setVisible(true);
        this.aceptar.addMouseListener(controladorAceptar);
        this.addWindowListener(controladorWindowsLogin);
        this.cancelar.addMouseListener(controladorCancelar);
    }
    
    public void agregarComponentes(){
        this.add(lblUsuario);
        this.add(txtUsuario);
        this.add(lblClave);
        this.add(txtClave);
        this.add(aceptar);
        this.add(cancelar);
        
    }

    
}
