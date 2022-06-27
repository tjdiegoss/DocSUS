
package br.com.tjdiego.docsus.Dados;

/**
 *
 * @author Diego
 */
package Dados;
import Negocio.Horario;
import java.util.ArrayList;
import java.util.List;
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
