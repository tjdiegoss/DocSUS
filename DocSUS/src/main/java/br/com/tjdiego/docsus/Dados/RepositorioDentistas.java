
package br.com.tjdiego.docsus.Dados;

import br.com.tjdiego.docsus.Negocio.Dentista;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diego
 */
public class RepositorioDentistas {
 //Cria um ArrayList de objetos do tipo Dentista
 public List<Dentista> listaDentistas = new ArrayList<Dentista>();
 //Método construtor
 public RepositorioDentistas() {
 }
 //Método que retorna uma lista de objetos do tipo Dentista
 public List<Dentista> getListaDentistas() {
return listaDentistas;
 }
}

