
package br.com.tjdiego.docsus.Negocio.Controle;

/**
 *
 * @author Diego
 */
package Negocio.Fachada;
import Dados.RepositorioMedicamentos;
import GUI.TelaCadastroMedicamento;
import Negocio.Excecoes.ObjetoExistenteException;
import Negocio.Medicamento;
import javax.swing.JOptionPane;
public class ControleMedicamento implements Controle<Medicamento>{
 private RepositorioMedicamentos repMeds = new RepositorioMedicamentos();
 public ControleMedicamento(){ 
 }
public void cadastrar() throws ObjetoExistenteException{
 String nomeMedicamento = 
GUI.TelaCadastroMedicamento.campoNome.getText();
 String descricao = GUI.TelaCadastroMedicamento.descricao.getText();
 String codigo = GUI.TelaCadastroMedicamento.campoCodigo.getText();
 repMeds.getListaMedicamentos().add(new Medicamento(nomeMedicamento, 
descricao, codigo));
 JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
 }
 public String buscar(String busca) {
 String result = "";
 busca = GUI.TelaPesquisa.busca.getText();
 for (int i = 0; i < repMeds.getListaMedicamentos().size(); i++) {
 if (repMeds.getListaMedicamentos().get(i).getCodigo().equals(busca)) {
 result = repMeds.getListaMedicamentos().get(i).toHTML();
 } else {
 result = "Não encontrado!";
 }
 }
 return result;
 }
 public void alterar(String busca) {
busca = GUI.TelaPesquisa.busca.getText();
 for (int i = 0; i < repMeds.getListaMedicamentos().size(); i++) {
 if(busca.equals(repMeds.getListaMedicamentos().get(i).getCodigo())){
 new TelaCadastroMedicamento(repMeds.getListaMedicamentos().get(i));
 }}
 }
 public void deletar(String busca) {
 busca = GUI.TelaPesquisa.busca.getText();
 for (int i = 0; i < repMeds.getListaMedicamentos().size(); i++) {
 if(busca.equals(repMeds.getListaMedicamentos().get(i).getCodigo())){
 repMeds.getListaMedicamentos().remove(i);
 JOptionPane.showMessageDialog(null, "Removido com sucesso!");
 }else {JOptionPane.showMessageDialog(null, "Não encontrado!");}}
 } 
}
