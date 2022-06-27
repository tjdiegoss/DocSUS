
package br.com.tjdiego.docsus.GUI;

/**
 *
 * @author Diego
 */
package GUI;
import Negocio.Excecoes.ObjetoExistenteException;
import Negocio.Fachada.ControleMedicamento;
import Negocio.Medicamento;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class TelaCadastroMedicamento extends Tela implements ActionListener{
 private JLabel textoTitulo, textoNome, textoCodigo, textoDescricao;
 public static JTextField campoNome, campoCodigo;
 public static JTextArea descricao;
 private JButton salvar, cancelar;
 public TelaCadastroMedicamento(Medicamento medicamento){
 textoTitulo = new JLabel("Atuzalizar Medicamento");
 textoTitulo.setSize(150, 20);
 textoNome = new JLabel("Nome:");
 textoNome.setSize(40, 20);
 campoNome = new JTextField();
 campoNome.setSize(560, 20);
 campoNome.setText(medicamento.getNomeMedicamento());
 textoCodigo = new JLabel("Código:");
textoCodigo.setSize(60, 20);
 campoCodigo = new JTextField();
 campoCodigo.setSize(120, 20);
 campoCodigo.setText("" + medicamento.getCodigo());
 textoDescricao = new JLabel("Descrição:");
 textoDescricao.setSize(80, 20);
 descricao = new JTextArea();
 descricao.setSize(760, 200);
 descricao.setText(medicamento.getDescricao());
 salvar = new JButton("Salvar");
 salvar.setSize(120, 40);
 salvar.addActionListener(this);
 cancelar = new JButton("Cancelar");
 cancelar.setSize(120, 40);
 cancelar.addActionListener(this);
 super.panel.add(textoTitulo).setLocation(325, 20);
 super.panel.add(textoNome).setLocation(20, 50);
 super.panel.add(campoNome).setLocation(82, 50);
 super.panel.add(textoCodigo).setLocation(20, 80);
 super.panel.add(campoCodigo).setLocation(82, 80);
 super.panel.add(textoDescricao).setLocation(20, 110);
super.panel.add(descricao).setLocation(20, 140);
 super.panel.add(salvar).setLocation(245, 500);
 super.panel.add(cancelar).setLocation(425, 500);
 }
 public TelaCadastroMedicamento(){
 textoTitulo = new JLabel("Novo Medicamento");
 textoTitulo.setSize(150, 20);
 textoNome = new JLabel("Nome:");
 textoNome.setSize(40, 20);
 campoNome = new JTextField();
 campoNome.setSize(560, 20);
 textoCodigo = new JLabel("Código:");
 textoCodigo.setSize(60, 20);
 campoCodigo = new JTextField();
 campoCodigo.setSize(120, 20);
 textoDescricao = new JLabel("Descrição:");
 textoDescricao.setSize(80, 20);
 descricao = new JTextArea();
 descricao.setSize(760, 200);
 salvar = new JButton("Salvar");
salvar.setSize(120, 40);
 salvar.addActionListener(this);
 cancelar = new JButton("Cancelar");
 cancelar.setSize(120, 40);
 cancelar.addActionListener(this);
 super.panel.add(textoTitulo).setLocation(325, 20);
 super.panel.add(textoNome).setLocation(20, 50);
 super.panel.add(campoNome).setLocation(82, 50);
 super.panel.add(textoCodigo).setLocation(20, 80);
 super.panel.add(campoCodigo).setLocation(82, 80);
 super.panel.add(textoDescricao).setLocation(20, 110);
 super.panel.add(descricao).setLocation(20, 140);
 super.panel.add(salvar).setLocation(245, 500);
 super.panel.add(cancelar).setLocation(425, 500);
 }
 public void actionPerformed(ActionEvent e) {
 if(e.getSource()== salvar){
 try{
 super.dispose();
 new ControleMedicamento().cadastrar();
 new TelaPrincipal();
 }catch (ObjetoExistenteException ex){
JOptionPane.showMessageDialog(null, ex.getMessage());
 }
 }else
 if(e.getSource()== cancelar){
 super.dispose();
 new TelaPrincipal();
 }
 }
}

