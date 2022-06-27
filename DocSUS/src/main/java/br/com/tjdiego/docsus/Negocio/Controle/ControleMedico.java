
package br.com.tjdiego.docsus.Negocio.Controle;

/**
 *
 * @author Diego
 */
package Negocio.Fachada;
import Dados.RepositorioMedicos;
import GUI.TelaCadastroMedico;
import Negocio.Endereco;
import Negocio.Excecoes.ObjetoExistenteException;
import Negocio.Horario;
import Negocio.Medico;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class ControleMedico implements Controle<Medico>{
 
 Medico medico;
 private RepositorioMedicos repM = new RepositorioMedicos();
 public ControleMedico(){
 
 }
 public void cadastrar() throws ObjetoExistenteException{
 String nome = GUI.TelaCadastroMedico.campoNome.getText();
 String cpf = GUI.TelaCadastroMedico.campoCpf.getText();
 String logradouro = GUI.TelaCadastroMedico.campoLogradouro.getText();
 int numero = Integer.parseInt(GUI.TelaCadastroMedico.campoNumero.getText());
 String bairro = GUI.TelaCadastroMedico.campoBairro.getText();
 String municipio = GUI.TelaCadastroMedico.campoMunicipio.getText();
 String complemento = GUI.TelaCadastroMedico.campoComplemento.getText();
 int cep = Integer.parseInt(GUI.TelaCadastroMedico.campoCep.getText());
 Endereco endereco = new Endereco(logradouro, numero, bairro, municipio, 
complemento, cep);
 String tel, tel2 = null;
tel = GUI.TelaCadastroMedico.campoTelefoneFixo.getText();
 tel2 = GUI.TelaCadastroMedico.campoCelular.getText();
 ArrayList<String> telefone = new ArrayList<String>();
 telefone.add(tel);
 telefone.add(tel2);
 int crm = Integer.parseInt(GUI.TelaCadastroMedico.campoCrm.getText());
 String especializacao = GUI.TelaCadastroMedico.campoEspecializacao.getText();
 //Horario horario = GUI.TelaCadastroMedico.campoHorario.getText();
 repM.getListaMedicos().add(new Medico(nome, cpf, endereco, telefone, 
especializacao, null, crm));
 JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
 }
 public String buscar(String busca) {
 String result = "";
 busca = GUI.TelaPesquisa.busca.getText();
 for (int i = 0; i < repM.getListaMedicos().size(); i++) {
 if (repM.getListaMedicos().get(i).getCpf().equals(busca)) {
 result = repM.getListaMedicos().get(i).toHTML();
 } else {
 result = "Não encontrado!";
 }
 }
return result;
 }
 public void alterar(String busca) {
 busca = GUI.TelaPesquisa.busca.getText();
 for (int i = 0; i < repM.getListaMedicos().size(); i++) {
 if(busca.equals(repM.getListaMedicos().get(i).getCpf())){
 new TelaCadastroMedico(repM.getListaMedicos().get(i));
 }}
 }
 public void deletar(String busca) {
 busca = GUI.TelaPesquisa.busca.getText();
 for (int i = 0; i < repM.getListaMedicos().size(); i++) {
 if(busca.equals(repM.getListaMedicos().get(i).getCpf())){
 repM.getListaMedicos().remove(i);
 JOptionPane.showMessageDialog(null, "Removido com sucesso!");
 }else {JOptionPane.showMessageDialog(null, "Não encontrado!");}}
 } 
public static void main(String args[]){
 ControleMedico cm = new ControleMedico();
} 
}

