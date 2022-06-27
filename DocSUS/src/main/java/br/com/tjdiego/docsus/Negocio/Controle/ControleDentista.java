
package br.com.tjdiego.docsus.Negocio.Controle;

/**
 *
 * @author Diego
 */
package Negocio.Fachada;
import Dados.RepositorioDentistas;
import GUI.TelaCadastroDentista;
import Negocio.Dentista;
import Negocio.Endereco;
import Negocio.Excecoes.ObjetoExistenteException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class ControleDentista implements Controle<Dentista> {
 Dentista dentista;
 private RepositorioDentistas rd;
public ControleDentista() {
 this.rd = new RepositorioDentistas();
 }
 public void cadastrar() throws ObjetoExistenteException{
 String nome = GUI.TelaCadastroDentista.campoNome.getText();
 String cpf = GUI.TelaCadastroDentista.campoCpf.getText();
 String logradouro = GUI.TelaCadastroDentista.campoLogradouro.getText();
 int numero = 
Integer.parseInt(GUI.TelaCadastroDentista.campoNumero.getText());
 String bairro = GUI.TelaCadastroDentista.campoBairro.getText();
 String municipio = GUI.TelaCadastroDentista.campoMunicipio.getText();
 String complemento = GUI.TelaCadastroDentista.campoComplemento.getText();
 int cep = Integer.parseInt(GUI.TelaCadastroDentista.campoCep.getText());
 Endereco endereco = new Endereco(logradouro, numero, bairro,
 municipio, complemento, cep);
 String tel, tel2 = null;
 tel = GUI.TelaCadastroDentista.campoTelefoneFixo.getText();
 tel2 = GUI.TelaCadastroDentista.campoCelular.getText();
 ArrayList<String> telefone = new ArrayList<String>();
 telefone.add(tel);
 telefone.add(tel2);
 int cro = Integer.parseInt(GUI.TelaCadastroDentista.campoCro.getText());
 rd.getListaDentistas().add(new Dentista(nome, cpf, endereco, telefone, cro));
 JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
 }
public String buscar(String busca) {
 String result = "";
 busca = GUI.TelaPesquisa.busca.getText();
 for (int i = 0; i < rd.getListaDentistas().size(); i++) {
 if (rd.getListaDentistas().get(i).getCpf().equals(busca)){
 result = rd.getListaDentistas().get(i).toHTML();
 } else {
 result = "Não encontrado!";
 }
 }
 return result;
 }
 public void alterar(String busca) {
 busca = GUI.TelaPesquisa.busca.getText();
 for (int i = 0; i < rd.getListaDentistas().size(); i++) {
 if(busca.equals(rd.getListaDentistas().get(i).getCpf())){
 new TelaCadastroDentista(rd.getListaDentistas().get(i));
 }}
 }
 public void deletar(String busca) {
busca =GUI.TelaPesquisa.busca.getText();
 for (int i = 0; i < rd.getListaDentistas().size(); i++) {
 if(busca.equals(rd.getListaDentistas().get(i).getCpf())){
 rd.getListaDentistas().remove(i);
 JOptionPane.showMessageDialog(null, "Removido com sucesso!");
 }else {JOptionPane.showMessageDialog(null, "Não encontrado!");}}
}
}
