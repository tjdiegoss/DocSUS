
package br.com.tjdiego.docsus.Dados;

/**
 *
 * @author Diego
 */
package Dados;
import Negocio.Paciente;
import java.util.ArrayList;
import java.util.List;
public class RepositorioPacientes {
 //Cria uma lista de objetos do tipo Paciente
 private List<Paciente> listaPacientes = new ArrayList<Paciente>();
 //Método construtor
 public RepositorioPacientes() {
 }
 //Método que retorna a lista de objetos do tipo Paciente
 public List<Paciente> getListaPacientes() {
 return listaPacientes;
 } 
}

