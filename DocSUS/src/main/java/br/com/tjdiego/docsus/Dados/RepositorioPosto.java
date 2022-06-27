
package br.com.tjdiego.docsus.Dados;

/**
 *
 * @author Diego
 */
package Dados;
import Negocio.PostoSaude;
import java.util.ArrayList;
public class RepositorioPosto {
 //Cria uma lista de objetos do tipo Posto
 private ArrayList<PostoSaude> listaPosto = new ArrayList<PostoSaude>();
 //Método construtor
 public RepositorioPosto() {
 }
 //Retorna a lista de objetos do tipo Posto
 public ArrayList<PostoSaude> getPosto(){
 return listaPosto;
 }
}

