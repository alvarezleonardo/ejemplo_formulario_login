/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import datos.DAOLogin;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JTextField;
public class ControladorAceptar implements MouseListener {
    private DAOLogin daoLogin = new DAOLogin();
    private JTextField usuarioLogin;
    private JTextField claveLogin;

    public ControladorAceptar(JTextField usuarioLogin, JTextField claveLogin) {
        this.usuarioLogin = usuarioLogin;
        this.claveLogin = claveLogin;
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        if(usuarioLogin.getText().equals(daoLogin.getUsuario()) && claveLogin.getText().equals(daoLogin.getClave())){
            System.out.println("Correcto");
            
        }else{
            System.out.println("NO Correcto");
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
