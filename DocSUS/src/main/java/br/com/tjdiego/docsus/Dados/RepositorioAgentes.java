
package br.com.tjdiego.docsus.Dados;

import br.com.tjdiego.docsus.Negocio.Agente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diego
 */




public class RepositorioAgentes {
 //Cria um ArrayList do tipo Agente
 private List<Agente> listaAgentes = new ArrayList<>();
 //Método construtor
 public RepositorioAgentes() {
 }
//Método que retorna a lista do tipo Agente
 public List<Agente> getListaAgentes() {
 return listaAgentes;
 }
}
