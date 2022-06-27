
package br.com.tjdiego.docsus.Dados;

/**
 *
 * @author Diego
 */
package Dados;
import Negocio.Receita;
import java.util.ArrayList;
import java.util.List;
public class RepositorioReceitas {
 private List<Receita> listaReceitas = new ArrayList<Receita>();
 public RepositorioReceitas(){}
 public List<Receita> getListaReceitas(){
 return listaReceitas;
 }
}

