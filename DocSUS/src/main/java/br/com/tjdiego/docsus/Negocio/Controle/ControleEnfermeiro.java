
package br.com.tjdiego.docsus.Negocio.Controle;

/**
 *
 * @author Diego
 */
package Negocio.Fachada;
import Negocio.Endereco;
import Dados.RepositorioEnfermeiros;
import GUI.TelaCadastroEnfermeiro;
import Negocio.Enfermeiro;
import Negocio.Excecoes.ObjetoExistenteException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class ControleEnfermeiro implements Controle<Enfermeiro>{ 
 Enfermeiro enfermeiro;
 private RepositorioEnfermeiros renf = new RepositorioEnfermeiros();
 public ControleEnfermeiro(){
 
 }
public void cadastrar() throws ObjetoExistenteException{
 String nome = GUI.TelaCadastroEnfermeiro.campoNome.getText();
 String cpf = GUI.TelaCadastroEnfermeiro.campoCpf.getText();
 String logradouro = GUI.TelaCadastroEnfermeiro.campoLogradouro.getText();
 int numero = 
Integer.parseInt(GUI.TelaCadastroEnfermeiro.campoNumero.getText());
 String bairro = GUI.TelaCadastroEnfermeiro.campoBairro.getText();
 String municipio = GUI.TelaCadastroEnfermeiro.campoMunicipio.getText();
 String complemento = 
GUI.TelaCadastroEnfermeiro.campoComplemento.getText();
 int cep = Integer.parseInt(GUI.TelaCadastroEnfermeiro.campoCep.getText());
 Endereco endereco = new Endereco(logradouro, numero, bairro, municipio, 
complemento, cep);
 String tel, tel2 = null;
 tel = GUI.TelaCadastroEnfermeiro.campoTelefoneFixo.getText();
 tel2 = GUI.TelaCadastroEnfermeiro.campoCelular.getText();
 ArrayList<String> telefone = new ArrayList<String>();
 telefone.add(tel);
 telefone.add(tel2);
 int coren = Integer.parseInt(GUI.TelaCadastroEnfermeiro.campoCoren.getText());
 renf.getListaEnfermeiro().add(new Enfermeiro(nome, cpf, endereco, telefone, 
coren));
 JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
 }
 public String buscar(String busca) {
 String result = "";
busca = GUI.TelaPesquisa.busca.getText();
 for (int i = 0; i < renf.getListaEnfermeiro().size(); i++) {
 if (renf.getListaEnfermeiro().get(i).getCpf().equals(busca)) {
 result = renf.getListaEnfermeiro().get(i).toHTML();
 } else {
 result = "Não encontrado!";
 }
 }
 return result;
 }
 public void deletar(String busca) {
 busca = GUI.TelaPesquisa.busca.getText();
 for (int i = 0; i < renf.getListaEnfermeiro().size(); i++) {
 if(busca.equals(renf.getListaEnfermeiro().get(i).getCpf())){
 renf.getListaEnfermeiro().remove(i);
 JOptionPane.showMessageDialog(null, "Removido com sucesso!");
 }else {JOptionPane.showMessageDialog(null, "Não encontrado!");}}
 }
 public void alterar(String busca) {
 busca = GUI.TelaPesquisa.busca.getText();
 for (int i = 0; i < renf.getListaEnfermeiro().size(); i++) {
 if(busca.equals(renf.getListaEnfermeiro().get(i).getCpf())){
new TelaCadastroEnfermeiro(renf.getListaEnfermeiro().get(i));
 }}
 }
}
