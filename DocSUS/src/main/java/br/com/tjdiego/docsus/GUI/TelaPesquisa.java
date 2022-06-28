
package br.com.tjdiego.docsus.GUI;

import br.com.tjdiego.docsus.Negocio.Controle.ControleAgente;
import br.com.tjdiego.docsus.Negocio.Controle.ControleDentista;
import br.com.tjdiego.docsus.Negocio.Controle.ControleEnfermeiro;
import br.com.tjdiego.docsus.Negocio.Controle.ControleMedicamento;
import br.com.tjdiego.docsus.Negocio.Controle.ControleMedico;
import br.com.tjdiego.docsus.Negocio.Controle.ControlePaciente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Diego
 */


public class TelaPesquisa extends Tela implements ActionListener {
 public static JTextField busca;
 private JComboBox tipoPesquisa;
 private JButton btPesquisar, btAlterar, btDeletar;
 private JLabel textoBusca, resultado;
 public TelaPesquisa() {
 textoBusca = new JLabel("Pesquisar");
 textoBusca.setSize(120, 20);
 busca = new JTextField();
 busca.setSize(300, 20);
 String[] opcao = new String[]{"Paciente", "Médico", "Enfermeiro",
 "Agente", "Medicamento", "Dentista"};
 tipoPesquisa = new JComboBox(opcao);
 tipoPesquisa.setSize(120, 20);
tipoPesquisa.addActionListener(this);
 btPesquisar = new JButton("OK");
 btPesquisar.setSize(60, 20);
 resultado = new JLabel();
 resultado.setSize(400, 200);
 
 btAlterar = new JButton("Alterar");
 btAlterar.setSize(120, 40);
 btDeletar = new JButton("Deletar");
 btDeletar.setSize(120, 40);
 super.panel.add(textoBusca).setLocation(20, 40);
 super.panel.add(busca).setLocation(150, 40);
 super.panel.add(tipoPesquisa).setLocation(480, 40);
 super.panel.add(btPesquisar).setLocation(620, 40);
 super.panel.add(resultado).setLocation(200, 150);
 }
 public static void main(String args[]) {
 TelaPesquisa tp = new TelaPesquisa();
 }
public void actionPerformed(ActionEvent e) {
 switch (tipoPesquisa.getSelectedIndex()) {
 case 0:
 super.panel.add(btAlterar).setLocation(245, 500);
 super.panel.add(btDeletar).setLocation(425, 500);
 btPesquisar.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 resultado.setText(new ControlePaciente().buscar
 (busca.getText()));
 }
 });
 btAlterar.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 new ControlePaciente().alterar(busca.getText());
 }
 });
 btDeletar.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 new ControlePaciente().deletar(busca.getText());
}
 });
 break;
 case 1:
 super.panel.add(btAlterar).setLocation(245, 500);
 super.panel.add(btDeletar).setLocation(425, 500);
 btPesquisar.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 resultado.setText(new ControleMedico().buscar
 (busca.getText()));
 }
 });
 btAlterar.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 new ControleMedico().alterar(busca.getText());
 }
 });
 btDeletar.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 new ControleMedico().deletar(busca.getText());
 }
 });
break;
 case 2:
 super.panel.add(btAlterar).setLocation(245, 500);
 super.panel.add(btDeletar).setLocation(425, 500);
 btPesquisar.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 resultado.setText(new ControleEnfermeiro().buscar
 (busca.getText()));
 }
 });
 btAlterar.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 new ControleEnfermeiro().alterar(busca.getText());
 }
 });
 btDeletar.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 new ControleEnfermeiro().deletar(busca.getText());
 }
 });
 break;
 case 3:
super.panel.add(btAlterar).setLocation(245, 500);
 super.panel.add(btDeletar).setLocation(425, 500);
 btPesquisar.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 resultado.setText(new ControleAgente().buscar
 (busca.getText()));
 }
 });
 btAlterar.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 new ControleAgente().alterar
 (busca.getText());
 }
 });
 btDeletar.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 new ControleAgente().deletar(busca.getText());
 }
 });
 break;
 case 4:
     super.panel.add(btAlterar).setLocation(245, 500);
 super.panel.add(btDeletar).setLocation(425, 500);
 btPesquisar.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 resultado.setText(new ControleMedicamento().buscar
 (busca.getText()));
 }
 });
 btAlterar.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 new ControleMedicamento().alterar(busca.getText());
 }
 });
 btDeletar.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 new ControleMedicamento().deletar(busca.getText());
 }
 });
 break;
 case 5:
 super.panel.add(btAlterar).setLocation(245, 500);
 super.panel.add(btDeletar).setLocation(425, 500);
btPesquisar.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 resultado.setText(new ControleDentista().buscar
 (busca.getText()));
 }
 });
 btAlterar.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 new ControleDentista().alterar(busca.getText());
 }
 });
 btDeletar.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 new ControleDentista().deletar(busca.getText());
 }
 });
 }
 }
}

