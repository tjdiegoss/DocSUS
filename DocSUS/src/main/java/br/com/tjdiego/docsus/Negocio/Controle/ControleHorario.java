
package br.com.tjdiego.docsus.Negocio.Controle;

/**
 *
 * @author Diego
 */
import Negocio.Horario;
import Dados.RepositorioHorarios;
import javax.swing.JOptionPane;
public class ControleHorario implements Controle<Horario>{
 Horario horario;
 private RepositorioHorarios rh;
 public ControleHorario(){
 this.rh = new RepositorioHorarios();
 }
 public void cadastrar() {
 String data = JOptionPane.showInputDialog("Digite a data");
 String hora = JOptionPane.showInputDialog("Digite a hora");
 rh.getListaHorario().add(new Horario(data, hora));
 JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
 }
 public String buscar(String busca) {
throw new UnsupportedOperationException("Not supported yet.");
 }
 public void alterar(String busca) {
 throw new UnsupportedOperationException("Not supported yet.");
 }
 public void deletar(String busca) {
 throw new UnsupportedOperationException("Not supported yet.");
 }
 
}
