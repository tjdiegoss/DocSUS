
package br.com.tjdiego.docsus.GUI;

import br.com.tjdiego.docsus.Negocio.Controle.ControlePosto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Diego
 */


public class TelaCadastroPosto extends JFrame implements ActionListener{
 private JLabel textoTitulo, textoIdentificacao, textoCodigo, textoNome, 
 textoEndereco, textoLogradouro, textoNumero, textoComplemento,
 textoBairro, textoCep, textoMunicipio, textoTelefone;
 public static JTextField campoCodigo, campoNome, campoLogradouro, 
 campoNumero, campoComplemento, campoBairro, campoCep,
 campoMunicipio, campoTelefone1;
 private JButton salvar, cancelar;
 private JLabel fundo;
 private JPanel panel;
 
 public TelaCadastroPosto() {
 textoTitulo = new JLabel("Cadastrar Posto");
 textoTitulo.setSize(150, 20);
textoIdentificacao = new JLabel("Identificação");
 textoIdentificacao.setSize(120, 20);
 textoCodigo = new JLabel("Código:");
 textoCodigo.setSize(60, 20);
 campoCodigo = new JTextField();
 campoCodigo.setSize(120, 20);
 textoNome = new JLabel("Nome:");
 textoNome.setSize(40, 20);
 campoNome = new JTextField();
 campoNome.setSize(200, 20);
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
 textoTelefone = new JLabel("Telefone:");
 textoTelefone.setSize(80, 20);
 campoTelefone1 = new JTextField();
 campoTelefone1.setSize(130, 20);salvar = new JButton("Salvar");
 salvar.setSize(120, 40);
 salvar.addActionListener(this);
 cancelar = new JButton("Cancelar");
 cancelar.setSize(120, 40);
 cancelar.addActionListener(this);
 panel = new JPanel();
 panel.setLayout(null);
 panel.setSize(800, 600);
 panel.add(textoTitulo).setLocation(325, 10);
 panel.add(textoIdentificacao).setLocation(340, 40);
 panel.add(textoCodigo).setLocation(20, 70);
 panel.add(campoCodigo).setLocation(70, 70);
 panel.add(textoNome).setLocation(220, 70);
 panel.add(campoNome).setLocation(270, 70);
 panel.add(textoEndereco).setLocation(340, 100);
 panel.add(textoLogradouro).setLocation(20, 130);
 panel.add(campoLogradouro).setLocation(110, 130);
 panel.add(textoNumero).setLocation(520, 130);
 panel.add(campoNumero).setLocation(590, 130);
 panel.add(textoComplemento).setLocation(20, 160);
 panel.add(campoComplemento).setLocation(110, 160);
 panel.add(textoBairro).setLocation(240, 160);
panel.add(campoBairro).setLocation(290, 160);
 panel.add(textoCep).setLocation(20, 190);
 panel.add(campoCep).setLocation(70, 190);
 panel.add(textoMunicipio).setLocation(160, 190);
 panel.add(campoMunicipio).setLocation(240, 190);
 panel.add(textoTelefone).setLocation(20, 220);
 panel.add(campoTelefone1).setLocation(100, 220);
 panel.add(salvar).setLocation(245, 500);
 panel.add(cancelar).setLocation(425, 500);
 new JFrame();
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 setSize(800, 600);
 setLocationRelativeTo(null);
 setResizable(false);
 add(panel);
 setVisible(true);
 }
 public void actionPerformed(ActionEvent e) {
 if(e.getSource()== salvar){
 new ControlePosto().cadastrar();
 this.dispose();
 new TelaPrincipal();
 }else
if(e.getSource()== cancelar){
 System.exit(0);
 }
 }
}
