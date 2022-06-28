
package br.com.tjdiego.docsus.GUI;

import br.com.tjdiego.docsus.Negocio.Controle.ControleLogin;
import br.com.tjdiego.docsus.Negocio.Excecoes.SenhaIncorretaException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Diego
 */


public class Login extends JFrame implements ActionListener {
 //Declaração dos componentes
 private JButton btEntrar;
 private JLabel textoUsuario, textoSenha, fundo;
 public static JTextField campoUsuario;
 public static JPasswordField campoSenha;
private JPanel panel;
 private JFrame janela;
 //Método construtor
 public Login() {
 //Criação dos componentes
 btEntrar = new JButton("Entrar");
 btEntrar.setSize(80, 40);
 btEntrar.addActionListener(this);
 textoUsuario = new JLabel("Usuário:");
 textoUsuario.setSize(120, 20);
 textoSenha = new JLabel("Senha:");
 textoSenha.setSize(120, 20);
 campoUsuario = new JTextField();
 campoUsuario.setSize(80, 20);
 campoSenha = new JPasswordField();
 campoSenha.setSize(80, 20);
 panel = new JPanel();
 panel.setLayout(null);
 panel.setSize(800, 600);
 panel.add(textoUsuario).setLocation(300, 250);
 panel.add(campoUsuario).setLocation(350, 250);
panel.add(textoSenha).setLocation(300, 280);
 panel.add(campoSenha).setLocation(350, 280);
 panel.add(btEntrar).setLocation(350, 310);
 janela = new JFrame();
 janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 janela.setSize(800, 600);
 janela.setLocationRelativeTo(null);
 janela.setResizable(false);
 janela.add(panel);
 janela.setVisible(true);
 }
 /*Método que verifica qual botão foi clicado, executando as 
 ações correspondetes a eles*/
/* public void actionPerformed(ActionEvent e) {
 if (e.getSource() == btEntrar) {
 try {
 janela.dispose();
 new ControleLogin().capturarSenha();
 
 } catch (SenhaIncorretaException ex) {
 JOptionPane.showMessageDialog(null, ex.getMessage());
 }
 }}*/

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 
}
