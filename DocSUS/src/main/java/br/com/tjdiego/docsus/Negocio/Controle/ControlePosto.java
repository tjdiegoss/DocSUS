
package br.com.tjdiego.docsus.Negocio.Controle;

/**
 *
 * @author Diego
 */
package Negocio.Fachada;
import Negocio.Endereco;
import Dados.RepositorioPosto;
import Negocio.PostoSaude;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class ControlePosto {
 private RepositorioPosto rp = new RepositorioPosto();
public ControlePosto(){
 
 }
 public void cadastrar() {
 try {
 String nome = GUI.TelaCadastroPosto.campoNome.getText();
 String codigoPosto = GUI.TelaCadastroPosto.campoNome.getText();
 String logradouro = GUI.TelaCadastroPosto.campoLogradouro.getText(); 
 int numero = Integer.parseInt(GUI.TelaCadastroPosto.campoNumero.getText());
 String complemento = GUI.TelaCadastroPosto.campoComplemento.getText();
 String bairro = GUI.TelaCadastroPosto.campoBairro.getText();
 int cep = Integer.parseInt(GUI.TelaCadastroPosto.campoCep.getText());
 String municipio = GUI.TelaCadastroPosto.campoMunicipio.getText();
 Endereco endereco = new Endereco(logradouro, numero, bairro, municipio, 
complemento, cep);
 String tel= null;
 tel = GUI.TelaCadastroPosto.campoTelefone1.getText();
 ArrayList<String> telefone = new ArrayList<String>();
 telefone.add(tel);
 rp.getPosto().add(new PostoSaude(codigoPosto, nome, endereco, telefone));
 } catch (NumberFormatException e) {
 JOptionPane.showMessageDialog(null, "Digite apenas números!");
 } 
 }
public void atualizar(){
 }
}

