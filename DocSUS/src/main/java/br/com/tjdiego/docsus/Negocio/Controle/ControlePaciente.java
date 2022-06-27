
package br.com.tjdiego.docsus.Negocio.Controle;

/**
 *
 * @author Diego
 */
package Negocio.Fachada;
import Dados.RepositorioPacientes;
import Negocio.Endereco;
import Negocio.Excecoes.ObjetoExistenteException;
import Negocio.Paciente;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class ControlePaciente implements Controle<Paciente> {
 private RepositorioPacientes rp;
 public ControlePaciente() {
 this.rp = new RepositorioPacientes();
 }
 public void cadastrar() throws ObjetoExistenteException{
 String nome = GUI.TelaCadastroPaciente.campoNome.getText();
 String cpf = GUI.TelaCadastroPaciente.campoCpf.getText();
 String logradouro = GUI.TelaCadastroPaciente.campoLogradouro.getText();
 int numero = 
Integer.parseInt(GUI.TelaCadastroPaciente.campoNumero.getText());
 String bairro = GUI.TelaCadastroPaciente.campoBairro.getText();
String municipio = GUI.TelaCadastroPaciente.campoMunicipio.getText();
 String complemento = GUI.TelaCadastroPaciente.campoComplemento.getText();
 int cep = Integer.parseInt(GUI.TelaCadastroPaciente.campoCep.getText());
 Endereco endereco = new Endereco(logradouro, numero, bairro, municipio, 
complemento, cep);
 String tel, tel2 = null;
 tel = GUI.TelaCadastroDentista.campoTelefoneFixo.getText();
 tel2 = GUI.TelaCadastroDentista.campoCelular.getText();
 ArrayList<String> telefone = new ArrayList<String>();
 telefone.add(tel);
 telefone.add(tel2);
 String sexo = GUI.TelaCadastroPaciente.sexo;
 String dataNasc = GUI.TelaCadastroPaciente.campoDataNasc.getText();
 rp.getListaPacientes().add(new Paciente(nome, cpf, endereco, telefone, sexo, 
dataNasc));
 JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
 }
 public String buscar(String busca) {
 Paciente paciente;
 busca = JOptionPane.showInputDialog("Digite o CPF do paciente a ser 
pesquisado");
 for (int i = 0; i < this.rp.getListaPacientes().size(); i++) {
 paciente = this.rp.getListaPacientes().get(i);
 if (paciente.getCpf() == busca) {
return paciente.toString();
 }
 }
 return null;
 }
 public void alterar(String busca) {
 throw new UnsupportedOperationException("Not supported yet.");
 }
 public void deletar(String busca) {
 throw new UnsupportedOperationException("Not supported yet.");
 }
}

