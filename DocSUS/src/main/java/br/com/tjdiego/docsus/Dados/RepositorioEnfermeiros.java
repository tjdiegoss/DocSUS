
package br.com.tjdiego.docsus.Dados;

import br.com.tjdiego.docsus.Negocio.Enfermeiro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diego
 */


public class RepositorioEnfermeiros {
 //Cria um ArrayList do tipo Enfermeiro
 private List<Enfermeiro> listaEnfermeiro = new ArrayList<Enfermeiro>();
 //Método construtor
 public RepositorioEnfermeiros() {
 }
 //Método que retorna a lista de objetos do tipo Enfermeiro
 public List<Enfermeiro> getEnfermeiro(){
 
     return listaEnfermeiro;
 }
 
 
 
}