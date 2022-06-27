
package br.com.tjdiego.docsus.Dados;

/**
 *
 * @author Diego
 */
package Dados;
import Negocio.Consulta;
import java.util.ArrayList;
import java.util.List;
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
RepositorioDentistas
package Dados;
import java.util.ArrayList;
import Negocio.Dentista;
import java.util.List;
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
