
package br.com.tjdiego.docsus.Negocio.Controle;

import br.com.tjdiego.docsus.Dados.RepositorioAgentes;
import Telas.TelaCadastroAgente;
import br.com.tjdiego.docsus.Negocio.Agente;
import br.com.tjdiego.docsus.Negocio.Excecoes.ObjetoExistenteException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */



public class ControleAgente implements Controle<Agente> {
 private static RepositorioAgentes ra = new RepositorioAgentes();
 public ControleAgente(){
}
 public void cadastrar() throws ObjetoExistenteException{
 String nome = GUI.TelaCadastroAgente.campoNome.getText(); 
String cpf = GUI.TelaCadastroAgente.campoCpf.getText();
 String tel, tel2 = null;
 tel = GUI.TelaCadastroAgente.campoTelefoneFixo.getText();
 tel2 = GUI.TelaCadastroAgente.campoCelular.getText();
 ArrayList<String> telefone = new ArrayList<String>();
 telefone.add(tel);
 telefone.add(tel2);
 String logradouro = GUI.TelaCadastroAgente.campoLogradouro.getText(); 
 int numero = Integer.parseInt(GUI.TelaCadastroAgente.campoNumero.getText()); 
 String bairro = GUI.TelaCadastroAgente.campoBairro.getText();
 String municipio = GUI.TelaCadastroAgente.campoMunicipio.getText();
 String complemento = GUI.TelaCadastroAgente.campoComplemento.getText(); 
 int cep = Integer.parseInt(GUI.TelaCadastroAgente.campoCep.getText()); 
 Endereco endereco = new Endereco(logradouro, numero, bairro,
 municipio, complemento, cep);
 String codigo = GUI.TelaCadastroAgente.campoCodigo.getText();
 String funcao = GUI.TelaCadastroAgente.campoFuncao.getText();
 ra.getListaAgentes().add(new Agente(nome, cpf, endereco,
 telefone, codigo, funcao));
 JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
 
 }
 public String buscar(String busca) {
 String result = "";
busca = GUI.TelaPesquisa.busca.getText();
 for (int i = 0; i < ra.getListaAgentes().size(); i++) {
 if (ra.getListaAgentes().get(i).getCpf().equals(busca) ||
 ra.getListaAgentes().get(i).getCodigo().equals(busca)) {
 result = ra.getListaAgentes().get(i).toHTML();
 } else {
 result = "N??o encontrado!";
 }
 }
 return result;
 }
 public void alterar(String busca) {
 busca = GUI.TelaPesquisa.busca.getText();
 for (int i = 0; i < ra.getListaAgentes().size(); i++) {
 if(busca.equals(ra.getListaAgentes().get(i).getCpf()) ||
 busca.equals(ra.getListaAgentes().get(i).getCodigo())){
 new TelaCadastroAgente(ra.getListaAgentes().get(i));
 }}
 }
public void deletar(String busca) {
 busca = GUI.TelaPesquisa.busca.getText();
 for (int i = 0; i < ra.getListaAgentes().size(); i++) {
 if(busca.equals(ra.getListaAgentes().get(i).getCpf()) ||
 busca.equals(ra.getListaAgentes().get(i).getCpf())){
 ra.getListaAgentes().remove(i);
 JOptionPane.showMessageDialog(null, "Removido com sucesso!");
 }else {JOptionPane.showMessageDialog(null, "N??o encontrado!");}}
 }
}
