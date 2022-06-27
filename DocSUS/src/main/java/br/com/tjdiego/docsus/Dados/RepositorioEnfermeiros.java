
package br.com.tjdiego.docsus.Dados;

/**
 *
 * @author Diego
 */
package Dados;
import Negocio.Enfermeiro;
import java.util.ArrayList;
import java.util.List;
public class RepositorioEnfermeiros {
 //Cria um ArrayList do tipo Enfermeiro
 private List<Enfermeiro> listaEnfermeiro = new ArrayList<Enfermeiro>();
 //Método construtor
 public RepositorioEnfermeiros() {
 }
 //Método que retorna a lista de objetos do tipo Enfermeiro
 public List<Enfermeiro> getListaEnfermeiro() {
 return listaEnfermeiro;
 }
 
}