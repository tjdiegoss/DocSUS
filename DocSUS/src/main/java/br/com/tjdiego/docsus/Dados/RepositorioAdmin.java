
package br.com.tjdiego.docsus.Dados;


import br.com.tjdiego.docsus.Negocio.Administrador;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Diego
 */




public class RepositorioAdmin {
 //Cria um ArrayList do tipo Administrador
    
    private List<Administrador> listaAdmin = new ArrayList<>();
 
 //Método construtor
 public RepositorioAdmin() {
 }
//Método que retorna a lista do tipo Administrador
 public List<Administrador> getAdmin(){
 
     return listaAdmin;
 }
 
}
