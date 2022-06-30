
package Telas;

import br.com.tjdiego.docsus.Negocio.Controle.ControleAdmin;
import br.com.tjdiego.docsus.Negocio.Excecoes.SenhaCurtaException;
import br.com.tjdiego.docsus.Negocio.Excecoes.SenhaLongaException;
import br.com.tjdiego.docsus.Negocio.Excecoes.SenhasDiferentesException;
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

public class TelaInicial extends JFrame implements ActionListener {
 private JButton btOK;
 private JButton btCancelar;
 public JTextField campoUsuario;
 static public JPasswordField campoSenha;
 static public JPasswordField campoRptSenha;
 private JLabel fundo;
 private JLabel textoUsuario;
 private JLabel textoSenha;
 private JLabel textoRptSenha;
 private JPanel panel;
public TelaInicial() {
 btOK = new JButton("OK");
 btOK.setSize(60, 30);
 btOK.addActionListener(this);
 btCancelar = new JButton("Cancelar");
 btCancelar.setSize(90, 30);
 btCancelar.addActionListener(this);
 textoUsuario = new JLabel("Usuário:");
 textoUsuario.setSize(120, 20);
 campoUsuario = new JTextField("Admin");
 campoUsuario.setSize(170, 20);
 campoUsuario.setEditable(false);
 textoSenha = new JLabel("Senha:");
 textoSenha.setSize(120, 20);
 campoSenha = new JPasswordField();
 campoSenha.setSize(170, 20);
 textoRptSenha = new JLabel("Repita a senha:");
 textoRptSenha.setSize(120, 20);
campoRptSenha = new JPasswordField();
 campoRptSenha.setSize(170, 20);
 panel = new JPanel();
 panel.setLayout(null);
 panel.setSize(800, 600);
 panel.add(textoUsuario).setLocation(110, 200);
 panel.add(campoUsuario).setLocation(300, 200);
 panel.add(textoSenha).setLocation(110, 240);
 panel.add(campoSenha).setLocation(300, 240);
 panel.add(textoRptSenha).setLocation(110, 280);
 panel.add(campoRptSenha).setLocation(300, 280);
 panel.add(btOK).setLocation(300, 320);
 panel.add(btCancelar).setLocation(380, 320);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 setSize(800, 600);
 setLocationRelativeTo(null);
 setResizable(false);
 add(panel);
 setVisible(true);
 }
 public void actionPerformed(ActionEvent e) {
if (e.getSource() == btCancelar) {
 System.exit(0);
 } else if (e.getSource() == btOK) {
 try {
 new ControleAdmin().cadastrar();
 this.dispose();
 new TelaCadastroPosto();
 } catch (SenhaCurtaException ex) {
 JOptionPane.showMessageDialog(null, ex.getMessage());
 } catch (SenhaLongaException ex) {
 JOptionPane.showMessageDialog(null, ex.getMessage());
 } catch (SenhasDiferentesException ex){
 JOptionPane.showMessageDialog(null, ex.getMessage());
 }
 }
 }
}

