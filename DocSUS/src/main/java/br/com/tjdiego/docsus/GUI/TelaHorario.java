
package br.com.tjdiego.docsus.GUI;

/**
 *
 * @author Diego
 */
package GUI;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
public class TelaHorario extends Tela {
 private String[] colunas = new String[]{"Horário/Dia", "Segunda", "Terça",
 "Quarta", "Quinta", "Sexta"};
 private String[][] dados = new String[][]{
 {"Disponível", "Disponível", "Disponível", "Disponível", "Disponível", "Disponível"},
 {"Disponível", "Disponível", "Disponível", "Disponível", "Disponível", "Disponível"},
 {"Disponível", "Disponível", "Disponível", "Disponível", "Disponível", "Disponível"},
 {"Disponível", "Disponível", "Disponível", "Disponível", "Disponível", "Disponível"},
 {"Disponível", "Disponível", "Disponível", "Disponível", "Disponível", "Disponível"},
 {"Disponível", "Disponível", "Disponível", "Disponível", "Disponível", "Disponível"},
 {"Disponível", "Disponível", "Disponível", "Disponível", "Disponível", "Disponível"},
 {"Disponível", "Disponível", "Disponível", "Disponível", "Disponível", "Disponível"},
 {"Disponível", "Disponível", "Disponível", "Disponível", "Disponível", "Disponível"},
 {"Disponível", "Disponível", "Disponível", "Disponível", "Disponível", "Disponível"},
{"Disponível", "Disponível", "Disponível", "Disponível", "Disponível", "Disponível"},
 {"Disponível", "Disponível", "Disponível", "Disponível", "Disponível", "Disponível"}
 };
 private JPanel panel2;
 public TelaHorario() {
 DefaultTableModel modelo = new DefaultTableModel(dados, colunas);
 JTable tabela = new JTable(modelo);
 panel2 = new JPanel();
 panel2.setSize(800, 600);
 panel2.add(tabela);
 super.panel.add(panel2);
 }
 public static void main(String args[]) {
 TelaHorario th = new TelaHorario();
 }
}

