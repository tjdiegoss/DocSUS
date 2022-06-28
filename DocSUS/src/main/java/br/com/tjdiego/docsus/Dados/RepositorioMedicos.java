
package br.com.tjdiego.docsus.Dados;

import br.com.tjdiego.docsus.Negocio.Medico;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diego
 */


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

