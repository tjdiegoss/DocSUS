
package br.com.tjdiego.docsus.Dados;

import br.com.tjdiego.docsus.Negocio.Consulta;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diego
 */

        
public class RepositorioConsultas {
 //Cria um ArrayList do tipo Consulta
 private List<Consulta> listaConsultas = new ArrayList<Consulta>();
 //Método construtor
 public RepositorioConsultas() {
 }
//Método que retorna a lista de objetos do tipo Consulta
 public List<Consulta>getListaConsultas(){
 return listaConsultas;
 }
}


