
package br.com.tjdiego.docsus.GUI;

import br.com.tjdiego.docsus.Negocio.Controle.ControleEnfermeiro;
import br.com.tjdiego.docsus.Negocio.Enfermeiro;
import br.com.tjdiego.docsus.Negocio.Excecoes.ObjetoExistenteException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Diego
 */


public class TelaCadastroEnfermeiro extends Tela implements ActionListener{
 private JLabel textoTitulo, textoIdentificacao, textoNome, textoCpf, 
 textoTelefoneFixo, textoCelular, textoCoren, textoEndereco,
 textoLogradouro, textoNumero, textoComplemento, textoBairro,
 textoCep, textoMunicipio;
 public static JTextField campoNome, campoCpf, campoTelefoneFixo,
 campoCelular, campoCoren, campoLogradouro, campoNumero,
 campoComplemento, campoBairro, campoCep, campoMunicipio;
 private JButton salvar, cancelar;
 public TelaCadastroEnfermeiro(Enfermeiro enfermeiro){
 textoTitulo = new JLabel("Novo Enfermeiro");
 textoTitulo.setSize(150, 20);
 textoIdentificacao = new JLabel("Identificação");
 textoIdentificacao.setSize(120, 20);
 textoNome = new JLabel("Nome:");
 textoNome.setSize(40, 20);
 campoNome = new JTextField();
campoNome.setSize(560, 20);
 campoNome.setText(enfermeiro.getNome());
 textoCpf = new JLabel("CPF:");
 textoCpf.setSize(40, 20);
 campoCpf = new JTextField();
 campoCpf.setSize(110, 20);
 campoCpf.setText("" + enfermeiro.getCpf());
 textoTelefoneFixo = new JLabel("Telefone Fixo:");
 textoTelefoneFixo.setSize(140, 20);
 campoTelefoneFixo = new JTextField();
 campoTelefoneFixo.setSize(130, 20);
 campoTelefoneFixo.setText(enfermeiro.getTelefone().get(0));
 textoCelular = new JLabel("Celular:");
 textoCelular.setSize(70, 20);
 campoCelular = new JTextField();
 campoCelular.setSize(130, 20);
 campoCelular.setText(enfermeiro.getTelefone().get(1));
 textoCoren = new JLabel("Coren:");
 textoCoren.setSize(60, 20);
 campoCoren = new JTextField();
 campoCoren.setSize(120, 20);
 campoCoren.setText(""+ enfermeiro.getCoren());
textoEndereco = new JLabel("Endereço");
 textoEndereco.setSize(120, 20);
 textoLogradouro = new JLabel("Logradouro:");
 textoLogradouro.setSize(80, 20);
 campoLogradouro = new JTextField();
 campoLogradouro.setSize(400, 20);
 campoLogradouro.setText(enfermeiro.endereco.getLogradouro());
 textoNumero = new JLabel("Número:");
 textoNumero.setSize(60, 20);
 campoNumero = new JTextField();
 campoNumero.setSize(80, 20);
 campoNumero.setText(("" + enfermeiro.endereco.getNumero()));
 textoComplemento = new JLabel("Complemento:");
 textoComplemento.setSize(100, 20);
 campoComplemento = new JTextField();
 campoComplemento.setSize(120, 20);
 campoComplemento.setText(enfermeiro.endereco.getComplemento());
 textoBairro = new JLabel("Bairro:");
 textoBairro.setSize(60, 20);
 campoBairro = new JTextField();
 campoBairro.setSize(300, 20);
campoBairro.setText(enfermeiro.endereco.getBairro());
 textoCep = new JLabel("CEP:");
 textoCep.setSize(40, 20);
 campoCep = new JTextField();
 campoCep.setSize(80, 20);
 campoCep.setText("" + enfermeiro.endereco.getCep());
 textoMunicipio = new JLabel("Município:");
 textoMunicipio.setSize(80, 20);
 campoMunicipio = new JTextField();
 campoMunicipio.setSize(350, 20);
 campoMunicipio.setText(enfermeiro.endereco.getMunicipio());
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
 super.panel.add(textoCoren).setLocation(20, 140);
 super.panel.add(campoCoren).setLocation(80, 140);
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
public TelaCadastroEnfermeiro(){
 textoTitulo = new JLabel("Novo Enfermeiro");
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
textoCoren = new JLabel("Coren:");
 textoCoren.setSize(60, 20);
 campoCoren = new JTextField();
 campoCoren.setSize(120, 20);
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
 super.panel.add(textoCoren).setLocation(20, 140);
 super.panel.add(campoCoren).setLocation(80, 140);
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
public void actionPerformed(ActionEvent e) {
 if(e.getSource()== salvar){
 try{
 super.dispose();
 new ControleEnfermeiro().cadastrar();
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

