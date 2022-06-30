
package Telas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Diego
 */



public class TelaCadastro extends Tela implements ActionListener{
private JLabel textoTitulo;
 private JButton btPaciente, btMedico, btConsulta, btMedicamento, btAgente,
 btEnfermeiro, btDentista, btVisita;
 public TelaCadastro(){
 textoTitulo = new JLabel("Escolha uma opção");
 textoTitulo.setSize(150, 20);
 btPaciente = new JButton("Paciente");
 btPaciente.setSize(120, 120);
 btPaciente.addActionListener(this);
 btMedico = new JButton("Medico");
 btMedico.setSize(120, 120);
 btMedico.addActionListener(this);
 btConsulta = new JButton("Consulta");
 btConsulta.setSize(120, 120);
 btConsulta.addActionListener(this);
 btMedicamento = new JButton("Medicamento");
 btMedicamento.setSize(120, 120);
 btMedicamento.addActionListener(this);
btAgente = new JButton("Agente");
 btAgente.setSize(120, 120);
 btAgente.addActionListener(this);
 btEnfermeiro = new JButton("Enfermeiro");
 btEnfermeiro.setSize(120, 120);
 btEnfermeiro.addActionListener(this);
 btDentista = new JButton("Dentista");
 btDentista.setSize(120, 120);
 btDentista.addActionListener(this);
 btVisita = new JButton("Visita");
 btVisita.setSize(120, 120);
 btVisita.addActionListener(this);
 super.panel.add(textoTitulo).setLocation(350, 20);
 super.panel.add(btConsulta).setLocation(40, 100);
 super.panel.add(btPaciente).setLocation(240, 100);
 super.panel.add(btAgente).setLocation(440, 100);
 super.panel.add(btEnfermeiro).setLocation(640, 100);
 super.panel.add(btVisita).setLocation(40, 250);
 super.panel.add(btMedicamento).setLocation(240, 250);
 super.panel.add(btMedico).setLocation(440, 250);
 super.panel.add(btDentista).setLocation(640, 250);
 }
 public void actionPerformed(ActionEvent e) {
 if(e.getSource()== btConsulta){
 super.dispose();
 new TelaCadastroConsulta();
 }else
 if(e.getSource()== btPaciente){
 super.dispose();
 new TelaCadastroPaciente();
 }else
 if(e.getSource()== btAgente){
 super.dispose();
 new TelaCadastroAgente();
 }else
 if(e.getSource()== btEnfermeiro){
 super.dispose();
 new TelaCadastroEnfermeiro();
 }else
 if(e.getSource()== btVisita){
 super.dispose();
 new TelaCadastroVisita();
 }else
 if(e.getSource()== btMedicamento){
  super.dispose();
 new TelaCadastroMedicamento();
 }else
 if(e.getSource()== btMedico){
 super.dispose();
 new TelaCadastroMedico();
 }else
 if(e.getSource()== btDentista){
 super.dispose();
 new TelaCadastroDentista();
 }
 }
}
