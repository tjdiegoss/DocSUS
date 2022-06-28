
package br.com.tjdiego.docsus.Dados;

import br.com.tjdiego.docsus.Negocio.Receita;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diego
 */


public class RepositorioReceitas {
    
 private List<Receita> listaReceitas = new ArrayList<Receita>();
 
 public RepositorioReceitas(){
 
 }
 
 public List<Receita> getListaReceitas(){
     
 return listaReceitas;
 
 }
}

