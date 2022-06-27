
package br.com.tjdiego.docsus.Negocio.Fachada;

/**
 *
 * @author Diego
 */
package Negocio.Fachada;
import Negocio.Visita;
import Dados.RepositorioAgentes;
import Dados.RepositorioHorarios;
import Dados.RepositorioPacientes;
import Dados.RepositorioVisitas;
import Negocio.Excecoes.ObjetoExistenteException;
public class ControleVisita implements Controle<Visita>{
 
 private RepositorioVisitas rv = new RepositorioVisitas();
 public ControleVisita(){
 
 }
 public void cadastrar() throws ObjetoExistenteException{
throw new UnsupportedOperationException("Not supported yet.");
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
