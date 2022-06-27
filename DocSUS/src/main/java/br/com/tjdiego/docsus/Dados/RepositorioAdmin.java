
package br.com.tjdiego.docsus.Dados;

/**
 *
 * @author Diego
 */
package Dados;
import Negocio.Administrador;
import java.util.ArrayList;
import java.util.List;
public class RepositorioAdmin {
 //Cria um ArrayList do tipo Administrador
 private List<Administrador> listaAdmin = new ArrayList<Administrador>();
 //Método construtor
 public RepositorioAdmin() {
 }
//Método que retorna a lista do tipo Administrador
 public List<Administrador> getAdmin(){
 return listaAdmin;
 }
}
RepositorioAgentes
package Dados;
import java.util.ArrayList;
import Negocio.Agente;
import java.util.List;
public class RepositorioAgentes {
 //Cria um ArrayList do tipo Agente
 private List<Agente> listaAgentes = new ArrayList<Agente>();
 //Método construtor
 public RepositorioAgentes() {
 }
//Método que retorna a lista do tipo Agente
 public List<Agente> getListaAgentes() {
 return listaAgentes;
 }
}