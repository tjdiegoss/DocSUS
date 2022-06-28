
package br.com.tjdiego.docsus.Dados;

import br.com.tjdiego.docsus.Negocio.Horario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diego
 */


public class RepositorioHorarios {
 //Cria uma lista de objetos do tipo Horario
 private List<Horario> listaHorario = new ArrayList<Horario>();
 //Método construtor
 public RepositorioHorarios() {
 }
 //Método que retorna a lista do tipo Horário
 public List<Horario> getListaHorario() {
 return listaHorario;
 }
}
