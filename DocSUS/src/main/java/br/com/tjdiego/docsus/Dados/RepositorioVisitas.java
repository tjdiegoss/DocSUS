
package br.com.tjdiego.docsus.Dados;

/**
 *
 * @author Diego
 */
package Dados;
import Negocio.Visita;
import java.util.ArrayList;
import java.util.List;
public class RepositorioVisitas {
 //Cria uma lista de objetos do tipo Visita
 private List<Visita> listaVisitas = new ArrayList<Visita>();
 //Método construtor
 public RepositorioVisitas() {
 }
 //Retorna a lista de objetos do tipo Visita
 public List<Visita> getListaVisitas() {
 return listaVisitas;
 }
 
}

