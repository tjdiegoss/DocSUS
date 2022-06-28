
package br.com.tjdiego.docsus.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Diego
 */


public class TelaPrincipal extends Tela implements ActionListener{
 private JLabel textoTitulo, subTitulo;
 private JButton pesquisar, cadastrar, marcarConsulta, semFucao;
 public TelaPrincipal(){
 textoTitulo = new JLabel("Olá, bem vindo ao Sistema MedicALL");
 textoTitulo.setSize(300, 20);
 subTitulo = new JLabel("O que deseja fazer?");
 subTitulo.setSize(150, 20);
 pesquisar = new JButton("Pesquisar");
 pesquisar.setSize(120, 120);
pesquisar.addActionListener(this);
 cadastrar = new JButton("Cadastrar");
 cadastrar.setSize(120, 120);
 cadastrar.addActionListener(this);
 marcarConsulta = new JButton("<html>Marcar<br>Consulta</html>");
 marcarConsulta.setSize(120, 120);
 marcarConsulta.addActionListener(this);
 semFucao = new JButton("Sem função");
 semFucao.setSize(120, 120);
 super.panel.add(textoTitulo).setLocation(300, 20);
 super.panel.add(subTitulo).setLocation(350, 50);
 super.panel.add(cadastrar).setLocation(40, 200);
 super.panel.add(pesquisar).setLocation(240, 200);
 super.panel.add(marcarConsulta).setLocation(440, 200);
 super.panel.add(semFucao).setLocation(640, 200);
 }
 public void actionPerformed(ActionEvent e) {
 if(e.getSource()== pesquisar){
 super.dispose();
new TelaPesquisa();
 }else
 if(e.getSource()== cadastrar){
 super.dispose();
 new TelaCadastro();
 }else
 if(e.getSource()== marcarConsulta){
 super.dispose();
 new TelaCadastroConsulta();
 }
 }
}

