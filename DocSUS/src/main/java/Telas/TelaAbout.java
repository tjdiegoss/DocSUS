
package Telas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Diego
 */

        
public class TelaAbout extends Tela implements ActionListener{
 //Declaração dos componetes
private JLabel textoTitulo, texto;
 private JButton voltar;
 //Método construtor
 public TelaAbout(){
 //Construção dos componetes
 textoTitulo = new JLabel("Sobre o Sistema MedicALL");
 textoTitulo.setSize(180, 20);
 texto = new JLabel();
 texto.setText("<html>O Sistema DocSUS é um projeto "
 + "desenvolvido pelos alunos do 2º Período! <br>do Curso Técnico em "
         + "Informática"
 +"<br>do Instituto Federal de Ciência, Educação e Tecnologia de Pernambuco - IFPE<br> "
 + "Campus Garanhuns<br> Na disciplina de Projetos Interdisciplinares<br> "
 /*aqui foi usada HTML para edição
 do texto do JLabel*/
 + "</html>");
 texto.setSize(760, 200);
 voltar = new JButton("Página Inicial");
 voltar.setSize(120, 40);
 voltar.addActionListener(this);
super.panel.add(textoTitulo).setLocation(325, 20);
 super.panel.add(texto).setLocation(20, 40);
 super.panel.add(voltar).setLocation(340, 500);
 
 }
 //Método que chama a classe TelaPrincipal quando o botão é clicado
 public void actionPerformed(ActionEvent e) {
 super.dispose();
 new TelaPrincipal();
 }
}

   
 
