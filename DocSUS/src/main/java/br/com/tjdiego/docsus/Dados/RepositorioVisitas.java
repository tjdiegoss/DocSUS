
package br.com.tjdiego.docsus.Dados;

import br.com.tjdiego.docsus.Negocio.Visita;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diego
 */

public class RepositorioVisitas {
 //Cria uma lista de objetos do tipo Visita
 private List<Visita> listaVisitas = new ArrayList<Visita>();
 //Método construtor
 public RepositorioVisitas() {
 }
 //Retorna a lista de objetos do tipo Visita
 public List<Visita> getListaVisitas(){
     return  listaVisitas;
 }
 
 
}

