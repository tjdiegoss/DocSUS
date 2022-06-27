
package br.com.tjdiego.docsus.GUI;

/**
 *
 * @author Diego
 */
package GUI;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
public class TelaCadastroConsulta extends Tela{
private JLabel textoTitulo, textoPaciente, textoMedico, 
 resultadoPaciente, resultadoMedico, textoDia, textoHora;
 private JTextField buscaPaciente, buscaMedico;
 private JButton pesquisar1, pesquisar2, salvar, cancelar;
 private JComboBox comboDia, comboHora;
 public TelaCadastroConsulta(){
 textoTitulo = new JLabel("Nova Consulta");
 textoTitulo.setSize(150, 20);
 textoPaciente = new JLabel("CPF:");
 textoPaciente.setSize(40, 20);
 buscaPaciente = new JTextField();
 buscaPaciente.setSize(120, 20);
 resultadoPaciente = new JLabel("Paciente não encontrado!");
 resultadoPaciente.setSize(300, 20);
 textoMedico = new JLabel("CRM:");
 textoMedico.setSize(40, 20);
 buscaMedico = new JTextField();
 buscaMedico.setSize(120, 20);
 resultadoMedico = new JLabel("Médico não encontrado!");
 resultadoMedico.setSize(300, 20);
 salvar = new JButton("Salvar");
salvar.setSize(120, 40);
 cancelar = new JButton("Cancelar");
 cancelar.setSize(120, 40);
 pesquisar1 = new JButton("Buscar");
 pesquisar1.setSize(80, 20);
 pesquisar2 = new JButton("Buscar");
 pesquisar2.setSize(80, 20);
 textoDia = new JLabel("Dia:");
 textoDia.setSize(70, 20);
 comboDia = new JComboBox();
 comboDia.setSize(120, 20);
 comboDia.addItem("Escolha o dia");
 comboDia.addItem("Segunda-feira");
 comboDia.addItem("Terça-feira");
 comboDia.addItem("Quarta-feira");
 comboDia.addItem("Quinta-feira");
 comboDia.addItem("Sexta-feira");
 textoHora = new JLabel("Horário:");
 textoHora.setSize(120, 20);
 comboHora = new JComboBox();
 comboHora.setSize(150, 20);
 comboHora.addItem("Escolha o horário");
 comboHora.addItem("de 07:00 à 07:30");
comboHora.addItem("de 08:00 à 08:30");
 comboHora.addItem("de 09:00 à 09:30");
 comboHora.addItem("de 10:00 à 10:30");
 comboHora.addItem("de 11:00 à 11:30");
 comboHora.addItem("de 12:00 à 12:30");
 
 super.panel.add(textoTitulo).setLocation(325, 20);
 super.panel.add(textoPaciente).setLocation(60, 50); 
 super.panel.add(buscaPaciente).setLocation(100, 50);
 super.panel.add(pesquisar1).setLocation(230, 50);
 super.panel.add(resultadoPaciente).setLocation(320, 50);
 super.panel.add(textoMedico).setLocation(60, 80);
 super.panel.add(buscaMedico).setLocation(100, 80);
 super.panel.add(pesquisar2).setLocation(230, 80);
 super.panel.add(resultadoMedico).setLocation(320, 80);
 super.panel.add(salvar).setLocation(245, 500);
 super.panel.add(cancelar).setLocation(425, 500);
 super.panel.add(textoDia).setLocation(60, 110);
 super.panel.add(comboDia).setLocation(100, 110);
 super.panel.add(textoHora).setLocation(230, 110);
 super.panel.add(comboHora).setLocation(320, 110);
 }
 public static void main (String args[]){
 TelaCadastroConsulta tcc = new TelaCadastroConsulta();
 }
}
