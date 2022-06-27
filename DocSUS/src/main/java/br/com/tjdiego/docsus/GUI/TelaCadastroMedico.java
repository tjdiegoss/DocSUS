
package br.com.tjdiego.docsus.GUI;

/**
 *
 * @author Diego
 */
package GUI;
import Negocio.Excecoes.ObjetoExistenteException;
import Negocio.Fachada.ControleMedico;
import Negocio.Medico;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class TelaCadastroMedico extends Tela implements ActionListener{
private JLabel textoTitulo, textoIdentificacao, textoNome, textoCpf, 
 textoTelefoneFixo, textoCelular, textoCrm, textoEspecializao,
 textoHorario, textoEndereco, textoLogradouro, textoNumero,
 textoComplemento, textoBairro, textoCep, textoMunicipio;
 public static JTextField campoNome, campoCpf, campoTelefoneFixo,
 campoCelular, campoCrm, campoEspecializacao, campoHorario,
 campoLogradouro, campoNumero, campoComplemento, campoBairro,
 campoCep, campoMunicipio;
 private JButton salvar, cancelar;
 public TelaCadastroMedico(Medico medico){
 textoTitulo = new JLabel("Atualizar Medico");
 textoTitulo.setSize(150, 20);
 textoIdentificacao = new JLabel("Identificação");
 textoIdentificacao.setSize(120, 20);
 textoNome = new JLabel("Nome:");
 textoNome.setSize(40, 20);
 campoNome = new JTextField();
 campoNome.setSize(560, 20);
 campoNome.setText(medico.getNome());
 textoCpf = new JLabel("CPF:");
 textoCpf.setSize(40, 20);
campoCpf = new JTextField();
 campoCpf.setSize(110, 20);
 campoCpf.setText("" + medico.getCpf());
 textoTelefoneFixo = new JLabel("Telefone Fixo:");
 textoTelefoneFixo.setSize(140, 20);
 campoTelefoneFixo = new JTextField();
 campoTelefoneFixo.setSize(130, 20);
 campoTelefoneFixo.setText(medico.getTelefone().get(0));
 textoCelular = new JLabel("Celular:");
 textoCelular.setSize(70, 20);
 campoCelular = new JTextField();
 campoCelular.setSize(130, 20);
 campoCelular.setText(medico.getTelefone().get(1));
 textoCrm = new JLabel("CRM:");
 textoCrm.setSize(60, 20);
 campoCrm = new JTextField();
 campoCrm.setSize(120, 20);
 campoCrm.setText("" + medico.getCrm());
 textoEspecializao = new JLabel("Especialização:");
 textoEspecializao.setSize(100, 20);
 campoEspecializacao = new JTextField();
 campoEspecializacao.setSize(180, 20);
campoEspecializacao.setText(medico.getEspecializacao());
 textoHorario = new JLabel("Horário de atendimento:");
 textoHorario.setSize(200, 20);
 campoHorario = new JTextField();
 campoHorario.setSize(150, 20);
 textoEndereco = new JLabel("Endereço");
 textoEndereco.setSize(120, 20);
 textoLogradouro = new JLabel("Logradouro:");
 textoLogradouro.setSize(80, 20);
 campoLogradouro = new JTextField();
 campoLogradouro.setSize(400, 20);
 campoLogradouro.setText(medico.endereco.getLogradouro());
 textoNumero = new JLabel("Número:");
 textoNumero.setSize(60, 20);
 campoNumero = new JTextField();
 campoNumero.setSize(80, 20);
 campoNumero.setText(("" + medico.endereco.getNumero()));
 textoComplemento = new JLabel("Complemento:");
 textoComplemento.setSize(100, 20);
 campoComplemento = new JTextField();
campoComplemento.setSize(120, 20);
 campoComplemento.setText(medico.endereco.getComplemento());
 textoBairro = new JLabel("Bairro:");
 textoBairro.setSize(60, 20);
 campoBairro = new JTextField();
 campoBairro.setSize(300, 20);
 campoBairro.setText(medico.endereco.getBairro());
 textoCep = new JLabel("CEP:");
 textoCep.setSize(40, 20);
 campoCep = new JTextField();
 campoCep.setSize(80, 20);
 campoCep.setText("" + medico.endereco.getCep());
 textoMunicipio = new JLabel("Município:");
 textoMunicipio.setSize(80, 20);
 campoMunicipio = new JTextField();
 campoMunicipio.setSize(350, 20);
 campoMunicipio.setText(medico.endereco.getMunicipio());
 salvar = new JButton("Salvar");
 salvar.setSize(120, 40);
 salvar.addActionListener(this);
 cancelar = new JButton("Cancelar");
 cancelar.setSize(120, 40);
 cancelar.addActionListener(this);
 super.panel.add(textoTitulo).setLocation(325, 20);
 super.panel.add(textoIdentificacao).setLocation(325, 40);
 super.panel.add(textoNome).setLocation(20, 80);
 super.panel.add(campoNome).setLocation(60, 80);
 super.panel.add(textoCpf).setLocation(20, 110);
 super.panel.add(campoCpf).setLocation(60, 110);
 super.panel.add(textoTelefoneFixo).setLocation(180, 110);
 super.panel.add(campoTelefoneFixo).setLocation(280, 110);
 super.panel.add(textoCelular).setLocation(430, 110);
 super.panel.add(campoCelular).setLocation(490, 110);
 super.panel.add(textoCrm).setLocation(20, 140);
 super.panel.add(campoCrm).setLocation(60, 140);
 super.panel.add(textoEspecializao).setLocation(185, 140);
 super.panel.add(campoEspecializacao).setLocation(285, 140);
 super.panel.add(textoHorario).setLocation(475, 140);
 super.panel.add(campoHorario).setLocation(620, 140);
 super.panel.add(textoEndereco).setLocation(340, 170);
 super.panel.add(textoLogradouro).setLocation(20, 200);
 super.panel.add(campoLogradouro).setLocation(110, 200);
 super.panel.add(textoNumero).setLocation(520, 200);
 super.panel.add(campoNumero).setLocation(590, 200);
super.panel.add(textoComplemento).setLocation(20, 230);
 super.panel.add(campoComplemento).setLocation(110, 230);
 super.panel.add(textoBairro).setLocation(240, 230);
 super.panel.add(campoBairro).setLocation(290, 230);
 super.panel.add(textoCep).setLocation(20, 260);
 super.panel.add(campoCep).setLocation(70, 260);
 super.panel.add(textoMunicipio).setLocation(160, 260);
 super.panel.add(campoMunicipio).setLocation(240, 260);
 super.panel.add(salvar).setLocation(245, 500);
 super.panel.add(cancelar).setLocation(425, 500);
 }
 public TelaCadastroMedico(){
 textoTitulo = new JLabel("Novo Medico");
 textoTitulo.setSize(150, 20);
 textoIdentificacao = new JLabel("Identificação");
 textoIdentificacao.setSize(120, 20);
 textoNome = new JLabel("Nome:");
 textoNome.setSize(40, 20);
 campoNome = new JTextField();
 campoNome.setSize(560, 20);
 textoCpf = new JLabel("CPF:");
textoCpf.setSize(40, 20);
 campoCpf = new JTextField();
 campoCpf.setSize(110, 20);
 textoTelefoneFixo = new JLabel("Telefone Fixo:");
 textoTelefoneFixo.setSize(140, 20);
 campoTelefoneFixo = new JTextField();
 campoTelefoneFixo.setSize(130, 20);
 textoCelular = new JLabel("Celular:");
 textoCelular.setSize(70, 20);
 campoCelular = new JTextField();
 campoCelular.setSize(130, 20);
 textoCrm = new JLabel("CRM:");
 textoCrm.setSize(60, 20);
 campoCrm = new JTextField();
 campoCrm.setSize(120, 20);
 textoEspecializao = new JLabel("Especialização:");
 textoEspecializao.setSize(100, 20);
 campoEspecializacao = new JTextField();
 campoEspecializacao.setSize(180, 20);
 textoHorario = new JLabel("Horário de atendimento:");
 textoHorario.setSize(200, 20);
campoHorario = new JTextField();
 campoHorario.setSize(150, 20);
 textoEndereco = new JLabel("Endereço");
 textoEndereco.setSize(120, 20);
 textoLogradouro = new JLabel("Logradouro:");
 textoLogradouro.setSize(80, 20);
 campoLogradouro = new JTextField();
 campoLogradouro.setSize(400, 20);
 textoNumero = new JLabel("Número:");
 textoNumero.setSize(60, 20);
 campoNumero = new JTextField();
 campoNumero.setSize(80, 20);
 textoComplemento = new JLabel("Complemento:");
 textoComplemento.setSize(100, 20);
 campoComplemento = new JTextField();
 campoComplemento.setSize(120, 20);
 textoBairro = new JLabel("Bairro:");
 textoBairro.setSize(60, 20);
 campoBairro = new JTextField();
 campoBairro.setSize(300, 20);
textoCep = new JLabel("CEP:");
 textoCep.setSize(40, 20);
 campoCep = new JTextField();
 campoCep.setSize(80, 20);
 textoMunicipio = new JLabel("Município:");
 textoMunicipio.setSize(80, 20);
 campoMunicipio = new JTextField();
 campoMunicipio.setSize(350, 20);
 salvar = new JButton("Salvar");
 salvar.setSize(120, 40);
 salvar.addActionListener(this);
 cancelar = new JButton("Cancelar");
 cancelar.setSize(120, 40);
 cancelar.addActionListener(this);
 super.panel.add(textoTitulo).setLocation(325, 20);
 super.panel.add(textoIdentificacao).setLocation(325, 40);
 super.panel.add(textoNome).setLocation(20, 80);
 super.panel.add(campoNome).setLocation(60, 80);
 super.panel.add(textoCpf).setLocation(20, 110);
 super.panel.add(campoCpf).setLocation(60, 110);
 super.panel.add(textoTelefoneFixo).setLocation(180, 110);
super.panel.add(campoTelefoneFixo).setLocation(280, 110);
 super.panel.add(textoCelular).setLocation(430, 110);
 super.panel.add(campoCelular).setLocation(490, 110);
 super.panel.add(textoCrm).setLocation(20, 140);
 super.panel.add(campoCrm).setLocation(60, 140);
 super.panel.add(textoEspecializao).setLocation(185, 140);
 super.panel.add(campoEspecializacao).setLocation(285, 140);
 super.panel.add(textoHorario).setLocation(475, 140);
 super.panel.add(campoHorario).setLocation(620, 140);
 super.panel.add(textoEndereco).setLocation(340, 170);
 super.panel.add(textoLogradouro).setLocation(20, 200);
 super.panel.add(campoLogradouro).setLocation(110, 200);
 super.panel.add(textoNumero).setLocation(520, 200);
 super.panel.add(campoNumero).setLocation(590, 200);
 super.panel.add(textoComplemento).setLocation(20, 230);
 super.panel.add(campoComplemento).setLocation(110, 230);
 super.panel.add(textoBairro).setLocation(240, 230);
 super.panel.add(campoBairro).setLocation(290, 230);
 super.panel.add(textoCep).setLocation(20, 260);
 super.panel.add(campoCep).setLocation(70, 260);
 super.panel.add(textoMunicipio).setLocation(160, 260);
 super.panel.add(campoMunicipio).setLocation(240, 260);
 super.panel.add(salvar).setLocation(245, 500);
 super.panel.add(cancelar).setLocation(425, 500);
 }
public static void main(String args[]){
 TelaCadastroMedico cu = new TelaCadastroMedico();
 }
 public void actionPerformed(ActionEvent e) {
 if(e.getSource()== salvar){
 try{
 super.dispose();
 new ControleMedico().cadastrar();
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
