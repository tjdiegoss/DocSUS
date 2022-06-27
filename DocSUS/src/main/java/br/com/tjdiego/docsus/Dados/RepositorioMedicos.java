
package br.com.tjdiego.docsus.Dados;

/**
 *
 * @author Diego
 */
package Dados;
import Negocio.Medico;
import java.util.ArrayList;
import java.util.List;
public class RepositorioMedicos {
 //Cria uma lista de objetos do tipo Medico
 private List<Medico> listaMedicos = new ArrayList<Medico>();
 //Método construtor
 public RepositorioMedicos() {
 }
 //Método que retorna a lista de objetos do tipo Medico
 public List<Medico> getListaMedicos() {
 return listaMedicos;
 } 
}

